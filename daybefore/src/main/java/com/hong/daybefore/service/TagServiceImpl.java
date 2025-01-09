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
    public List<Tag> list() throws Exception {
        return tagMapper.list();
    }

    @Override
    public Tag select(Long id) throws Exception {
        return tagMapper.select(id);
    }

    @Override
    public int insert(Tag entity) throws Exception {
        return tagMapper.insert(entity);
    }

    @Override
    public int update(Tag entity) throws Exception {
        return tagMapper.update(entity);
    }

    @Override
    public int delete(Long id) throws Exception {
        return tagMapper.delete(id);
    }


    
}
