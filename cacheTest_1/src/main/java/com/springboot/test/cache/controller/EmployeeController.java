package com.springboot.test.cache.controller;

import com.springboot.test.cache.bean.Employee;
import com.springboot.test.cache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("emp/{id}")
    public Employee getEmployee(@PathVariable("id") Integer id){
        Employee employee=employeeService.getEmp(id);
        return employee;
    }

}
