package com.riskfire.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.common.service.RiskCommonService;
import com.po.request.RiskRequestVo;
import com.po.response.AjaxResult;
import com.riskfire.service.RiskFireService;
import com.vo.UtiFactor;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年7月19日 下午3:01:31
 * @version 1.0 
 * @parameter 
 * @since  火灾风险排查
 * @return  */
@RestController
@RequestMapping(value="/riskfire")
public class RiskFireController {
	
	@Autowired
	private  RiskFireService riskFireService;
	
	@Autowired
	private RiskCommonService  riskCommonService;
	
	
	@RequestMapping(value="/assessScore",method={RequestMethod.POST,RequestMethod.GET})
	public AjaxResult assessScore(){
		AjaxResult ajaxResult =new AjaxResult();
		RiskRequestVo riskRequestVo =new RiskRequestVo();
		riskFireService.assessScore(riskRequestVo);
		return ajaxResult;
	}
	
	@RequestMapping(value="/test",method={RequestMethod.POST,RequestMethod.GET})
	public AjaxResult getInfo(){
		AjaxResult ajaxResult =new AjaxResult();
		Map<String, String> map = new HashMap<String, String>();
		map.put("riskModel", "001");
		map.put("dangeType", "01,02");
		
		List<UtiFactor>  utiFactorList = riskFireService.getUtiFactorById(map);
		
		return ajaxResult;
	}
	
}


