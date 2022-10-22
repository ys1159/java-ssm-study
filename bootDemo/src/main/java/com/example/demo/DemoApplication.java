package com.example.demo;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
//        ConfigurableApplicationContext ctx=SpringApplication.run(DemoApplication.class, args);
//        UserService userService=(UserService) ctx.getBean("UserService");
//        userService.saybaibai("杨嵩");

    }

}
