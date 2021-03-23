package com.jpaexample.coolboot.dao;

import com.jpaexample.coolboot.entity.Product;

import java.util.List;

public interface ProductDAO {
    public List<Product> findAll();

    public Product findById(int theId);

    public void save(Product product);

    public void deleteById(int theId);
}
