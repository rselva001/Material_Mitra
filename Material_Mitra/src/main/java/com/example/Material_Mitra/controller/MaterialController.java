package com.example.Material_Mitra.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Material_Mitra.entity.Material;
import com.example.Material_Mitra.service.MaterialService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/materials")
public class MaterialController {

    @Autowired
    private MaterialService service;

    @PostMapping
    public ResponseEntity<Material> addMaterial(@Valid @RequestBody Material material) {
        return ResponseEntity.ok(service.addMaterial(material));
    }

    @GetMapping
    public ResponseEntity<List<Material>> getMaterials() {
        return ResponseEntity.ok(service.getAllMaterials());
    }
}
