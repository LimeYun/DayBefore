package com.hong.daybefore.domain;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class CustomUser implements UserDetails {

    private Users user;

    public CustomUser(Users user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return user.getAuthList().stream()
                                    .map((auth) -> new SimpleGrantedAuthority(auth.getAuth()))
                                    .collect(Collectors.toList());
    }
  

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getId();
    }
}
