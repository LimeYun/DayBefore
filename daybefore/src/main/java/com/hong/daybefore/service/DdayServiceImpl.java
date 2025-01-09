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
    public List<Dday> list() throws Exception {
        return ddayMapper.list();
    }

    @Override
    public List<Dday> listByUser() throws Exception {
        return ddayMapper.listByUser();
    }

    @Override
    public Dday select(Long id) throws Exception {
        return ddayMapper.select(id);
    }

    @Override
    public int insert(Dday entity) throws Exception {
        return ddayMapper.insert(entity);
    }

    @Override
    public int update(Dday entity) throws Exception {
        return ddayMapper.update(entity);
    }

    @Override
    public int delete(Long id) throws Exception {
        return ddayMapper.delete(id);
    }


    
}
