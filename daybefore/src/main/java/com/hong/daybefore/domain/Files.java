package com.hong.daybefore.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Files {

    private Long fileId;
    private Long dayId;
    private Long productId;
    private String type;
    private String name;
    private String path;
    private int size;
    private Date createdAt;
    private Date updatedAt;
    
}
