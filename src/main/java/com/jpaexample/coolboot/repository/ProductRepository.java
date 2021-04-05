package com.jpaexample.coolboot.repository;

import com.jpaexample.coolboot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.annotation.Async;

import java.util.List;
import java.util.concurrent.Future;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Async
    Future<List<Product>> findByCategory(String category);
}
