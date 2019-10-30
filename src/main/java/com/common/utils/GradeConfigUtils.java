package com.common.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import com.example.vo.UtiFormula;

	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年7月19日 下午3:06:50
 * @version 1.0 
 * @parameter 
 * @since  分值表信息查询
 * @return  */

public  class GradeConfigUtils {
	
	
	/**
	 * @功能：消防设施分值获取-简化版
	 * @author liqiankun
	 * @param HttpServletRequest
	 * @param RiskInsRiskReportVo
	 * @return BigDecimal @日期：20190717
	 * @throws Exception 
	 */
	public BigDecimal getFireFacilityScoreSimple(Map<String, String> objectMap,UtiFormula utiFormula) throws Exception{
		BigDecimal sumScore=BigDecimal.ZERO;
		// 获取选中的值
		String factorYValue = objectMap.get("RiskReportFireDanger.fireFacility");
		factorYValue = factorYValue.replace("[", "").replace("]", "").replace("\"", "");
		if(factorYValue.length()>0){
			if(factorYValue.indexOf("A")>-1&&factorYValue.indexOf("B")>-1){
				sumScore=getResultByFormula("83.30");
			}else if(factorYValue.indexOf("A")>-1){
				sumScore=getResultByFormula("60.00");
			}else if(factorYValue.indexOf("C")>-1){
				sumScore=getResultByFormula("40.00");
			}else if(factorYValue.indexOf("E")>-1){
				sumScore=getResultByFormula("0.00");
			}else {
				// 选择“B/D”的时候为20分
				sumScore=getResultByFormula("20.00");
			}
		}
		
		return sumScore;
	}
	/**
	 * @功能：用于解析逻辑表达式
	 * @author liqiankun
	 * @param HttpServletRequest
	 * @param RiskInsRiskReportVo
	 * @return BigDecimal @日期：20190717
	 * @throws Exception 
	 */
	public BigDecimal  getResultByFormula(String score){
		// 可以用来解析逻辑表达式
		BigDecimal sumScore=BigDecimal.ZERO;
		try {
			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptEngine engine = manager.getEngineByName("js");
			Object result = engine.eval(score);
			if(null!=result){
				sumScore = new BigDecimal(result.toString()).setScale(4, RoundingMode.HALF_UP);
			}
		} catch (ScriptException e) {
			e.printStackTrace();
		}
		return sumScore;
	}
	
	
}
