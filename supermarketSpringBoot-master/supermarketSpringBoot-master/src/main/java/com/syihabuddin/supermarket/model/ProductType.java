package com.syihabuddin.supermarket.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "producttype")
public class ProductType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int productTypeId;
    private String name;
    private String description;

    public int getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(int productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product Type [productTypeId=" + productTypeId + ", name=" + name + ", description=" + description + "]";
    }

}