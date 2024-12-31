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
    public List<Notification> list() {
        return notificationMapper.list();
    }

    @Override
    public Notification select(Long id) {
        return notificationMapper.select(id);
    }

    @Override
    public int insert(Notification entity) {
        return notificationMapper.insert(entity);
    }

    @Override
    public int update(Notification entity) {
        return notificationMapper.update(entity);
    }

    @Override
    public int delete(Long id) {
        return notificationMapper.delete(id);
    }


    
}
