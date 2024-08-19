package com.fabricadecoduri.shop_online.repository;

import com.fabricadecoduri.shop_online.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends JpaRepository<Model,Long> { }
