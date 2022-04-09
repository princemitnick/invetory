package com.prince.employee.service.repository;

import com.netflix.discovery.converters.Auto;
import com.prince.employee.service.entity.Employee;
import com.prince.employee.service.entity.enumerations.Genre;
import com.prince.employee.service.entity.enumerations.Site;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void saveEmploye(){

        Employee employee =
                Employee.
                        builder()
                        .email("prstanley@pih.org")
                        .function("Analyste Programmeur")
                        .firstName("Prince Stanley")
                        .lastName("Jean Baptiste")
                        .dob(
                                LocalDate.of(1992, 1, 4)
                        )
                        .employeeCode("ZL-003432")
                        .address("Domond, Rte Nle #3")
                        .CIN("09-02-94-1992-39-94")
                        .NIF("122-4543-122")
                        .hiringDate(
                                LocalDate.of(2016,9,16)
                        )
                        .assignmentSite(Site.CROSS_SITE)
                        .genre(Genre.MALE)
                        .telephone("4353-1042")
                        .build();

        employeeRepository.save(employee);
        System.out.println(employee + "saved");
    }
}