package com.hong.daybefore.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.hong.daybefore.domain.Files;

@Mapper
public interface FileMapper extends BaseMapper<Files> {

    // 등록(디데이)
    public int insertForDay(Files file) throws Exception;

    // 등록(상품)
    public int insertForProduct(Files file) throws Exception;

    // 수정(디데이)
    public int updateForDday(Files file) throws Exception;
    
    // 수정(상품)
    public int updateForProduct(Files file) throws Exception;
    
}
