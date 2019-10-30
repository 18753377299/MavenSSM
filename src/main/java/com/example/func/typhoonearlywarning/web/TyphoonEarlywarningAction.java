//package com.picc.riskctrl.typhoonearlywarning.web;
//
//import ins.framework.web.AjaxResult;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.picc.riskctrl.typhoonearlywarning.service.facade.TyphoonEarlyWarningService;
//import com.picc.riskctrl.typhoonearlywarning.vo.RiskWarningPushVo;
//
//@Controller
//@RequestMapping("/riskmapWarn")
//public class TyphoonEarlywarningAction {
//	@Autowired
//	private TyphoonEarlyWarningService typhoonEarlyWarningService;
//	
//	@RequestMapping("/handleWarnPushInfo")
//	public AjaxResult handleWarnPushInfo(){
//		
//		typhoonEarlyWarningService.handleWarnPushInfo();
//		
//		return null;
//	}
//	@RequestMapping("/queryRiskMapMain")
//	public AjaxResult queryRiskMapMain(){
//		
////		typhoonEarlyWarningService.queryRiskMapMain();
//		/*发送邮件*/
////		typhoonEarlyWarningService.organizeEmailInfo();
//		
////		typhoonEarlyWarningService.generateExcel("/downloadExcel/mapwarnPush_ab.xls");
//		RiskWarningPushVo riskWarningPushVo = new RiskWarningPushVo();
//		riskWarningPushVo.setTFBH("201822");
//		typhoonEarlyWarningService.establishContentInfo(riskWarningPushVo);
//		return null;
//	}
//	
//}
