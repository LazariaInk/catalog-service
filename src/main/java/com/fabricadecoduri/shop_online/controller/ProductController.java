package com.fabricadecoduri.shop_online.controller;

import com.fabricadecoduri.shop_online.model.Product;
import com.fabricadecoduri.shop_online.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/product/{id}")
    public Product getProductMyId(@PathVariable long id) {
        return productService.getProductById(id);
    }

    @GetMapping("/product/all")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("/product/add")
    public void addProduct(Product product) {
        productService.addProduct(product);
    }

    @DeleteMapping("/product/delete{id}")
    public void deleteProductById(@PathVariable long id) {
        productService.deleteProductById(id);
    }

    @PutMapping("/product/edit{id}")
    public void editProductById(Product product, @PathVariable long id) {
        productService.editProductById(product, id);

    }
}
