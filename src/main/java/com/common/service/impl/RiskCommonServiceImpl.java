package com.common.service.impl;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.RiskControlConst;
import com.common.dao.UtiFactorMapper;
import com.common.dao.UtiFormulaMapper;
import com.common.dao.UtiScoreMapper;
import com.common.service.RiskCommonService;
import com.common.utils.GradeConfigUtils;
import com.po.response.RiskGradeVo;
import com.vo.RiskReportAssess;
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
	 * @date 创建时间：20190813
	 * @version 1.0 
	 * @parameter  mapObject(页面中的字段值 ),utiFormula 公式表信息，mapUtiFactorY(factorType：03，04 类型的因子信息)，scoreMap（所有的分数）
	 * @since  获取配置的公式的表的信息
	 * @return  
	 * */
	@SuppressWarnings("unchecked")
	public BigDecimal getUtiFormulaScoreValue(Map<String, String> mapObject,UtiFormula utiFormula,
			Map<String, List<UtiFactor>> mapUtiFactorY,Map<String, Object>  scoreMap){
		BigDecimal score = BigDecimal.ZERO; 
		/*listType的值决定什么取值方式*/
		String listType = utiFormula.getListType();
		if(StringUtils.isNotBlank(listType)){
			if("06".equals(utiFormula.getListType().trim())){
				try {
					String content = utiFormula.getContent();
					Class configClass = new GradeConfigUtils().getClass();
					/*第一种方式*/
//					Method []  methods = configClass.getMethods();
//					if(methods.length>0){
//						for(Method method:methods){
//							if(content.equals(method.getName())){
//								Object obj = method.invoke(configClass.newInstance(),mapObject,utiFormula);
//								if(obj!=null){
//									score = new BigDecimal(obj.toString());
//								}
//							}
//						}
//					}
					/*第二种方式*/
					Method method = configClass.getMethod(content,Map.class,UtiFormula.class);
					System.out.println("=========输出方法名称=========="+method.getName());
					Object obj = method.invoke(configClass.newInstance(),mapObject,utiFormula);
					if(obj!=null){
						score = new BigDecimal(obj.toString());
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}else if("01".equals(utiFormula.getListType().trim())){
				
			}else if("02".equals(utiFormula.getListType().trim())){
				
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
	/**
	 * @author  liqiankun 
	 * @date 创建时间：20190813
	 * @version 1.0 
	 * @parameter 
	 * @since  组织前台返回的分值信息
	 * @return  
	 * */
	@SuppressWarnings("unchecked")
	public RiskGradeVo  establishRiskGradeInfo(List<UtiWeight>  utiWeightList,Map<String, BigDecimal>  scoreTotalMap){
		RiskGradeVo riskGradeVo =new RiskGradeVo();
		BigDecimal scoreTotal =   BigDecimal.ZERO;
		RiskReportAssess  riskReportAssess = new RiskReportAssess();
		String  dangerType = RiskControlConst.FIREDANGERCONST;
		String [] dangerName = {"fireDanger","waterDanger","windDanger","thunderDanger","snowDanger"};
		String [] dangerTypeArray = dangerType.split(",");
		if(utiWeightList.size()>0){
			UtiWeight utiWeight = utiWeightList.get(0);
			Class clazz = utiWeight.getClass();
			for(int i=0;i<dangerTypeArray.length;i++){
				try {
					//对应字段的分值
					BigDecimal score  = scoreTotalMap.get(dangerTypeArray[i]);
					Method method = clazz.getMethod("get"+dangerName[i].substring(0,1)+dangerName[i].substring(1)+"()");
					Object obj = method.invoke(utiWeight);
					// 对应字段的权重
					BigDecimal utiWeightScale =BigDecimal.ZERO;
					if(null!=obj){
						utiWeightScale = new BigDecimal(obj.toString());
					}
					// 计算总的分值
					scoreTotal = scoreTotal.add(score.multiply(utiWeightScale));
				} catch (Exception e) {
					e.printStackTrace();
				} 
			}
			
//			scoreTotal = this.calculateSumScore(utiWeight,scoreTotalMap);
			
			riskGradeVo.setScore(scoreTotal);
		}
		
		return riskGradeVo;
	}
	
	
}
