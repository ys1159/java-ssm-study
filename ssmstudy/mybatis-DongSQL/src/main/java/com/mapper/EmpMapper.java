package com.mapper;

import com.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {
   List<Emp> selectEmp(Emp emp);
   //list为键
   void insertMoreEmp(@Param("emps") List<Emp> list);
   //array为键
   void deleteMoreEmp(@Param("empIds") Integer[] empIds);
}

