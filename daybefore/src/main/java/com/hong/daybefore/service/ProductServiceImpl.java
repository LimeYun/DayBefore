package com.hong.daybefore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hong.daybefore.domain.Product;
import com.hong.daybefore.mapper.ProductMapper;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> list() throws Exception {
        return productMapper.list();
    }

    @Override
    public Product select(Long id) throws Exception {
        return productMapper.select(id);
    }

    @Override
    public int insert(Product entity) throws Exception {
        return productMapper.insert(entity);
    }

    @Override
    public int update(Product entity) throws Exception {
        return productMapper.update(entity);
    }

    @Override
    public int delete(Long id) throws Exception {
        return productMapper.delete(id);
    }


    
}
