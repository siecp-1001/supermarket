package com.ahmed.supermarket.repository;

import com.ahmed.supermarket.model.ProductType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Producttype extends JpaRepository<ProductType, Integer> {

}