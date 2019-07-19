package com.riskfire.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.po.request.RiskRequestVo;
import com.po.response.RiskGradeVo;
import com.riskfire.dao.RiskFireDao;
import com.riskfire.service.RiskFireService;
import com.vo.RiskReportMain;
import com.vo.UtiFactor;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年7月19日 下午3:03:41
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年7月19日 下午3:03:41
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
@Service("riskFireService")
public class RiskFireServiceImpl implements RiskFireService{
	
	@Autowired
	private RiskFireDao riskFireDao;
	/**
	 * @功能：打分功能实现
	 * @param 
	 * @author 
	 * @throws Exception
	 * @时间：20190719
	 * @修改记录：
	 */
	public RiskGradeVo  assessScore(RiskRequestVo riskRequestVo){
		RiskGradeVo riskGradeVo =new RiskGradeVo();
		RiskReportMain riskReportMain = riskRequestVo.getRiskReportMain();
		
		return riskGradeVo;
	}
	
	public 	List<UtiFactor> getUtiFactorById(Map<String, String> map){
		List<UtiFactor>  utiFactorList =  riskFireDao.getUtiFactorById(map);
		
		return utiFactorList;
	}
	
} 
