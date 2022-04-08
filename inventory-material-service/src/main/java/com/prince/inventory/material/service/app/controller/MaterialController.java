package com.prince.inventory.material.service.app.controller;

import com.prince.inventory.material.service.app.entity.Material;
import com.prince.inventory.material.service.app.entity.enumerations.Category;
import com.prince.inventory.material.service.app.entity.enumerations.Status;
import com.prince.inventory.material.service.app.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/materials")
public class MaterialController {

    @Autowired
    private MaterialService materialService;

    @PostMapping("/save")
    public Material createMaterial(@RequestBody Material material){
        return materialService.saveMaterial(material);
    }

    @GetMapping
    public List<Material> getAllMaterial(){
        return materialService.getAllMaterials();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMaterial(@PathVariable("id") Long materialId){
        materialService.deleteMaterial(materialId);
        return "Material "+materialId+" has been deleted";
    }

    @GetMapping("/status/{status}")
    public List<Material> getMaterialByStatus(@PathVariable("status") Status status){
        return materialService.getAllMaterialByStatus(status);
    }

    @GetMapping("/category/{category}")
    public List<Material> getMaterialByCategory(@PathVariable("category")Category category){
        return materialService.getAllMaterialsByCategory(category);
    }

    @GetMapping("/one/{id}")
    public Material getOneMaterial(@PathVariable("id") Long materialId){
        return materialService.getOneMaterial(materialId);
    }
}
