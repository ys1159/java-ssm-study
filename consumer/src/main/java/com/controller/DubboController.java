package com.controller;


import model.Student;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.StudentService;

@RestController
public class DubboController {

    @DubboReference(interfaceClass = StudentService.class,version = "1.0.0")
    private StudentService service;

    @GetMapping("/query")
    public String queryStudent(){
        Student student = service.queryStudent(1001);
        return "调用远程接口，获取对象"+student;
    }
}
