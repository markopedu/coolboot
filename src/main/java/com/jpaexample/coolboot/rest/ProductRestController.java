package com.jpaexample.coolboot.rest;

import com.jpaexample.coolboot.entity.Product;
import com.jpaexample.coolboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/api")
public class ProductRestController {

    private ProductService productService;

    @Autowired
    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public List<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping("/products/{productId}")
    public Product findById(@PathVariable int productId){
        return productService.findById(productId);
    }

    @GetMapping("/category/{category}")
    @Async
    public CompletableFuture<List<Product>> findByCategory(@PathVariable String category) throws ExecutionException, InterruptedException {
        return productService.findByCategory(category);
    }
}
