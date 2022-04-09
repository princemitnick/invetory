package com.prince.employee.service.service;

import com.prince.employee.service.entity.Employee;
import com.prince.employee.service.entity.enumerations.Genre;
import com.prince.employee.service.entity.enumerations.Site;
import com.prince.employee.service.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getOneEmployee(Long employeeId) {
        Optional<Employee> optionalEmployee =
                employeeRepository.findById(employeeId);
        if (optionalEmployee.isEmpty())
            throw new RuntimeException("Employee not found");
        return optionalEmployee.get();
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public List<Employee> getAllEmployeeByGenre(Genre genre) {
        return employeeRepository.findEmployeeByGenre(genre);
    }

    @Override
    public List<Employee> getAllEmployeeByAssignmentSite(Site assignmentSite) {
        return employeeRepository.findEmployeeByAssignmentSite(assignmentSite);
    }
}
