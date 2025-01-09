package com.hong.daybefore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hong.daybefore.domain.Files;
import com.hong.daybefore.mapper.FileMapper;

@Service
public class FileServiceImpl implements FileService {

    @Autowired
    private FileMapper fileMapper;

    @Override
    public List<Files> list() throws Exception {
        return fileMapper.list();
    }

    @Override
    public Files select(Long id) throws Exception {
        return fileMapper.select(id);
    }

    @Override
    public int insert(Files entity) throws Exception {
        return fileMapper.insert(entity);
    }

    @Override
    public int update(Files entity) throws Exception {
        return fileMapper.update(entity);
    }

    @Override
    public int delete(Long id) throws Exception {
        return fileMapper.delete(id);
    }

    @Override
    public int insertForDay(Files file) throws Exception {
        return fileMapper.insertForDay(file);
    }

    @Override
    public int insertForProduct(Files file) throws Exception {
        return fileMapper.insertForProduct(file);
    }

    @Override
    public int updateForDday(Files file) throws Exception {
        return fileMapper.updateForDday(file);
    }

    @Override
    public int updateForProduct(Files file) throws Exception {
        return fileMapper.updateForProduct(file);
    }


    
}
