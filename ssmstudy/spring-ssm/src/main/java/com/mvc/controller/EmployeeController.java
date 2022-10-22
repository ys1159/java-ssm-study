package com.mvc.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.mvc.pojo.Employee;
import com.mvc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public String getEmployee(Model model){

       List<Employee> list =employeeService.getEmployee();
       model.addAttribute("list",list);
       return "employee_list";
    }

    @RequestMapping(value = "/employee/page/{pageNum}",method = RequestMethod.GET)
    public String getEmployeePage(Model model,@PathVariable("pageNum") Integer pageNum){
        PageInfo<Employee> page=employeeService.getEmployeePage(pageNum);
        model.addAttribute("page",page);
        return "employee_list";

    }

}
