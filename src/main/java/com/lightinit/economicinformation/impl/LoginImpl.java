package com.lightinit.economicinformation.impl;

import com.lightinit.economicinformation.entity.SysUser;
import com.lightinit.economicinformation.entity.SysUserExample;
import com.lightinit.economicinformation.mapper.mapper1.SysUserMapper;
import com.lightinit.economicinformation.model.LoginModel;
import com.lightinit.economicinformation.model.RegisterModel;
import com.lightinit.economicinformation.utils.Result;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class LoginImpl {
    @Autowired
    private SysUserMapper userMapper;

    /**
     * 注册
     * @param user 参数封装
     * @return Result
     */
    public Result regist(RegisterModel user) {
        Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);
        try {
            SysUserExample example = new SysUserExample() ;
            SysUserExample.Criteria criteria = example.createCriteria() ;
            criteria.andUsernameEqualTo(user.getUsername()) ;
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
