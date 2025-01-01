package com.hong.daybefore.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Anniversary {
    
    private Long anniversaryId;
    private String name;
    private String calculation;
    private Date createdAt;
    
}
