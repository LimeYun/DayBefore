package com.hong.daybefore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hong.daybefore.domain.Dday;
import com.hong.daybefore.mapper.DdayMapper;

@Service
public class DdayServiceImpl implements DdayService {

    @Autowired
    private DdayMapper ddayMapper;

    @Override
    public List<Dday> list() {
        return ddayMapper.list();
    }

    @Override
    public Dday select(Long id) {
        return ddayMapper.select(id);
    }

    @Override
    public int insert(Dday entity) {
        return ddayMapper.insert(entity);
    }

    @Override
    public int update(Dday entity) {
        return ddayMapper.update(entity);
    }

    @Override
    public int delete(Long id) {
        return ddayMapper.delete(id);
    }


    
}
