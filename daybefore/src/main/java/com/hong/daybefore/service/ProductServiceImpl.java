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
    public List<Product> list() {
        return productMapper.list();
    }

    @Override
    public Product select(Long id) {
        return productMapper.select(id);
    }

    @Override
    public int insert(Product entity) {
        return productMapper.insert(entity);
    }

    @Override
    public int update(Product entity) {
        return productMapper.update(entity);
    }

    @Override
    public int delete(Long id) {
        return productMapper.delete(id);
    }


    
}
