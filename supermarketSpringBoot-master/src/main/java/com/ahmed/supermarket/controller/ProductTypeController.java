package com.ahmed.supermarket.controller;

import java.util.List;

import com.ahmed.supermarket.model.Product;
import com.ahmed.supermarket.model.ProductType;
import com.ahmed.supermarket.repository.Producttype;
import com.ahmed.supermarket.service.ProductTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Controller
@RequestMapping("/producttype")
public class ProductTypeController {

    private final ProductTypeService productTypeService;


    @Autowired
    public ProductTypeController(ProductTypeService productTypeService, Producttype producttype) {
        super();
        this.productTypeService = productTypeService;

    }

    @GetMapping("/list")
    public String productTypeList(Model model) {
        List<ProductType> productTypeList = productTypeService.getAll();
        model.addAttribute("productTypeList", productTypeList);
        return "admin/producttype/listproducttype";
    }
    @GetMapping("/add")
    public String loadAddProduct(ProductType producttype, Model model) {
        model.addAttribute("producttype", producttype);
        return "admin/producttype/addproducttype";
    }


    @PostMapping("/save")
    public String saveProduct(@Valid @ModelAttribute("producttype") ProductType producttype, BindingResult result, Errors errors,
                              Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("producttype", producttype);
            return "admin/producttype/addproducttype";
        }

        model.addAttribute("producttype", producttype);
        productTypeService.saveProduct(producttype);
        return "redirect:/producttype/list";
    }
    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") int id, Model model) {
        productTypeService.deleteProduct(id);

        return "redirect:/producttype/list";
    }

}