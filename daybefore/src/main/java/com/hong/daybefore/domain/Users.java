package com.hong.daybefore.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Users {

    private Long userId;
    private String id;
    private String password;
    private String name;
    private String email;
    private String phone;
    private String birth;
    private String address;
    private String role;
    private Date createdAt;
    private Date updatedAt;
    
}
