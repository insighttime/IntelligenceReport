package com.lightinit.economicinformation.impl;

import com.aliyuncs.exceptions.ClientException;
import com.lightinit.economicinformation.entity.SysUser;
import com.lightinit.economicinformation.entity.SysUserExample;
import com.lightinit.economicinformation.entity.SysVerificationCode;
import com.lightinit.economicinformation.entity.SysVerificationCodeExample;
import com.lightinit.economicinformation.mapper.mapper1.SysUserMapper;
import com.lightinit.economicinformation.mapper.mapper1.SysVerificationCodeMapper;
import com.lightinit.economicinformation.model.LoginModel;
import com.lightinit.economicinformation.model.RegisterModel;
import com.lightinit.economicinformation.utils.Result;
import com.lightinit.economicinformation.utils.SendSms;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.servlet.http.HttpSession;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class ToLoginImpl {
    @Autowired
    private SysUserMapper userMapper;
    @Autowired
    private SysVerificationCodeMapper verificationCodeMapper;
    public Result getCode(String phone) throws ClientException {
        Result result = new Result();
        Date date = new Date();
        SysUserExample example = new SysUserExample() ;
        SysUserExample.Criteria criteria = example.createCriteria() ;
        criteria.andUsernameEqualTo(phone) ;
        List<SysUser> existUser = userMapper.selectByExample(example);
        //验证码
        String code = SendSms.sendSms(phone);
        if(code!="fail") {
            if(!(existUser.size()==0)){
                //如果不为空 更新
                SysVerificationCode verificationCode = new SysVerificationCode();
                verificationCode.setId(existUser.get(0).getId());
                verificationCode.setCode(code);
                verificationCode.setUsername(phone);
                verificationCode.setCreatedAt(date);
                verificationCode.setEffectiveTime(date) ;
                Calendar nowTime = Calendar.getInstance();
                nowTime.add(Calendar.MINUTE, 10);
                verificationCode.setExpiredTime(nowTime.getTime());
                verificationCodeMapper.updateByPrimaryKeySelective(verificationCode);
            }else {
                //验证码插入数据库
                SysVerificationCode verificationCode = new SysVerificationCode();
                verificationCode.setCode(code);
                verificationCode.setUsername(phone);
                verificationCode.setCreatedAt(date);
                verificationCode.setEffectiveTime(date) ;
                Calendar nowTime = Calendar.getInstance();
                nowTime.add(Calendar.MINUTE, 10);
                verificationCode.setExpiredTime(nowTime.getTime());
                verificationCodeMapper.insert(verificationCode);

            }
        }else {
            result.setMsg("验证码发送失败");
            result.setDetail(code);
            result.setSuccess(true);
        }

        //先根据code去数据库查询验证码如果有更新，没有插入
        return  result;
    }


    /**
     * 注册
     * @param user 参数封装
     * @return Result
     */
    public Result regist(RegisterModel user) {
        Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);
        Date data = new Date();
        try {
            //查询验证码
            SysVerificationCodeExample example3 = new SysVerificationCodeExample();
            SysVerificationCodeExample.Criteria criteria3 = example3.createCriteria();
            criteria3.andUsernameEqualTo(user.getPhone());
            List<SysVerificationCode> sysVerificationCodes = verificationCodeMapper.selectByExample(example3);
            if (!(sysVerificationCodes.size() > 0)) {
                result.setMsg("未发送验证码！");
                result.setSuccess(false);
                return result;
            }
            SysVerificationCode sysVerificationCode = sysVerificationCodes.get(0);
            if(sysVerificationCode.getCode().equals(user.getCode())) {
                //判断验证码是否有效
                if(data.after(sysVerificationCode.getEffectiveTime()) &&
                        data.before(sysVerificationCode.getExpiredTime())) {
                    SysUserExample example = new SysUserExample() ;
                    SysUserExample.Criteria criteria = example.createCriteria() ;
                    criteria.andUsernameEqualTo(user.getPhone()) ;
                    List<SysUser> existUser = userMapper.selectByExample(example);
                    if(!(existUser.size()==0)){
                        //如果用户名已存在
                        result.setMsg("用户名已存在");
                    }else{
                        //md5加密
                        String pwd = DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
                        user.setPassword(pwd);
                        SysUser sysUser = new SysUser();
                        BeanUtils.copyProperties(user,sysUser);
                        sysUser.setUsername(user.getPhone());
                        sysUser.setUserType(1);//普通用户
                        sysUser.setIsAuth((byte)1);
                        sysUser.setIsBuildin((byte)1);
                        sysUser.setIsLcokedOut((byte)1);
                        userMapper.insert(sysUser);
                        //System.out.println(user.getId());
                        result.setMsg("注册成功");
                        result.setSuccess(true);
                        result.setDetail(user);

                    }
                }else {
                    result.setMsg("验证码已过期");
                    result.setDetail(user);
                }

            }else {
                result.setMsg("验证码不正确");
                result.setDetail(user);
            }

        } catch (Exception e) {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
    /**
     * 登录
     * @param user 用户名和密码
     * @return Result
     */
    public Result login(HttpSession session,LoginModel user) {
        Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);
        try {
            SysUserExample example = new SysUserExample() ;
            SysUserExample.Criteria criteria = example.createCriteria() ;
            //md5加密
            String pwd = DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
            criteria.andUsernameEqualTo(user.getUsername()).andPasswordEqualTo(pwd);
            List<SysUser> existUser = userMapper.selectByExample(example);
            if(null != existUser && !(existUser.size()>0)) {
                result.setMsg("用户名或密码错误");
            }else{
                session.setAttribute("username",user.getUsername());
                result.setMsg("登录成功");
                result.setSuccess(true);
                result.setDetail(user);
            }
        } catch (Exception e) {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }


}
