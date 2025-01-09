package com.hong.daybefore.service;

import com.hong.daybefore.domain.Users;

import jakarta.servlet.http.HttpServletRequest;

public interface UserService extends BaseService<Users> {

    // 회원 아이디로 조회
    public Users selectId(String id) throws Exception;

    // 로그인
    public boolean login(Users user, HttpServletRequest request) throws Exception;
    
}
