package com.prince.employee.service.entity;


import com.prince.employee.service.entity.enumerations.Genre;
import com.prince.employee.service.entity.enumerations.Site;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

    @Id
    @SequenceGenerator(
            name = "employee_sequence",
            sequenceName = "employee_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employee_sequence"
    )
    private Long employeeId;

    @Column(
            nullable = false,
            unique = true,
            updatable = false
    )
    private String employeeCode;
    private String lastName;
    private String firstName;
    private String CIN;
    private String NIF;
    private LocalDate dob;
    private String function;
    private LocalDate hiringDate;
    private String address;
    private String telephone;

    @Enumerated(
            EnumType.STRING
    )
    private Genre genre;

    @Enumerated(
            EnumType.STRING
    )
    private Site assignmentSite;

    private String email;
}
