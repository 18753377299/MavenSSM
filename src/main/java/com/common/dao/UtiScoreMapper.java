package com.common.dao;

import com.vo.UtiScore;
import org.apache.ibatis.annotations.Param;

public interface UtiScoreMapper {
    int deleteByPrimaryKey(@Param("riskModel") String riskModel, @Param("factorNo") String factorNo, @Param("dangerType") String dangerType, @Param("factorValue") String factorValue);

    int insert(UtiScore record);

    int insertSelective(UtiScore record);

    UtiScore selectByPrimaryKey(@Param("riskModel") String riskModel, @Param("factorNo") String factorNo, @Param("dangerType") String dangerType, @Param("factorValue") String factorValue);

    int updateByPrimaryKeySelective(UtiScore record);

    int updateByPrimaryKey(UtiScore record);
    
    
}