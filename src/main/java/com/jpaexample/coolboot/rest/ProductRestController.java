package com.jpaexample.coolboot.rest;

import com.jpaexample.coolboot.entity.Product;
import com.jpaexample.coolboot.resttemplate.QuoteRestTemplate;
import com.jpaexample.coolboot.resttemplate.dto.Quote;
import com.jpaexample.coolboot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/api")
public class ProductRestController {

    private ProductService productService;
    private QuoteRestTemplate quoteRestTemplate;


    @Autowired
    public ProductRestController(ProductService productService, QuoteRestTemplate quoteRestTemplate) {
        this.productService = productService;
        this.quoteRestTemplate = quoteRestTemplate;
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

    @GetMapping("/quote")
    public Quote findQuote() {
        Quote quote = quoteRestTemplate.getQuote();
        return quote;
    }


}
