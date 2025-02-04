package com.tw.apistackbase.controller;

import com.tw.apistackbase.Model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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

    @DeleteMapping
    public List<Employee> delEmployee(@RequestParam int id){
        List<Employee> employees = Employee.forTestEmployee();
        employees.remove(id);
        return employees;
    }

    @PutMapping
    public List<Employee> putEmployee(@RequestBody Employee employee){
        List<Employee> employees = Employee.forTestEmployee();
        return employees.stream().map(e -> e.getId() == employee.getId()?employee:e).collect(Collectors.toList());
    }
}
