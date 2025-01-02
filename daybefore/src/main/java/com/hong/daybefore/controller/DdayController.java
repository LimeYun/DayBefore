package com.hong.daybefore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
public class DdayController {
    
    @GetMapping("/user/Dday")
    public String DdayList() {
        
        return "/user/Dday/list";
    }
    
}
