package com.mybatisni.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class ctrltest {


    @GetMapping("/student/{stuId}")
    public String queryStudent(@PathVariable(value = "stuId") Integer stuId){
        return "查询学生"+stuId;

    }

    @PostMapping("/student/{name}/{age}")
    public String createStudent(@PathVariable("name") String name,
                                @PathVariable("age") Integer age){
        return "创建学生"+name+age;

    }

}
