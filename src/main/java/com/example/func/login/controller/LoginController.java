package com.example.func.login.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.common.jwt.JWTResult;
import com.common.jwt.JWTUtils;
import com.example.func.login.service.LoginService;
import com.example.po.response.AjaxResult;
import com.example.vo.User;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年11月5日 下午2:34:46
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
@RestController
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
	@RequestMapping(value="/getUserInfo",method={RequestMethod.GET,RequestMethod.POST})
	@ResponseBody
	public AjaxResult  getUserInfo(@RequestBody String jwtToken,HttpServletRequest request){
		AjaxResult ajaxResult =new AjaxResult();
		try {
			// 校验token是否过期
			JWTResult jwtResult = JWTUtils.validateJWT(jwtToken);
			if(!jwtResult.isSuccess()){
				if(1005 == jwtResult.getErrCode()){
					ajaxResult.setStatus(5); 
					ajaxResult.setMessage("token已过期，请重新进行登录！");
				}else if(1006 == jwtResult.getErrCode()){
					ajaxResult.setStatus(6); 
					ajaxResult.setMessage("token校验失败，请重新进行登录！");
				}
			}else {
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ajaxResult;
	}
	
}
