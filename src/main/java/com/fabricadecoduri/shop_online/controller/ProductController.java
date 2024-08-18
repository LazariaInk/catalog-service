package com.fabricadecoduri.shop_online.controller;

import com.fabricadecoduri.shop_online.model.Product;
import com.fabricadecoduri.shop_online.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product/all")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable long id) {
        return productService.getProductById(id);
    }

    @DeleteMapping("/product/delete/{id}")
    public void deleteProductById(@PathVariable long id) {
        productService.deleteProductById(id);
    }

    @PostMapping("/product/create")
    public void createProduct(Product product) {
        productService.createProduct(product);
    }

    @PutMapping("/product/edit/{id}")
    public void editProduct(@PathVariable long id, Product product) {
        productService.editProductById(id, product);
    }
}