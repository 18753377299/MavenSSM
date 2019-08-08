package com.common.service.impl;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.dao.UtiFactorMapper;
import com.common.dao.UtiFormulaMapper;
import com.common.dao.UtiScoreMapper;
import com.common.service.RiskCommonService;
import com.vo.RiskReportMain;
import com.vo.UtiFactor;
import com.vo.UtiFormula;
import com.vo.UtiScore;
import com.vo.UtiWeight;
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
	@Autowired
	private UtiScoreMapper utiScoreMapper;
	
	/**
	 * @author  liqiankun
	 * @date 创建时间：2019年7月19日 下午4:46:18
	 * @version 1.0 
	 * @parameter Map<factortype,List<UtiFactor>>   
	 * @since  组织因子表的信息
	 * @return  
	 * */
	public  Map<String, List<UtiFactor>>   getUtiFactorList(Map<String, String> map){
		
		 Map<String, List<UtiFactor>>  utiFactorMap = new HashMap<String, List<UtiFactor>>();
		 List<UtiFactor>  utiFactorList=   utiFactorMapper.getUtiFactorList(map);
		/* 将factortype 作为key*/
		 if(utiFactorList!=null&&utiFactorList.size()>0){
			 for(UtiFactor utiFactor:utiFactorList){
				 if(!utiFactorMap.containsKey(utiFactor.getFactorType())){
					 List<UtiFactor>  utiFactorListNew  = new ArrayList<UtiFactor>();
					 utiFactorListNew.add(utiFactor);
					 utiFactorMap.put(utiFactor.getFactorType(),utiFactorListNew);
				 }else {
					 // 如果已经拥有该key值，则进行添加到list中，并重新赋给key值
					 List<UtiFactor>  utiFactorListOld = utiFactorMap.get(utiFactor.getFactorType());
					 utiFactorListOld.add(utiFactor);
					 utiFactorMap.put(utiFactor.getFactorType(),utiFactorListOld);
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
	
	public  Map<String,UtiFormula>  getUtiFormulaList(Map<String, String> map){
//		Map<String, Map<String,List<UtiFormula>>> mapUtiFormulaT = 
//				new HashMap<String, Map<String,List<UtiFormula>>>();
		Map<String,UtiFormula>  mapUtiFormula = new HashMap<String, UtiFormula>();
		
		List<UtiFormula>  utiFormulaList=   utiFormulaMapper.getUtiFormulaList(map);
		if(utiFormulaList!=null&&utiFormulaList.size()>0){
			for(UtiFormula utiFormula:utiFormulaList){
				String key = utiFormula.getRiskModel()+"_"+utiFormula.getFactorNo()+"_"+utiFormula.getDangerType();
				mapUtiFormula.put(key, utiFormula);
			}
		}
		
		return mapUtiFormula;
	}
	/**
	 * @author  liqiankun 
	 * @date 创建时间：20190723
	 * @version 1.0 
	 * @parameter 
	 * @since  组织分值表的信息
	 * @return  
	 * */
	public  Map<String, Object> getScoreMap(Map<String, String> map){
		Map<String, Object> mapNew =new HashMap<String, Object>();
		List<UtiScore>  utiScoreList=   utiScoreMapper.getUtiScoreList(map);
		if(utiScoreList!=null&&utiScoreList.size()>0){
			for(UtiScore utiScore:utiScoreList){
				String key = utiScore.getRiskModel()+"_"+utiScore.getFactorNo()+
						"_"+utiScore.getDangerType()+"_"+utiScore.getFactorValue();
				BigDecimal score = utiScore.getFactorScore();
				mapNew.put(key, score);
			}
		}
		return mapNew;
	}
	
	public List<UtiWeight> getUtiWeightList(Map<String, String> map){
//		List<UtiWeight>  utiWeightList 
		return null;
	}
	/**
	 * @author  liqiankun 
	 * @date 创建时间：20190723
	 * @version 1.0 
	 * @parameter  mapObject(页面中的字段值 )，utiFactor(factorType：01 类型的因子信息)，scoreMap（所有的分数）
	 * @since  获取01类型的分值信息
	 * @return  
	 * */
	public BigDecimal getScoreValue(Map<String, String> mapObject,UtiFactor utiFactor,Map<String, Object>  scoreMap){
		BigDecimal score = BigDecimal.ZERO; 
		String objKey = utiFactor.getFromTable()+"."+utiFactor.getFromColumn();
		// 获取该字段对应的值
		String value = mapObject.get(objKey);
		if(StringUtils.isNotBlank(value)){
			String scoreKey = utiFactor.getRiskModel()+"_"+utiFactor.getFactorNo()+
					"_"+utiFactor.getDangerType()+"_"+value; 
			if(null!=scoreMap.get(scoreKey)){
			   score =new BigDecimal(scoreMap.get(scoreKey).toString());
			}
		}
		return score;
	}
	/**
	 * @author  liqiankun 
	 * @date 创建时间：20190725
	 * @version 1.0 
	 * @parameter 
	 * @since  通过反射将将对象中的值获取并整合到map中
	 * @return  
	 * */
	public Map<String, String>  setObjectValueToMap(Object object){
		Map<String, String> map = new HashMap<String, String>();
		try {
			Class clazz =  object.getClass();
			String  objectName = clazz.getName().substring(clazz.getName().lastIndexOf(".")+1);
			Field  [] fields  =  clazz.getDeclaredFields();
			for(Field field: fields){
				field.setAccessible(true);
				if(field.get(object)!=null){
					if(field.getType().equals(java.util.List.class)&&!field.getType().equals(RiskReportMain.class)){
						for (Object obj : (List)field.get(object)){
							Map<String, String> mapTemp = new HashMap<String, String>();
							mapTemp = this.setObjectValueToMap(obj);
							// 将list中的对象整合到一个map中
							for(String key : mapTemp.keySet()){
								if(map.containsKey(key)){
									map.put(key, map.get(key)+";"+mapTemp.get(key));
								}else {
									map.put(key, mapTemp.get(key));
								}
							}
						}
						
					}else if(field.getType().equals(RiskReportMain.class)){
//						if(field.get(object)!=null){
							Map<String, String> mapTemp = new HashMap<String, String>();
							mapTemp = this.setObjectValueToMap(field.get(object));
							// 将RiskReportMain中的对象整合到一个map中
							for(String key : mapTemp.keySet()){
								if(map.containsKey(key)){
									map.put(key, map.get(key)+";"+mapTemp.get(key));
								}else {
									map.put(key, mapTemp.get(key));
								}
							}
//						}
					}else {
						// 字段的值
						String fieldValue = field.get(object).toString();
						if(map.containsKey(objectName+"."+field.getName())){
							map.put(objectName+"."+field.getName(), map.get(objectName+"."+field.getName())+";"+fieldValue);
						}else {
							map.put(objectName+"."+field.getName(), fieldValue);
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return map;
	}
	
	
}
