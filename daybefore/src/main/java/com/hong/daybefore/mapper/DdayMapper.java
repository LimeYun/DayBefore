package com.hong.daybefore.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hong.daybefore.domain.Dday;

@Mapper
public interface DdayMapper extends BaseMapper<Dday> {

    // 유저별 목록
    public List<Dday> listByUser() throws Exception;
    
}
