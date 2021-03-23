package com.jpaexample.coolboot.entity;

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


public class Product {
    private int id;

    private String productCode;

    private String productName;

    private String description;

    private Double standardCost;

    private Double listPrice;

    private String category;

}
