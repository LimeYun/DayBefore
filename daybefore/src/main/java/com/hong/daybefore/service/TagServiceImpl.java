package com.hong.daybefore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hong.daybefore.domain.Tag;
import com.hong.daybefore.mapper.TagMapper;

@Service
public class TagServiceImpl implements TagService {

    @Autowired
    private TagMapper tagMapper;

    @Override
    public List<Tag> list() {
        return tagMapper.list();
    }

    @Override
    public Tag select(Long id) {
        return tagMapper.select(id);
    }

    @Override
    public int insert(Tag entity) {
        return tagMapper.insert(entity);
    }

    @Override
    public int update(Tag entity) {
        return tagMapper.update(entity);
    }

    @Override
    public int delete(Long id) {
        return tagMapper.delete(id);
    }


    
}
