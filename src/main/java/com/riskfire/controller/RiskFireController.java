package com.riskfire.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
	
	@RequestMapping(value="/test",method={RequestMethod.POST,RequestMethod.GET})
	public AjaxResult getInfo(){
		AjaxResult ajaxResult =new AjaxResult();
		Map<String, String> map = new HashMap<String, String>();
		map.put("riskModel", "001");
		
		List<UtiFactor>  utiFactorList = riskFireService.getUtiFactorById(map);
		
		return ajaxResult;
	}
}


