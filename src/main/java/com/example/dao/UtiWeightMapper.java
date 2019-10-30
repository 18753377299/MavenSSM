package com.example.dao;

import java.util.Map;

import com.common.db.datasource.DataSource;
import com.example.vo.UtiWeight;

public interface UtiWeightMapper {
	
    int deleteByPrimaryKey(Long id);

    int insert(UtiWeight record);

    int insertSelective(UtiWeight record);
    
    UtiWeight selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UtiWeight record);

    int updateByPrimaryKey(UtiWeight record);
    // 查询指定的权重信息
    public java.util.List<UtiWeight>  getUtiWeightList(Map<String,String> map);
    
    @DataSource("master")
    UtiWeight  selectById(Long id);
    
}