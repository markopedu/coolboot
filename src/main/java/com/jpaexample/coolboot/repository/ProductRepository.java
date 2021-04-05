package com.jpaexample.coolboot.repository;

import com.jpaexample.coolboot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.annotation.Async;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Async
    CompletableFuture<List<Product>> findByCategory(String category);


}
