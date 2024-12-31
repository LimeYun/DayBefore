package com.hong.daybefore.domain;

import java.time.LocalDate;
import java.util.Date;

import lombok.Data;

@Data
public class Dday {

    private Long dayId;
    private Long userId;
    private Long tagId;
    private LocalDate date;
    private String title;
    private int displayMain;
    private int notificationEnabled;
    private Date createdAt;
    private Date updatedAt;
    
}
