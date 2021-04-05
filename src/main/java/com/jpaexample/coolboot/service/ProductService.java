package com.jpaexample.coolboot.service;

import com.jpaexample.coolboot.entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> findAll();
    public List<Product> findByCategory(String category);
    public Product findById(int theId);
    public void save(Product product);
    public void deleteById(int theId);
}
