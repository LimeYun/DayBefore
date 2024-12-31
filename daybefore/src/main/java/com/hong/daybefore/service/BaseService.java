package com.hong.daybefore.service;

import java.util.List;

public interface BaseService<E> {

    public List<E> list();

    public E select(Long id);

    public int insert(E entity);

    public int update(E entity);

    public int delete(Long id);
    
}
