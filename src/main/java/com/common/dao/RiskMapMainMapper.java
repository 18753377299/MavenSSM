package com.common.dao;

import com.vo.RiskMapMain;
import org.apache.ibatis.annotations.Param;

public interface RiskMapMainMapper {
    int deleteByPrimaryKey(@Param("addressid") Integer addressid, @Param("proposalno") String proposalno);

    int insert(RiskMapMain record);

    int insertSelective(RiskMapMain record);

    RiskMapMain selectByPrimaryKey(@Param("addressid") Integer addressid, @Param("proposalno") String proposalno);

    int updateByPrimaryKeySelective(RiskMapMain record);

    int updateByPrimaryKey(RiskMapMain record);
}