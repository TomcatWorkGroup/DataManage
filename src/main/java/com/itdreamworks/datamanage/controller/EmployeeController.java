package com.itdreamworks.datamanage.controller;

import com.itdreamworks.datamanage.entity.Employee;
import com.itdreamworks.datamanage.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeMapper mapper;

    @GetMapping(value = "/employee/list")
    public List<Employee> getAll() {
        return mapper.findAll();
    }

    @PostMapping(value = "/employee/create")
    public boolean create(Employee employee) {
        return mapper.addEmployee(employee) > 0;
    }

    @PostMapping(value = "/employee/modify")
    public boolean modifyEmployee(Employee employee) {
        return mapper.modifyEmployee(employee) > 0;
    }

    @PostMapping(value = "/employee/change")
    public boolean modifyEmployeeStatus(Employee employee) {
        return mapper.changeEmployeeStatus(employee) > 0;
    }
}
