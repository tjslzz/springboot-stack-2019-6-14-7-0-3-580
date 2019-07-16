package com.tw.apistackbase.controller;

import com.tw.apistackbase.Model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeesController {

    @GetMapping
    public List<Employee> getAllEmployee(){
        return Employee.forTestEmployee();
    }

    @PostMapping
    public List<Employee> addEmployee(@RequestBody Employee employee){
        List<Employee> employees = Employee.forTestEmployee();
        employees.add(employee);
        return employees;
    }
}
