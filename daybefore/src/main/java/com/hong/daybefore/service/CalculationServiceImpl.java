package com.hong.daybefore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hong.daybefore.domain.Calculation;
import com.hong.daybefore.mapper.CalculationMapper;

@Service
public class CalculationServiceImpl implements CalculationService {

    @Autowired
    private CalculationMapper calculationMapper;

    @Override
    public List<Calculation> list() {
        return calculationMapper.list();
    }

    @Override
    public Calculation select(Long id) {
        return calculationMapper.select(id);
    }

    @Override
    public int insert(Calculation entity) {
        return calculationMapper.insert(entity);
    }

    @Override
    public int update(Calculation entity) {
        return calculationMapper.update(entity);
    }

    @Override
    public int delete(Long id) {
        return calculationMapper.delete(id);
    }


    
}
