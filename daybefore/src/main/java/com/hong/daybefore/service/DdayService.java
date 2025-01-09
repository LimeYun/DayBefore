package com.hong.daybefore.service;

import java.util.List;

import com.hong.daybefore.domain.Dday;

public interface DdayService extends BaseService<Dday> {

    // 유저별 목록
    public List<Dday> listByUser() throws Exception;
    
}
