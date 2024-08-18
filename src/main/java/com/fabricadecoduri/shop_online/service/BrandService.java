package com.fabricadecoduri.shop_online.service;

import com.fabricadecoduri.shop_online.model.Brand;
import com.fabricadecoduri.shop_online.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {

    @Autowired
    private BrandRepository brandRepository;

    public Brand getBrandById(Long id){
        return brandRepository.getReferenceById(id);
    }

    public void createBrand(Brand brand) {
        brandRepository.save(brand);
    }

    public void deleteBrandById(Long id) {
        brandRepository.deleteById(id);
    }

    public List<Brand> getAllBrands(){
        return brandRepository.findAll();
    }

    public void editBrand(long id, Brand brand) {
        Brand brandToId = brandRepository.getReferenceById(id);
        brandToId.setName(brand.getName());
        brandToId.setDescription(brand.getDescription());
    }
}
