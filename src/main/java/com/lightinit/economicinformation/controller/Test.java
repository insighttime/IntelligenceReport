package com.lightinit.economicinformation.controller;

import com.lightinit.economicinformation.impl.TestImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @Autowired
     private TestImpl testimpl;
    @RequestMapping("/")
    public static String index() {
        return "你好";
    }
//    @RequestMapping("/getUserList")
//    public String getUserList() {
//
//    }
    @RequestMapping("/getUserList")
    public Object getUserList() {
        return testimpl.getUserList();
    }
}
