package com.prince.inventory.material.service.app.service;

import com.prince.inventory.material.service.app.entity.Material;
import com.prince.inventory.material.service.app.entity.enumerations.Category;
import com.prince.inventory.material.service.app.entity.enumerations.Status;

import java.util.List;

public interface MaterialService {

    Material saveMaterial(Material material);
    List<Material> saveAllMaterials(List<Material> materials);
    void deleteMaterial(Long materialId);
    Material editMaterial(Long materialId);
    Material getOneMaterial(Long materialId);
    List<Material> getAllMaterials();
    List<Material> getAllMaterialsByCategory(Category category);
    List<Material> getAllMaterialByStatus(Status status);

}
