package com.example.Material_Mitra.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Material name is required")
    private String materialName;

    @NotBlank(message = "Category is required")
    private String category;

    @Positive(message = "Price must be greater than 0")
    private double price;

    @NotBlank(message = "Unit is required")
    private String unit;

    @Min(value = 0, message = "Available stock can't be negative")
    private int availableStock;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMaterialName() {
		return materialName;
	}

	public void setMaterialName(String materialName) {
		this.materialName = materialName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public int getAvailableStock() {
		return availableStock;
	}

	public void setAvailableStock(int availableStock) {
		this.availableStock = availableStock;
	}

    
}
