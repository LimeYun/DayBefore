package com.hong.daybefore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hong.daybefore.domain.Relationship;
import com.hong.daybefore.mapper.RelationshipMapper;

@Service
public class RelationshipServiceImpl implements RelationshipService {

    @Autowired
    private RelationshipMapper relationshipMapper;

    @Override
    public List<Relationship> list() {
        return relationshipMapper.list();
    }

    @Override
    public Relationship select(Long id) {
        return relationshipMapper.select(id);
    }

    @Override
    public int insert(Relationship entity) {
        return relationshipMapper.insert(entity);
    }

    @Override
    public int update(Relationship entity) {
        return relationshipMapper.update(entity);
    }

    @Override
    public int delete(Long id) {
        return relationshipMapper.delete(id);
    }


    
}
