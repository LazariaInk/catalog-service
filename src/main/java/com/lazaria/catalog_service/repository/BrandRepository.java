package com.lazaria.catalog_service.repository;

import com.lazaria.catalog_service.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  BrandRepository extends JpaRepository<Brand, Long> {}
