package com.mvc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mvc.mapper.EmployeeMapper;
import com.mvc.pojo.Employee;
import com.mvc.service.EmployeeService;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    public List<Employee> getEmployee() {

        return employeeMapper.getEmployee();
    }

    public PageInfo<Employee> getEmployeePage(Integer pageNum) {
        PageHelper.startPage(pageNum,5);
        List<Employee> list = employeeMapper.getEmployee();
        PageInfo<Employee> pageInfo = new PageInfo<Employee>(list,5);

        return pageInfo;
    }


}
