package com.riskfire.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.common.service.RiskCommonService;
import com.po.request.RiskRequestVo;
import com.po.response.AjaxResult;
import com.riskfire.service.RiskFireService;
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
	
	/**
	 * @功能：打分功能实现
	 * @param 
	 * @author 
	 * @throws Exception
	 * @时间：20190719
	 * @修改记录：
	 */
	@RequestMapping(value="/assessScore",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public AjaxResult assessScore(@RequestBody RiskRequestVo riskRequestVo){
		AjaxResult ajaxResult =new AjaxResult();
		riskFireService.assessScore(riskRequestVo);
		return ajaxResult;
	}
	/**
	 * @功能：保存并且打分
	 * @param 
	 * @author 
	 * @throws Exception
	 * @时间：20190719
	 * @修改记录：
	 */
	@RequestMapping(value="/saveAndAssessScore",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public AjaxResult saveAndAssessScore(@RequestBody RiskRequestVo riskRequestVo){
		AjaxResult ajaxResult =new AjaxResult();
		riskFireService.saveAndAssessScore(riskRequestVo);
		return ajaxResult;
	}
	/**
	 * @功能：查询回显
	 * @param 
	 * @author 
	 * @throws Exception
	 * @时间：20190719
	 * @修改记录：
	 */
	@RequestMapping(value="/queryRiskReportMain",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public AjaxResult queryRiskReportMain(@RequestParam(value="riskFileNo") String riskFileNo){
		AjaxResult ajaxResult =new AjaxResult();
		ajaxResult= riskFireService.queryRiskReportMain(riskFileNo);
		return ajaxResult;
	}
	
	@RequestMapping(value="/test",method={RequestMethod.POST,RequestMethod.GET})
	public AjaxResult getInfo(){
		AjaxResult ajaxResult =new AjaxResult();
		Map<String, String> map = new HashMap<String, String>();
		map.put("riskModel", "001");
		map.put("dangeType", "01,02");
		
//		List<UtiFactor>  utiFactorList = riskFireService.getUtiFactorById(map);
		
		return ajaxResult;
	}
	
}


