package com.hong.daybefore.domain;

import java.util.Date;

import lombok.Data;

@Data
public class ProductTag {

    private Long productId;
    private Long tagId;
    private Date createdAt;
    
}
