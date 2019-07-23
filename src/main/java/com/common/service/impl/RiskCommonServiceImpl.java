package com.common.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.dao.UtiFactorMapper;
import com.common.dao.UtiFormulaMapper;
import com.common.service.RiskCommonService;
import com.vo.UtiFactor;
import com.vo.UtiFormula;
/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年7月19日 下午4:46:18
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  
 * */
@Service(value="riskCommonService")
public class RiskCommonServiceImpl implements RiskCommonService{
	
	@Autowired
	private UtiFactorMapper utiFactorMapper;
	@Autowired
	private UtiFormulaMapper utiFormulaMapper;
	
	/**
	 * @author  liqiankun
	 * @date 创建时间：2019年7月19日 下午4:46:18
	 * @version 1.0 
	 * @parameter 
	 * @since  组织因子表的信息
	 * @return  
	 * */
	public  Map<String, List<UtiFactor>>   getUtiFactorList(Map<String, String> map){
		
		 Map<String, List<UtiFactor>>  utiFactorMap = new HashMap<String, List<UtiFactor>>();
		 List<UtiFactor>  utiFactorList=   utiFactorMapper.getUtiFactorList(map);
		 
		 if(utiFactorList!=null&&utiFactorList.size()>0){
			 for(UtiFactor utiFactor:utiFactorList){
				 if(utiFactorMap.containsKey(utiFactor.getDangerType())){
					 utiFactorMap.get(utiFactor.getDangerType()).add(utiFactor);
				 }else {
					 List<UtiFactor>  utiFactorNewList  = new ArrayList<UtiFactor>();
					 utiFactorNewList.add(utiFactor);
					 utiFactorMap.put(utiFactor.getDangerType(),utiFactorNewList);
				 }
			 }
		 }
		 return utiFactorMap;
	}
	/**
	 * @author  liqiankun 
	 * @date 创建时间：20190723
	 * @version 1.0 
	 * @parameter 
	 * @since  组织公式表的信息
	 * @return  
	 * */
	Map<String, Map<String,List<UtiFormula>>>  getUtiFormulaList(Map<String, String> map){
		Map<String, Map<String,List<UtiFormula>>> mapUtiFormulaT = 
				new HashMap<String, Map<String,List<UtiFormula>>>();
		Map<String,List<UtiFormula>>  mapUtiFormula = new HashMap<String, List<UtiFormula>>();
		List<UtiFormula>  utiFormulaList=   utiFormulaMapper.getUtiFormulaList(map);
		if(utiFormulaList!=null&&utiFormulaList.size()>0){
			for(UtiFormula utiFormula:utiFormulaList){
				mapUtiFormula.put(utiFormula., value)
			}
		}
		
		return null;
	}
	
}
