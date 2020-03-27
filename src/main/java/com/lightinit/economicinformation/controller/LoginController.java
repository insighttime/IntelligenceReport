package com.lightinit.economicinformation.controller;

import com.aliyuncs.exceptions.ClientException;
import com.lightinit.economicinformation.impl.ToLoginImpl;
import com.lightinit.economicinformation.model.LoginModel;
import com.lightinit.economicinformation.model.RegisterModel;
import com.lightinit.economicinformation.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class LoginController {
    @Autowired
    private ToLoginImpl loginimpl;

    @GetMapping("/")
    public String index() {
        return "login";
    }

    /**
     * 欢迎页
     * @return
     */
    @GetMapping("/index")
    public String welcome() {
        return "index";

    }
    @PostMapping(value = "/getCode")
    @ResponseBody
    public Result getCode(HttpSession session,String phone) throws ClientException {
        Result result = loginimpl.getCode(phone);
        return  result;
    }

    @PostMapping(value = "/regist")
    @ResponseBody
    public Result regist(RegisterModel user){
        return loginimpl.regist(user);
    }
    /**
     * 登录
     * @param user 参数封装
     * @return Result
     */
    @PostMapping(value = "/login")
    @ResponseBody
    public Result login(HttpSession session,LoginModel user) {
        return loginimpl.login(session,user);
    }




}
