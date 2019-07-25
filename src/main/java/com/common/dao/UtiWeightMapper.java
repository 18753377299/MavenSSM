package com.common.dao;

import com.vo.UtiWeight;

public interface UtiWeightMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UtiWeight record);

    int insertSelective(UtiWeight record);

    UtiWeight selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UtiWeight record);

    int updateByPrimaryKey(UtiWeight record);
}