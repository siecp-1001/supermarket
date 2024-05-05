package com.ahmed.supermarket.service;

import java.util.List;

import com.ahmed.supermarket.model.Product;


public interface ProductService {

    // List Product
    public List<Product> getAll();

    // Save Product
    public Product saveProduct(Product product);

    // Edit Product
    public Product editProduct(int id);

    // Delete Product
    public void deleteProduct(int id);

}