package com.hong.daybefore.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Calculation {
    
    private Long calculationId;
    private String name;
    private Date createdAt;
    
}
