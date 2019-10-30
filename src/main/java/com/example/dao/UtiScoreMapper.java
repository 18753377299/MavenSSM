package com.example.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.example.vo.UtiScore;

public interface UtiScoreMapper {
    int deleteByPrimaryKey(@Param("riskModel") String riskModel, @Param("factorNo") String factorNo, @Param("dangerType") String dangerType, @Param("factorValue") String factorValue);

    int insert(UtiScore record);

    int insertSelective(UtiScore record);

    UtiScore selectByPrimaryKey(@Param("riskModel") String riskModel, @Param("factorNo") String factorNo, @Param("dangerType") String dangerType, @Param("factorValue") String factorValue);

    int updateByPrimaryKeySelective(UtiScore record);

    int updateByPrimaryKey(UtiScore record);
    
    /**
	 * @author  liqiankun 
	 * @date 创建时间：20190723
	 * @version 1.0 
	 * @parameter 
	 * @since 查询出UtiScore的集合
	 * @return  
	 * */
    public  List<UtiScore> getUtiScoreList(Map<String, String> map);
    
    
}