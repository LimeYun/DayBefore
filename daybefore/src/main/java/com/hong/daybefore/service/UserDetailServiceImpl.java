package com.hong.daybefore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hong.daybefore.domain.CustomUser;
import com.hong.daybefore.domain.Users;
import com.hong.daybefore.mapper.UserMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {

        log.info("유저 정보 조회");
        Users user = null;
        try {
            user = userMapper.selectId(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (user == null) {
            throw new UsernameNotFoundException("사용자를 찾을 수 없습니다." + id);
        }

        CustomUser customUser = new CustomUser(user);
        return customUser;
    }

    
    
}
