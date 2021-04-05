package com.jpaexample.coolboot.repository;

import com.jpaexample.coolboot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
