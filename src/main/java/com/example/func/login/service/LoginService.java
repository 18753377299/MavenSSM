package com.example.func.login.service;

import javax.servlet.http.HttpServletRequest;

import com.example.po.response.AjaxResult;
import com.example.vo.User;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年11月5日 下午2:35:11
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public interface LoginService {
	
	public AjaxResult userLogin(User user,HttpServletRequest request);
	
	public AjaxResult getUserInfo(String jwtToken,HttpServletRequest request);
}
