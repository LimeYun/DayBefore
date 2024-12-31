package com.hong.daybefore.domain;

import lombok.Data;

@Data
public class PersistenceLogins {

    private String username;
    private String series;
    private String token;
    private String lastUsed;
    
}
