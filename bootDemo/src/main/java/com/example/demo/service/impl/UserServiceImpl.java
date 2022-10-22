package com.example.demo.service.impl;

import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;


@Service("UserService")
public class UserServiceImpl implements UserService {
    @Override
    public void saybaibai(String name) {
        System.out.println("对" + name + "say拜拜");
    }
}
