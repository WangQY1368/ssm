package com.atguigu.ssm.mapper;


import com.atguigu.ssm.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {

    /*查询所有员工的信息*/
    List<Employee> getAllEmployee();
}
