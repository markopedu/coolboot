package com.jpaexample.coolboot.dao;

import com.jpaexample.coolboot.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ProductDAOJpaImpl implements ProductDAO {

    private EntityManager entityManager;

    @Autowired
    public ProductDAOJpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Product> findAll() {
        Query query = entityManager.createQuery("from Product");
        List<Product> products = query.getResultList();
        return products;
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
