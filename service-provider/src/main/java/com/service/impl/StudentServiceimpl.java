package com.service.impl;

import model.Student;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;
import service.StudentService;


@Component
@DubboService(interfaceClass = StudentService.class,version =" 1.0.0")
public class StudentServiceimpl implements StudentService {
    @Override
    public Student queryStudent(Integer id) {
        Student student=new Student();
        if (1001==id){
            student.setId(1001);
            student.setName("1001-ys");
            student.setAge(20);
        }else if (1002==id){
            student.setId(1002);
            student.setName("1002-zs");
            student.setAge(30);
        }
        return student;
    }
}
