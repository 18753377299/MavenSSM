/*package com.picc.riskctrl.map.web.action;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.picc.riskctrl.common.schema.RiskDaddress;
	*//**
 * @author  作者 E-mail: 
 * @date 创建时间：2018年12月20日 下午3:53:33
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  *//*
@Controller
@RequestMapping("/riskcontrol")
public class TestAction {
	@RequestMapping(value="/riskmap/test",method= {RequestMethod.GET,RequestMethod.POST})
	public List<RiskDaddress> test(@RequestParam(value = "name") String name){
		System.out.println("========================" + name);
//		List<RiskDaddress> riskAddressList=riskInsService.queryPCC(address);
		List<RiskDaddress> riskAddressList= null;
		return riskAddressList;		
	}
	
	@RequestMapping(value="/riskmap/test11",method= {RequestMethod.GET,RequestMethod.POST})
	public List<RiskDaddress> test(){
		System.out.println("========================test");
//		List<RiskDaddress> riskAddressList=riskInsService.queryPCC(address);
		List<RiskDaddress> riskAddressList= null;
		return riskAddressList;		
	}
	
	@RequestMapping(value="/riskmap/test2",method= {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public List<RiskDaddress> test2(@RequestParam(value = "name") String name){
		System.out.println("========================2" + name);
//		List<RiskDaddress> riskAddressList=riskInsService.queryPCC(address);
		List<RiskDaddress> riskAddressList= null;
		return riskAddressList;		
	}
	
	@RequestMapping(value="/riskmap/test1",method= {RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public List<RiskDaddress> test1(){
		System.out.println("========================test1");
//		List<RiskDaddress> riskAddressList=riskInsService.queryPCC(address);
		List<RiskDaddress> riskAddressList= null;
		return riskAddressList;		
	}
	
}
*/