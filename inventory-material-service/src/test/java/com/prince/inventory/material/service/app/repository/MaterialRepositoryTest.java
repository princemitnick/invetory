package com.prince.inventory.material.service.app.repository;

import com.prince.inventory.material.service.app.entity.Material;
import com.prince.inventory.material.service.app.entity.Specifications;
import com.prince.inventory.material.service.app.entity.enumerations.Category;
import com.prince.inventory.material.service.app.entity.enumerations.Status;
import com.prince.inventory.material.service.app.entity.enumerations.StorageType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MaterialRepositoryTest {

    @Autowired
    private MaterialRepository materialRepository;

    @Test
    public void saveMaterial(){

        Material material = Material.
                builder()
                .manufacturer("HP")
                .serialNumber("92341232")
                .modelName("E14")
                .status(Status.BRAND_NEW)
                .category(Category.LAPTOP)
                .specifications(
                        Specifications
                                .builder()
                                .ramCapacity(BigDecimal.valueOf(4096))
                                .cpuDescription("Core i5 - @ 3.2 GHZ")
                                .storageType(StorageType.SSD)
                                .storageCapacity(BigDecimal.valueOf(25432453))
                                .build()
                )
                .build();

        materialRepository.save(material);

        System.out.println(material);
    }

}