package com.hong.daybefore.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.hong.daybefore.domain.UserAuth;
import com.hong.daybefore.domain.Users;

@Mapper
public interface UserMapper extends BaseMapper<Users> {

    // 회원 아이디로 조회
    public Users selectId(String id) throws Exception;

    // 권한 등록
    public int insertAuth(UserAuth userAuth) throws Exception;
    
}
