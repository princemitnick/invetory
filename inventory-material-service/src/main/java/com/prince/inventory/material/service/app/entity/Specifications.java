package com.prince.inventory.material.service.app.entity;


import com.prince.inventory.material.service.app.entity.enumerations.StorageType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class Specifications {

    private BigDecimal ramCapacity;
    private String cpuDescription;
    private StorageType storageType;



}
