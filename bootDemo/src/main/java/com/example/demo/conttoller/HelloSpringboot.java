package com.example.demo.conttoller;


import com.example.demo.vo.Schoolinfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class HelloSpringboot {
    @RequestMapping("/demo")
    @ResponseBody
    public String hello() {
        return "换收割机3加快速度VB";
    }

//    @Value("${server.port}")
//    private Integer port;
//
//    @Value("${server.servlet.context-path}")
//    private String path;
//
//    @Value("${school.name}")
//    private String name;
//
//    @RequestMapping("/data")
//    @ResponseBody
//    public String getdata(){
//        return name+ port+ path;
//    }

    @Resource
    private Schoolinfo info;

    @RequestMapping("/school")
    @ResponseBody
    public String getschool() {
        return info.toString();
    }

    @RequestMapping("/dev/acc")
    @ResponseBody
    public String userAcc() {
        return "我访问/acc";
    }

    @RequestMapping("/dev/login")
    @ResponseBody
    public String userLogin() {
        return "我访问/logon";
    }

    @RequestMapping("/user/fer")
    @ResponseBody
    public String userfer() {
        return "user/fer";
    }

    @RequestMapping("/admin/fer")
    @ResponseBody
    public String adminfer() {
        return "admin/fer";
    }

}

