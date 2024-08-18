package com.fabricadecoduri.shop_online.service;

import com.fabricadecoduri.shop_online.model.Product;
import com.fabricadecoduri.shop_online.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product getProductById(Long id){
        return  productRepository.getReferenceById(id);
    }

    public void createProduct(Product product){
        productRepository.save(product);
    }

    public void deleteProductById(Long id){
        productRepository.deleteById(id);
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public void editProductById( Long id, Product product){
        Product productToId = productRepository.getReferenceById(id);
        productToId.setBrand(product.getBrand());
        productToId.setName(product.getName());
        productToId.setPrice(product.getPrice());
        productToId.setCategory(product.getCategory());
        productToId.setQuantity(product.getQuantity());
    }
}
