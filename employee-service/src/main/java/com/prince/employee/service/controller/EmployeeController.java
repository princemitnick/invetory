package com.prince.employee.service.controller;

import com.prince.employee.service.entity.Employee;
import com.prince.employee.service.entity.enumerations.Genre;
import com.prince.employee.service.entity.enumerations.Site;
import com.prince.employee.service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public Employee saveOneEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/by-site/{site}")
    public List<Employee> getAllEmployeeByAssignmentSite(@PathVariable("site") Site site){
        return employeeService.getAllEmployeeByAssignmentSite(site);
    }

    @GetMapping("/by-genre/{genre}")
    public List<Employee> getAllEmployeeByGenre(@PathVariable("genre") Genre genre){
        return employeeService.getAllEmployeeByGenre(genre);
    }
}
