package com.springboot.test;

import com.springboot.test.cache.bean.Employee;
import com.springboot.test.cache.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
class TestApplicationTests {
    @Autowired
    EmployeeMapper employeeMapper;

    @Test
    void contextLoads() {
        Employee empById=employeeMapper.getEmpById(1);
        System.out.println(empById);
    }

}
