package com.prince.inventory.material.service.app.service;

import com.prince.inventory.material.service.app.entity.Material;
import com.prince.inventory.material.service.app.entity.enumerations.Category;
import com.prince.inventory.material.service.app.entity.enumerations.Status;
import com.prince.inventory.material.service.app.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class MaterialServiceImpl implements  MaterialService{


    @Autowired
    private MaterialRepository materialRepository;


    @Override
    public Material saveMaterial(Material material) {
        return materialRepository.save(material);
    }

    @Override
    public List<Material> saveAllMaterials(List<Material> materials) {
        return null;
    }

    @Override
    public void deleteMaterial(Long materialId) {
        Optional<Material> optionalMaterial =
                materialRepository.findById(materialId);
        if(optionalMaterial.isEmpty())
            throw  new RuntimeException("Material not found");
        materialRepository.deleteById(materialId);
        System.out.println("Material with ID : "+materialId+" has been deleted");
    }

    @Override
    public Material editMaterial(Long materialId) {
        return null;
    }

    @Override
    public Material getOneMaterial(Long materialId) {

        Optional<Material> optionalMaterial =
                materialRepository.findById(materialId);
        if (optionalMaterial.isEmpty())
            throw new RuntimeException("Material Not Found");
        return optionalMaterial.get();
    }

    @Override
    public List<Material> getAllMaterials() {
        return materialRepository.findAll();
    }

    @Override
    public List<Material> getAllMaterialsByCategory(Category category) {
        return materialRepository.findMaterialByCategory(category);
    }

    @Override
    public List<Material> getAllMaterialByStatus(Status status) {
        return materialRepository.findMaterialByStatus(status);
    }
}
