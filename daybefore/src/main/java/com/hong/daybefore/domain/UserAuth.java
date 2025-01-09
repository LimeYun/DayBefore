package com.hong.daybefore.domain;

import lombok.Data;

@Data
public class UserAuth {
    
    private Long authId;
    private Long userId;
    private String auth;

}
