package com.prince.employee.service.service;

import com.prince.employee.service.entity.Employee;
import com.prince.employee.service.entity.enumerations.Genre;
import com.prince.employee.service.entity.enumerations.Site;

import java.util.List;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);
    Employee getOneEmployee(Long employeeId);
    List<Employee> getAllEmployees();
    List<Employee> getAllEmployeeByGenre(Genre genre);
    List<Employee> getAllEmployeeByAssignmentSite(Site assignmentSite);

}
