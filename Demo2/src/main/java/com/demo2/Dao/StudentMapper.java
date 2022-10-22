package com.demo2.dao;

import com.demo2.model.Student;

public interface StudentMapper {
    int insert(Student record);

    int insertSelective(Student record);
}