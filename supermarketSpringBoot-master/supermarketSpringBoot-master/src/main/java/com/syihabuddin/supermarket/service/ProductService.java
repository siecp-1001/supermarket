package com.syihabuddin.supermarket.service;

import java.util.List;

import com.syihabuddin.supermarket.model.Product;

/**
 * Created By Syihabuddin on 2021-09-19 22:26:59
 */

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