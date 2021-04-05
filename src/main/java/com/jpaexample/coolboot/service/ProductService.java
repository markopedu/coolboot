package com.jpaexample.coolboot.service;

import com.jpaexample.coolboot.entity.Product;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public interface ProductService {
    List<Product> findAll();
    CompletableFuture<List<Product>> findByCategory(String category) throws ExecutionException, InterruptedException;
    Product findById(int theId);
    void save(Product product);
    void deleteById(int theId);
}
