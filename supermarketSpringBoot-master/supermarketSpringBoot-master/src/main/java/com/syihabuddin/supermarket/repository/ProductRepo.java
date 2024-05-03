package com.syihabuddin.supermarket.repository;

import com.syihabuddin.supermarket.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created By Syihabuddin on 2021-10-02 23:20:02
 */

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}