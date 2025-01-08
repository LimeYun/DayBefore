package com.hong.daybefore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
public class ProductController {
    
    @GetMapping("/user/product/list")
    public String productList() {
        
        return "/user/product/list";
    }
    
    @GetMapping("/user/product/product")
    public String product() {
        
        return "/user/product/product";
    }
}
