package com.prince.inventory.material.service.app.repository;

import com.prince.inventory.material.service.app.entity.Material;
import com.prince.inventory.material.service.app.entity.enumerations.Category;
import com.prince.inventory.material.service.app.entity.enumerations.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Long> {

    List<Material> findMaterialByCategory(Category category);
    List<Material> findMaterialByStatus(Status status);
}
