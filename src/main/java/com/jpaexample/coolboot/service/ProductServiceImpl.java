package com.jpaexample.coolboot.service;

import com.jpaexample.coolboot.entity.Product;
import com.jpaexample.coolboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public CompletableFuture<List<Product>> findByCategory(String category) throws ExecutionException, InterruptedException {
       Future<List<Product>> future = productRepository.findByCategory(category);
       List<Product> products = null;

       if(future.isDone()) {
            products = future.get();
       }

        return CompletableFuture.completedFuture(products);
    }

    @Override
    public Product findById(int theId) {
        Optional<Product> result = productRepository.findById(theId);
        Product product = Product.createEmpty();

        if(result.isPresent()) {
            product = result.get();
        }

        return product;
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteById(int theId) {
        productRepository.deleteById(theId);
    }
}
