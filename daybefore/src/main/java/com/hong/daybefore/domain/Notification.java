package com.hong.daybefore.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Notification {

    private Long notificationId;
    private Long productId;
    private Long dayId;
    private String title;
    private String message;
    private int enabled;
    private Date createdAt;
    
}
