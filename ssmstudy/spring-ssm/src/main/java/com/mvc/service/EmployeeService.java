package com.mvc.service;

import com.github.pagehelper.PageInfo;
import com.mvc.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployee();


    PageInfo<Employee> getEmployeePage(Integer pageNum);
}
