package com.example.func.riskfire.service;

import com.example.po.request.RiskRequestVo;
import com.example.po.response.AjaxResult;
import com.example.po.response.RiskGradeVo;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年7月19日 下午3:03:11
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public interface RiskFireService {
	/**打分功能实现*/
	public RiskGradeVo  assessScore(RiskRequestVo riskRequestVo);
	/**保存并且打分*/
	public AjaxResult  saveAndAssessScore(RiskRequestVo riskRequestVo);
	/**查询回显*/
	public AjaxResult  queryRiskReportFire(String riskFileNo);
	/*分页查询*/
	public AjaxResult  queryRiskReportMainPage(RiskRequestVo riskRequestVo);
	
	public  AjaxResult querySlaveAndMasterTable();
	
	public  AjaxResult querySlaveAndMasterTable2();
	
}
