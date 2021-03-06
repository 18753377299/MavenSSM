package com.example.func.riskfire.controller;

import com.common.service.RiskCommonService;
import com.example.func.riskfire.service.RiskFireService;
import com.example.po.request.RiskRequestVo;
import com.example.po.response.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
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
	@RequestMapping(value="/queryRiskReportFire",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public AjaxResult queryRiskReportFire(@RequestParam(value="riskFileNo") String riskFileNo){
		AjaxResult ajaxResult =new AjaxResult();
		ajaxResult= riskFireService.queryRiskReportFire(riskFileNo);
		return ajaxResult;
	}
	/**
	 * @功能：查询风控报告，分页
	 * @param 
	 * @author 
	 * @throws Exception
	 * @时间：20190719
	 * @修改记录：
	 */
	@RequestMapping(value="/queryRiskReportMainPage",method={RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public AjaxResult queryRiskReportMainPage(@RequestBody RiskRequestVo riskRequestVo){
		AjaxResult ajaxResult =new AjaxResult();
		ajaxResult= riskFireService.queryRiskReportMainPage(riskRequestVo);
		return ajaxResult;
	}
	
	
	@RequestMapping(value="/test",method={RequestMethod.POST,RequestMethod.GET})
	public AjaxResult getInfo(){
		AjaxResult ajaxResult =new AjaxResult();
		Map<String, String> map = new HashMap<String, String>();
		map.put("riskModel", "001");
		map.put("dangeType", "01,02");
		riskFireService.querySlaveAndMasterTable();
		
		riskFireService.querySlaveAndMasterTable2();
//		List<UtiFactor>  utiFactorList = riskFireService.getUtiFactorById(map);
		return ajaxResult;
	}
	
}


