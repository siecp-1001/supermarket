package com.syihabuddin.supermarket.controller;

import java.util.List;

import com.syihabuddin.supermarket.model.ProductType;
import com.syihabuddin.supermarket.service.ProductTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created By Syihabuddin on 2021-10-03 15:27:04
 */

@Controller
@RequestMapping("/producttype")
public class ProductTypeController {

    private final ProductTypeService productTypeService;

    @Autowired
    public ProductTypeController(ProductTypeService productTypeService) {
        super();
        this.productTypeService = productTypeService;
    }

    @GetMapping("/list")
    public String productTypeList(Model model) {
        List<ProductType> productTypeList = productTypeService.getAll();
        model.addAttribute("productTypeList", productTypeList);
        return "admin/producttype/listproducttype";
    }

}