package com.springboot.test.cache.service;

import com.springboot.test.cache.bean.Employee;
import com.springboot.test.cache.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    //Service
    public Employee getEmp(Integer id){
        System.out.println("查询"+id+"Employee");
        Employee emp=employeeMapper.getEmpById(id);
        return emp;
    }
}
