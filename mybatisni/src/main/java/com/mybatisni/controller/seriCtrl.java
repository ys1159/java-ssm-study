package com.mybatisni.controller;


import com.mybatisni.model.Student;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class seriCtrl {

    @Resource
    private RedisTemplate redisTemplate;


    //json序列化
    @PostMapping("/redis/json")
    public String addjson(){
        Student student = new Student();
        student.setId(1002);
        student.setName("望海");
        student.setAge(17);
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<>(Student.class));
        redisTemplate.opsForValue().set("mystudent",student);
        return "json序列化";
    }
    //json反序列化
    @PostMapping("/redis/nojson")
    public String getjson(){

        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<>(Student.class));
        Object mystudent = redisTemplate.opsForValue().get("mystudent");
        return "json反序列化"+mystudent;

    }
}
