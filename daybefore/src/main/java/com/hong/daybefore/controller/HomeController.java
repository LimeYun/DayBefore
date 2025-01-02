package com.hong.daybefore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;



@Slf4j
@Controller
public class HomeController {
  
    /**
     * 메인 화면
     * @param param
     * @return
     */
    @GetMapping("")
    public String home() {

        
        return "/index";
    }

    /**
     * 회원가입 화면
     * @return
     */
    @GetMapping("")
    public String join() {

        return "/join";
    }
    

}
