package com.hong.daybefore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hong.daybefore.domain.ProductCategory;
import com.hong.daybefore.mapper.ProductCategoryMapper;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @Override
    public List<ProductCategory> list() {
        return productCategoryMapper.list();
    }

    @Override
    public ProductCategory select(Long id) {
        return productCategoryMapper.select(id);
    }

    @Override
    public int insert(ProductCategory entity) {
        return productCategoryMapper.insert(entity);
    }

    @Override
    public int update(ProductCategory entity) {
        return productCategoryMapper.update(entity);
    }

    @Override
    public int delete(Long id) {
        return productCategoryMapper.delete(id);
    }


    
}
