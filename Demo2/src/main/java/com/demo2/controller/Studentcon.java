package com.demo2.controller;


import com.demo2.model.Student;
import com.demo2.service.StudentService;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class Studentcon {

    @Resource
    private StudentService service;

    @RequestMapping("/student")
    @ResponseBody
    public String queryStudent(Integer id){
        Student student = service.queryStudent(id);
        return student.toString();
    }
}
