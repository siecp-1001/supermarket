package com.ahmed.supermarket.service;

import java.util.List;

import com.ahmed.supermarket.model.ProductType;

import com.ahmed.supermarket.repository.Producttype;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProductTypeServiceImpl implements ProductTypeService {
    @Autowired
    Producttype producttype;


    @Override
    public List<ProductType> getAll() {
        return producttype.findAll();
    }

    @Override
    public ProductType editProduct(int id) {
        return producttype.getById(id);
    }

    @Override
    public void deleteProduct(int id) {
        producttype.deleteById(id);
    }
    @Override
    public ProductType saveProduct(ProductType body) {
        return producttype.save(body);
    }


}