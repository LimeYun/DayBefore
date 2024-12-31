package com.hong.daybefore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hong.daybefore.domain.Anniversary;
import com.hong.daybefore.mapper.AnniversaryMapper;

@Service
public class AnniversaryServiceImpl implements AnniversaryService {

    @Autowired
    private AnniversaryMapper anniversaryMapper;

    @Override
    public List<Anniversary> list() {
        return anniversaryMapper.list(); 
    }

    @Override
    public Anniversary select(Long id) {
        return anniversaryMapper.select(id);
    }

    @Override
    public int insert(Anniversary entity) {
        return anniversaryMapper.insert(entity);
    }

    @Override
    public int update(Anniversary entity) {
        return anniversaryMapper.update(entity);
    }

    @Override
    public int delete(Long id) {
        return anniversaryMapper.delete(id);
    }
    
}
