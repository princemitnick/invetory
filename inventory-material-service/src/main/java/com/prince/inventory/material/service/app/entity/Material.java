package com.prince.inventory.material.service.app.entity;

import com.prince.inventory.material.service.app.entity.enumerations.Category;
import com.prince.inventory.material.service.app.entity.enumerations.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Material {

    @Id
    @SequenceGenerator(
            name = "material_sequence",
            sequenceName = "material_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "material_sequence"
    )
    private Long materialId;
    private String modelName;
    private String manufacturer;

    @Column(
            nullable = false
    )
    private String serialNumber;

    @Enumerated(
            EnumType.STRING
    )
    private Category category;

    @Enumerated(
            EnumType.STRING
    )
    private Status status;

    @Embedded
    private Specifications specifications;


}
