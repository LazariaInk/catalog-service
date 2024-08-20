package com.lazaria.catalog_service.controller;

import com.lazaria.catalog_service.model.Brand;
import com.lazaria.catalog_service.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BrandController {
    @Autowired
    private BrandService brandService;

    @GetMapping("/brand/all")
    public List<Brand> getAllBrands() {
        return brandService.getAllBrands();
    }

    @GetMapping("/brand/{id}")
    public Brand getBrandById(@PathVariable long id){
        return brandService.getBrandById(id);
    }


    //ACESTE METODE LE VOM FOLOSI CAND VOM AVEA FRONT END
    @PostMapping("/brand/create")
    public void createBrand(Brand brand){
        brandService.createBrand(brand);
    }

    @DeleteMapping("/brand/delete/{id}")
    public void deleteBrandById(@PathVariable long id){
        brandService.deleteBrandById(id);
    }

    @PutMapping("/brand/edit/{id}")
    public void editBrand(@PathVariable long id, Brand brand){
        brandService.editBrand(id,brand);
    }
}
