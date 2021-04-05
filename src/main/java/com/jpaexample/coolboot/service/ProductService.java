package com.jpaexample.coolboot.service;

import com.jpaexample.coolboot.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    List<Product> findByCategory(String category);
    Product findById(int theId);
    void save(Product product);
    void deleteById(int theId);
}
