package com.hong.daybefore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hong.daybefore.domain.Anniversary;
import com.hong.daybefore.service.AnniversaryService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
public class AnniversaryController {

    @Autowired
    private AnniversaryService anniversaryService;

    
    
}
