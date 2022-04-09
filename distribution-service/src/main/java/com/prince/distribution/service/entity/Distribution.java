package com.prince.distribution.service.entity;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Distribution {

    @Id
    @SequenceGenerator(
            sequenceName = "distribution_sequence",
            name = "distribution_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "distribution_sequence"
    )
    private Long distributionId;

    @Column(
            nullable = false
    )
    private String employeeCode;

    private Long materialId;

    @Column(
            nullable = false,
            updatable = false
    )
    private String distributorCode;

    private String delivererCode;

    @Column(
            nullable = false,
            updatable = false
    )
    private LocalDate distributionDate;

}
