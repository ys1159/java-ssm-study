package com.demo2.Dao;

import com.demo2.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


public interface StudentDao {
    Student selectById(@Param("stuId") Integer id);
}
