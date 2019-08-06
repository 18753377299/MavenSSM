package com.riskfire.service;

import java.util.List;
import java.util.Map;

import com.po.request.RiskRequestVo;
import com.po.response.RiskGradeVo;
import com.vo.UtiFactor;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年7月19日 下午3:03:11
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public interface RiskFireService {
	
	public RiskGradeVo  assessScore(RiskRequestVo riskRequestVo);
	
}
