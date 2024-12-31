package com.hong.daybefore.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Tag {
    
    private Long tagId;
    private Long anniversaryId;
    private Long relationshipId;
    private Date createdAt;

}
