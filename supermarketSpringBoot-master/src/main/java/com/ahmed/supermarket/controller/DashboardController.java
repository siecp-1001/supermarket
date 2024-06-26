package com.ahmed.supermarket.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class DashboardController {

    @GetMapping(value = "/")
    public String index() {
        return "admin/dashboard/index";
    }

    // Added to test 500 page
    @GetMapping(path = "/tigger-error", produces = MediaType.APPLICATION_JSON_VALUE)
    public void error500() throws Exception {
        throw new Exception();
    }

}