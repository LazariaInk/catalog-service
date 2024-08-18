package com.fabricadecoduri.shop_online.repository;

import com.fabricadecoduri.shop_online.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository  extends JpaRepository<Product, Long> {}
