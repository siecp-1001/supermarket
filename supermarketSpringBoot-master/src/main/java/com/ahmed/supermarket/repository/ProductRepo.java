package com.ahmed.supermarket.repository;

import com.ahmed.supermarket.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}