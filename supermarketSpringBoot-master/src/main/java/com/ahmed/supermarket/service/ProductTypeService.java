package com.ahmed.supermarket.service;

import java.util.List;

import com.ahmed.supermarket.model.ProductType;


public interface ProductTypeService {

    public List<ProductType> getAll();

    ProductType editProduct(int id);

    void deleteProduct(int id);

    ProductType saveProduct(ProductType body);

    // public void addProduct(Product addProduct);

}