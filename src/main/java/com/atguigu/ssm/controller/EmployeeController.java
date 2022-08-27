package com.atguigu.ssm.controller;

import com.atguigu.ssm.pojo.Employee;
import com.atguigu.ssm.service.EmployeeService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping(value = "/employee/page/{pageNum}", method =
            RequestMethod.GET)
    public String getEmployeeList(Model model, @PathVariable("pageNum") Integer pageNum){
        PageInfo<Employee> page = employeeService.getEmployeePage(pageNum);
        model.addAttribute("page", page);
        return "employee_list";
    }



    /*@RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String getAllEmployee(Model model){
        *//*查询所有的员工信息*//*
        List<Employee> list = employeeService.getAllEmployee();
        model.addAttribute("list", list);
        //跳转到employee_list.html
        return "employee_list";
    }*/
}



