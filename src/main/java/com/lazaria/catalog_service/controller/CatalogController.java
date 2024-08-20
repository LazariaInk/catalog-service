package com.lazaria.catalog_service.controller;

import com.lazaria.catalog_service.model.Product;
import com.lazaria.catalog_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogController {

    @Autowired
    private ProductService productService;

    @PutMapping("/product/{productId}/add")
    public void addSpecificProduct(@PathVariable long productId, @RequestParam int quantity){
        productService.addSpecificProduct(productId, quantity);
    }

    @PutMapping("/product/{productId}/buy")
    public double addProductToCart(@PathVariable long id, Product product, @RequestParam int quantity) {
        return productService.buyProduct(id,product, quantity);
    }
}
