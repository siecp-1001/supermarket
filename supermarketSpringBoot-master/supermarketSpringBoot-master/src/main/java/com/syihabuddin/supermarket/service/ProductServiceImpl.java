package com.syihabuddin.supermarket.service;

import java.util.ArrayList;
import java.util.List;

import com.syihabuddin.supermarket.model.Product;
import com.syihabuddin.supermarket.repository.ProductRepo;
import com.syihabuddin.supermarket.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created By Syihabuddin on 2021-09-19 22:29:18
 */

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;

    // List<Product> productList = new ArrayList<>();

    // public ProductServiceImpl() {
    // super();
    // Product product1 = new Product();
    // product1.setId(1);
    // product1.setProductName("Iphone 12");
    // product1.setCategory("Handphone");
    // product1.setCondition("New");
    // product1.setDescription(
    // "A superpowerful chip. 5G speed. An advanced dual-camera system. A Ceramic
    // Shield front that's tougher than any smartphone glass. And a bright,
    // beautiful OLED display. iPhone 12 has it all — in two great sizes.");
    // product1.setColor("White");
    // product1.setSize("");
    // product1.setPrice(12500000);
    // product1.setStock(30);

    // Product product2 = new Product();
    // product2.setId(2);
    // product2.setProductName("Iphone 13");
    // product2.setCategory("Handphone");
    // product2.setCondition("New");
    // product2.setDescription(
    // "A superpowerful chip. 5G speed. An advanced dual-camera system. A Ceramic
    // Shield front that's tougher than any smartphone glass. And a bright,
    // beautiful OLED display. iPhone 12 has it all — in two great sizes.");
    // product2.setColor("White");
    // product2.setSize("");
    // product2.setPrice(14900000);
    // product2.setStock(30);

    // productList.add(product1);
    // productList.add(product2);
    // }

    @Override
    public List<Product> getAll() {
        return productRepo.findAll();
    }

    @Override
    public Product editProduct(int id) {
        return productRepo.getById(id);
    }

    @Override
    public void deleteProduct(int id) {
        productRepo.deleteById(id);
    }

    // @Override
    // public void addProduct(Product addProduct) {
    // Product product = new Product();
    // product.setId(addProduct.getId());
    // product.setProductName(addProduct.getProductName());
    // product.setCategory(addProduct.getCategory());
    // product.setCondition(addProduct.getCondition());
    // product.setDescription(addProduct.getDescription());
    // product.setColor(addProduct.getColor());
    // product.setSize(addProduct.getSize());
    // product.setPrice(addProduct.getPrice());
    // product.setStock(addProduct.getStock());
    // productList.add(product);
    // }

    @Override
    public Product saveProduct(Product body) {
        return productRepo.save(body);
    }

}