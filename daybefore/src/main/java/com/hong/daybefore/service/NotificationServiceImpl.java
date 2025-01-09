package com.hong.daybefore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hong.daybefore.domain.Notification;
import com.hong.daybefore.mapper.NotificationMapper;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    private NotificationMapper notificationMapper;

    @Override
    public List<Notification> list() throws Exception {
        return notificationMapper.list();
    }

    @Override
    public Notification select(Long id) throws Exception {
        return notificationMapper.select(id);
    }

    @Override
    public int insert(Notification entity) throws Exception {
        return notificationMapper.insert(entity);
    }

    @Override
    public int update(Notification entity) throws Exception {
        return notificationMapper.update(entity);
    }

    @Override
    public int delete(Long id) throws Exception {
        return notificationMapper.delete(id);
    }


    
}
