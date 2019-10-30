package com.example.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.example.vo.UtiFormula;

public interface UtiFormulaMapper {
	
    int deleteByPrimaryKey(@Param("riskModel") String riskModel, @Param("factorNo") String factorNo, @Param("dangerType") String dangerType);

    int insert(UtiFormula record);

    int insertSelective(UtiFormula record);

    UtiFormula selectByPrimaryKey(@Param("riskModel") String riskModel, @Param("factorNo") String factorNo, @Param("dangerType") String dangerType);

    int updateByPrimaryKeySelective(UtiFormula record);

    int updateByPrimaryKeyWithBLOBs(UtiFormula record);

    int updateByPrimaryKey(UtiFormula record);
    
    /**
   	 * @author  liqiankun 
   	 * @date 创建时间：20190723
   	 * @version 1.0 
   	 * @parameter 
   	 * @since 查询出UtiFactor的集合
   	 * @return  
   	 * */
    public  List<UtiFormula> getUtiFormulaList(Map<String, String> map);
    
}