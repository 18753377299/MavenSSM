package com.example.func.login.controller;

import com.example.func.login.service.LoginService;
import com.example.po.response.AjaxResult;
import com.example.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年11月5日 下午2:34:46
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private  LoginService loginService;
	/**
	 * @功能：用户登录功能,用户登录校验用户名密码是否正确，
	 * 		正确的时候根据用户名密码生成token，返回前台
	 * @param 
	 * @author 
	 * @throws Exception
	 * @时间：20191105
	 * @修改记录：
	 */
	@RequestMapping(value="/userLogin",method={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public AjaxResult  userLogin(@RequestBody User user,HttpServletRequest request){
		AjaxResult ajaxResult =new AjaxResult();
		try {
			ajaxResult=loginService.userLogin(user,request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ajaxResult;
	}
	/**
	 * @功能：登录成功之后对用户token进行校验看是否过期
	 * @param 
	 * @author 
	 * @throws Exception
	 * @时间：20191105
	 * @修改记录：
	 */
	@RequestMapping(value="/getUserInfo",method={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public AjaxResult  getUserInfo(@RequestParam(value="jwtToken",required=true) String jwtToken,HttpServletRequest request){
		AjaxResult ajaxResult =new AjaxResult();
		try {
			ajaxResult = loginService.getUserInfo(jwtToken,request);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ajaxResult;
	}
	
}
