package com.fabricadecoduri.shop_online.repository;

import com.fabricadecoduri.shop_online.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  BrandRepository extends JpaRepository<Brand, Long> {}
