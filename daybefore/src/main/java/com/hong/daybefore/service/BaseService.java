package com.hong.daybefore.service;

import java.util.List;

public interface BaseService<E> {

    public List<E> list() throws Exception;

    public E select(Long id) throws Exception;

    public int insert(E entity) throws Exception;

    public int update(E entity) throws Exception;

    public int delete(Long id) throws Exception;
    
}
