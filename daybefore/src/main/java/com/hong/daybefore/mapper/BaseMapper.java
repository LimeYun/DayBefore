package com.hong.daybefore.mapper;

import java.util.List;

public interface BaseMapper<E> {
    
    public List<E> list();

    public E select(Long id);

    public int insert(E entity);

    public int update(E entity);

    public int delete(Long id);

}
