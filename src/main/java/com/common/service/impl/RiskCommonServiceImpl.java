package com.common.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.dao.RiskCommonDao;
import com.common.service.RiskCommonService;
import com.vo.UtiFactor;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年7月19日 下午4:46:18
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
@Service(value="riskCommonService")
public class RiskCommonServiceImpl implements RiskCommonService{
	
	@Autowired
	private RiskCommonDao riskCommonDao;
	
	public  Map<String, List<UtiFactor>>   getUtiFactorList(Map<String, String> map){
		
		 Map<String, List<UtiFactor>>  utiFactorMap = new HashMap<String, List<UtiFactor>>();
		 List<UtiFactor>  utiFactorList=   riskCommonDao.getUtiFactorList(map);
		 
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
	
}
