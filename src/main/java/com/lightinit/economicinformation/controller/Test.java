package com.lightinit.economicinformation.controller;

//import com.lightinit.economicinformation.datasourceconfig.DataSource;
import com.lightinit.economicinformation.entity.SysUser;
import com.lightinit.economicinformation.impl.TestImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class Test extends Thread {
    @Autowired
     private TestImpl testimpl;
    @RequestMapping("/")
    public static String index() {
        return "你好";
    }
    @RequestMapping("/getUserList")
    public Object getUserList() {
        return testimpl.getUserList();
    }
//
//    public Object changeDb(DataSource dataSource) {
//        dataSource.setDatabasetype("");
//        return null;
//    }


}
