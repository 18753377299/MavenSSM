package com.risktest.controller;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.common.jwt.JWTResponseData;
import com.common.jwt.JWTResult;
import com.common.jwt.JWTSubject;
import com.common.jwt.JWTUsers;
import com.common.jwt.JWTUtils;
import com.risktest.service.EmpService;
import com.vo.Emp;


@Controller
@RequestMapping(value="/into")
public class TestController extends AbstractController{

	@Autowired
	EmpService empService;
	
	@RequestMapping(value="/testJdbcTemplate",method={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public  String testJdbcTemplate(@RequestBody Emp emp){
		
		empService.testJdbcTemplate();
		System.out.println(emp.getEmpAge());
		return null;
	}
	
	@Override
	@RequestMapping(value="/hello",method={RequestMethod.GET,RequestMethod.POST})
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mav =new ModelAndView();
		mav.setViewName("hello");
//		mav.setViewName("lqk");
		System.out.println("success");
		return mav;
	}
	
	@RequestMapping(value="/login",method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView login(){
		ModelAndView mav =new ModelAndView();
		mav.setViewName("hello");
		System.out.println("success22");
		return mav;
	}
	
	// 根据id来查找
	@RequestMapping(value="/emp",method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView getEMp(@RequestParam Integer id ){
		ModelAndView mav =new ModelAndView();
		mav.setViewName("hello");
		System.out.println("getEMp");
		Emp emp = empService.getEMpById(id);
		System.out.println("success:"+emp.getEmpName());
		String empName= empService.getEmpNameById(id);
//		System.out.println("================"+empName);
		return mav;
	}
	@RequestMapping(value="/insertEmp",method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView insertEmpInfo(){
		ModelAndView mav= new ModelAndView();
		mav.setViewName("hello");
		Emp emp =new Emp();
		emp.setEmpName("张三");
		emp.setEmpAge("14");
		empService.insertEmpInfo(emp);
		return mav;
	}
	
	@RequestMapping(value="/testJwt",method={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public  Object testJwt(HttpServletRequest request){
		
		String token = request.getHeader("Authorization");
		JWTResult result = JWTUtils.validateJWT(token);
		
		JWTResponseData responseData = new JWTResponseData();
		
		if(result.isSuccess()){
			responseData.setCode(200);
			responseData.setData(result.getClaims().getSubject());
			// 重新生成token，就是为了重置token的有效期。
			String newToken = JWTUtils.createJWT(result.getClaims().getId(), 
					result.getClaims().getIssuer(), result.getClaims().getSubject(), 
					1*60*1000);
			responseData.setToken(newToken);
			return responseData;
		}else{
			responseData.setCode(500);
			responseData.setMsg("用户未登录");
			return responseData;
		}
	}
	
	@RequestMapping("/loginjwt")
	@ResponseBody
	public Object login(String username, String password){
		JWTResponseData responseData = null;
		// 认证用户信息。本案例中访问静态数据。
		if(JWTUsers.isLogin(username, password)){
			JWTSubject subject = new JWTSubject(username);
			String jwtToken = JWTUtils.createJWT(UUID.randomUUID().toString(), "sxt-test-jwt", 
					JWTUtils.generalSubject(subject), 1*60*1000);
			responseData = new JWTResponseData();
			responseData.setCode(200);
			responseData.setData(null);
			responseData.setMsg("登录成功");
			responseData.setToken(jwtToken);
		}else{
			responseData = new JWTResponseData();
			responseData.setCode(500);
			responseData.setData(null);
			responseData.setMsg("登录失败");
			responseData.setToken(null);
		}
		
		return responseData;
	}
	
	
	
	
}
