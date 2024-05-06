package com.syihabuddin.supermarket.service;

import java.util.ArrayList;
import java.util.List;

import com.syihabuddin.supermarket.model.ProductType;

import org.springframework.stereotype.Service;

/**
 * Created By Syihabuddin on 2021-10-03 15:22:13
 */

@Service
public class ProductTypeServiceImpl implements ProductTypeService {

    List<ProductType> productTypeList = new ArrayList<>();

    @Override
    public List<ProductType> getAll() {
        return productTypeList;
    }

}