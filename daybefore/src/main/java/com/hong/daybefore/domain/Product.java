package com.hong.daybefore.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Product {

    private Long productId;
    private Long categoryId;
    private Long tagId;
    private String name;
    private int price;
    private int stock;
    private String platformUrl;
    private Date createdAt;
    private Date updatedAt;
    
}
