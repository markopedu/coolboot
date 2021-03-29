package com.jpaexample.coolboot.service;

import com.jpaexample.coolboot.dao.ProductDAO;
import com.jpaexample.coolboot.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private ProductDAO productDAO;

    @Autowired
    public ProductServiceImpl(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }


    @Override
    @Transactional
    public List<Product> findAll() {
        return productDAO.findAll();
    }

    @Override
    public Product findById(int theId) {
        return null;
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public void deleteById(int theId) {

    }
}
