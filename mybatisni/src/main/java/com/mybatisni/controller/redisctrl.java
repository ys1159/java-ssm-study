package com.mybatisni.controller;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class redisctrl {

    @Resource
    private RedisTemplate redisTemplate;

    @PostMapping("/redis/add")
    public String add(String name,String value){
        //添加数据
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set("myname", "原神");
        return "向redis添加数据";
    }

    @GetMapping("/redis/get")
    public String getdata(String k){

        ValueOperations valueOperations = redisTemplate.opsForValue();
        Object o = valueOperations.get(k);
        return "key"+k+"value"+o;

    }
}
