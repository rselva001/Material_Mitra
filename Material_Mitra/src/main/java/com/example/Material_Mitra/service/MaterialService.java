package com.example.Material_Mitra.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Material_Mitra.entity.Material;
import com.example.Material_Mitra.repository.MaterialRepository;

@Service
public class MaterialService {
    @Autowired
    private MaterialRepository repo;

    public Material addMaterial(Material material) {
        return repo.save(material);
    }

    public List<Material> getAllMaterials() {
        return repo.findAll();
    }
}
