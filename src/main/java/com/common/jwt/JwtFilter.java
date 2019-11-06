package com.common.jwt;

import io.jsonwebtoken.Claims;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import com.example.po.response.AjaxResult;
import com.example.po.response.UserInfo;
import com.example.vo.User;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年3月26日 上午10:00:19
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class JwtFilter implements Filter{
		private static final ObjectMapper  MAPPER = new ObjectMapper();
		// 需要直接放过的路径的集合
		private String [] ignoreKeys = null;
		
		@Override
		public void init(FilterConfig filterConfig) throws ServletException {
			System.out.println("===================21232==========================");
			String ignoreKey =  filterConfig.getInitParameter("ignoreKey");
			System.out.println(ignoreKey);
			if(StringUtils.isNotBlank(ignoreKey)){
				if(ignoreKey.indexOf(",")>-1){
					ignoreKeys = ignoreKey.split(",");
				}else {
					ignoreKeys = new String[1];
					ignoreKeys[0] =  ignoreKey;
				}
			}else{
				ignoreKeys = new String[0];
			}
		}

		@SuppressWarnings("unused")
		@Override
		public void doFilter(ServletRequest request, ServletResponse response,
				FilterChain chain) throws IOException, ServletException {
			HttpServletRequest req = (HttpServletRequest) request;
			HttpServletResponse res = (HttpServletResponse) response;
			String requestUri = req.getRequestURI();
		    System.out.println("requestURI："+requestUri);
		    boolean jumpFlag = false;
		    AjaxResult  ajaxResult =  this.checkTokenIsCorrect(req);
			if(1 ==ajaxResult.getStatus()){
				chain.doFilter(request, response);
			}else{
				if(null!=ignoreKeys&&ignoreKeys.length>0){
			    	for(String key:ignoreKeys){
			    		// 如果该地址是以配置的信息结尾的，则放过
			    		if(requestUri.endsWith(key)){
			    			jumpFlag = true;
			    			break;
			    		}
			    	}
			    }
			    if(jumpFlag){
			    	chain.doFilter(request, response);
			    }else{
			    	// 向前台返回错误信息:过滤器中怎样返回错误信息
			    	handleErrorMessage(ajaxResult);
			    }
			}

		}

		@Override
		public void destroy() {
			
		}
		public void handleErrorMessage(AjaxResult ajaxResult){
			
		}
		//用于校验token是否正常
		public AjaxResult  checkTokenIsCorrect(HttpServletRequest req){
			AjaxResult ajaxResult =new AjaxResult();
			try {
				String jwtToken = req.getHeader("jwtToken");
				UserInfo  userInfo = (UserInfo)req.getAttribute("userInfo");
				if(StringUtils.isBlank(jwtToken) || jwtToken == "undefined" || jwtToken != "null"){
					ajaxResult.setStatus(2);
					ajaxResult.setMessage("token传递异常，请重新确认！");
				}else {
					Claims  claims =  JWTUtils.parseJWT(jwtToken);
					System.out.println(claims);
					if(claims!=null){
						// 进行jwtToken中用户基本信息的解析
						String subject = claims.getSubject();
						User userVo = MAPPER.readValue(subject, User.class);
						// 校验token是否正确
						if(userInfo.getUserCode().equals(userVo.getUserCode())&&
								userInfo.getPassword().equals(userVo.getPassWord())){
							ajaxResult.setStatus(1);
							ajaxResult.setMessage("校验token成功，可以正常使用该token！");
						}else {
							ajaxResult.setStatus(4);
							ajaxResult.setMessage("使用的token与该用户不匹配");
						}
					}else {
						// jwt解析异常
						ajaxResult.setStatus(3);
						ajaxResult.setMessage("token解析异常！");
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return ajaxResult;
		}
		
		
	
}
