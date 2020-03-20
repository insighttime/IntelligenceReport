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
    public Test(String name) {
        super(name);// 给线程名字赋值
    }
    //
   static int aa = 10;
    static Object ob = "s";
    public void  run () {


            while (aa>0) {
//                synchronized (ob){
                    String mssg ="";
                    Date date = new Date();
                    SimpleDateFormat sim = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss.SSS");
                    mssg+="["+sim.format(date)+"]";
//                    if(aa==10) {
//                        System.out.println(mssg);
//                    }
//                    if(aa==1) {
//                        System.out.println(mssg);
//                    }
                    System.out.println(getName()+aa);
                    aa--;
                }

//            }
        try {
            sleep(1000);//休息一秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
    public static void main(String[] args) {
        Test test = new Test("aa");
        Test test2 = new Test("bb");
        Test test3 = new Test("cc");
        test.run();
        test2.run();
        test3.run();
    }

}
