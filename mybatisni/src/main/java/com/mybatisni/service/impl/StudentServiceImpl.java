package com.mybatisni.service.impl;

import com.mybatisni.dao.StudentMapper;
import com.mybatisni.model.Student;
import com.mybatisni.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Service
public class StudentServiceImpl implements StudentService {
    
    @Resource
    private StudentMapper studentMapper;

    @Transactional
    @Override
    public int addStudent(Student student) {
        System.out.println("业务方法的add");
        int rows = studentMapper.insert(student);
        System.out.println("执行sql");



         return rows;

    }
}