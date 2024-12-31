package com.hong.daybefore.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Relationship {
    
    private Long relationshipId;
    private String name;
    private int targetAge;
    private String targetGender;
    private Date createdAt;

}
