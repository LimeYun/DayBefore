package com.hong.daybefore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hong.daybefore.domain.Users;
import com.hong.daybefore.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Users> list() {
        return userMapper.list();
    }

    @Override
    public Users select(Long id) {
        return userMapper.select(id);
    }

    @Override
    public int insert(Users entity) {
        return userMapper.insert(entity);
    }

    @Override
    public int update(Users entity) {
        return userMapper.update(entity);
    }

    @Override
    public int delete(Long id) {
        return userMapper.delete(id);
    }

    
}
