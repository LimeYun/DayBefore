package com.hong.daybefore.domain;

import java.util.Date;

import lombok.Data;

@Data
public class ProductCategory {

    private Long categoryId;
    private String name;
    private Long parentId;
    private Date createdAt;
    
}
