package com.mybatisni.controller;

import com.mybatisni.model.Student;
import com.mybatisni.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class ctrl {

    @Resource
    private StudentService service;

    @RequestMapping("/add")
    @ResponseBody
    public String addStudent(Integer id,String name,Integer age){
        Student student=new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        int rows = service.addStudent(student);
        return "添加学生"+rows;
    }



}
