package com.hong.daybefore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hong.daybefore.domain.ProductTag;
import com.hong.daybefore.mapper.ProductTagMapper;

@Service
public class ProductTagServiceImpl implements ProductTagService {

    @Autowired
    private ProductTagMapper productTagMapper;

    @Override
    public List<ProductTag> list() throws Exception {
        return productTagMapper.list();
    }

    @Override
    public ProductTag select(Long id) throws Exception {
        return productTagMapper.select(id);
    }

    @Override
    public int insert(ProductTag entity) throws Exception {
        return productTagMapper.insert(entity);
    }

    @Override
    public int update(ProductTag entity) throws Exception {
        return productTagMapper.update(entity);
    }

    @Override
    public int delete(Long id) throws Exception {
        return productTagMapper.delete(id);
    }


    
}
