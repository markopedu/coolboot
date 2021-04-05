package com.jpaexample.coolboot.entity;

import javax.persistence.*;

/**
 *`supplier_ids` LONGTEXT NULL DEFAULT NULL,
 *   `id` INT(11) NOT NULL AUTO_INCREMENT,
 *   `product_code` VARCHAR(25) NULL DEFAULT NULL,
 *   `product_name` VARCHAR(50) NULL DEFAULT NULL,
 *   `description` LONGTEXT NULL DEFAULT NULL,
 *   `standard_cost` DECIMAL(19,4) NULL DEFAULT '0.0000',
 *   `list_price` DECIMAL(19,4) NOT NULL DEFAULT '0.0000',
 *   `category` VARCHAR(50) NULL DEFAULT NULL,
 */

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="product_code")
    private String productCode;

    @Column(name="product_name")
    private String productName;

    @Column(name="description")
    private String description;

    @Column(name="standard_cost")
    private Double standardCost;

    @Column(name="list_price")
    private Double listPrice;

    @Column(name="category")
    private String category;

    public Product() {}

    public Product(String productCode, String productName, String description, Double standardCost, Double listPrice, String category) {
        this.productCode = productCode;
        this.productName = productName;
        this.description = description;
        this.standardCost = standardCost;
        this.listPrice = listPrice;
        this.category = category;
    }

    public static Product createEmpty() {
        return new Product();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getStandardCost() {
        return standardCost;
    }

    public void setStandardCost(Double standardCost) {
        this.standardCost = standardCost;
    }

    public Double getListPrice() {
        return listPrice;
    }

    public void setListPrice(Double listPrice) {
        this.listPrice = listPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
