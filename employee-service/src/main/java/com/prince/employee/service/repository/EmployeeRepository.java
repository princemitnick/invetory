package com.prince.employee.service.repository;

import com.prince.employee.service.entity.Employee;
import com.prince.employee.service.entity.enumerations.Genre;
import com.prince.employee.service.entity.enumerations.Site;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findEmployeeByAssignmentSite(Site assignmentSite);
    List<Employee> findEmployeeByGenre(Genre genre);

}
