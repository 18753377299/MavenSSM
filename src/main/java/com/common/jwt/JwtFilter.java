package com.common.jwt;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

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
import com.fasterxml.jackson.core.JsonProcessingException;
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
		    //首先看是否是需要放过的页面
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
		    	// 每次请求将需要设置一下userInfo信息
		    	 AjaxResult  ajaxResult =  this.checkTokenIsCorrect(req);
		    	 if(1 ==ajaxResult.getStatus()){
					chain.doFilter(request, response);
				}else{
					// 向前台返回错误信息:过滤器中怎样返回错误信息
			    	handleErrorMessage(ajaxResult,res);
				}
		    }
		}
		
		/*方式一：用于向前端返回错误信息*/
		public void handleErrorMessage(AjaxResult ajaxResult,HttpServletResponse res ){
			try {
				PrintWriter printWriter = res.getWriter();
				res.setContentType("application/json; charset=utf-8");
				printWriter.print(ajaxResult);
				printWriter.flush();
				printWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		/*方法二*/
		public void handleErrorMessageOut(AjaxResult ajaxResult,HttpServletResponse res ){
			try {
				res.setContentType("application/json; charset=utf-8");
				res.setCharacterEncoding("UTF-8");
				OutputStream outputStream = res.getOutputStream();
				String jsonString= convertObjectToJson(ajaxResult);
				outputStream.write(jsonString.getBytes("UTF-8"));
				outputStream.flush();
				outputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		public String convertObjectToJson(Object object){
			String  str=null;
			if(object==null){
				return null;
			}
			try {
				ObjectMapper objectMapper = new ObjectMapper();
				str=objectMapper.writeValueAsString(object);
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
			return str;
		}
		
		
		//用于校验token是否正常
		public AjaxResult  checkTokenIsCorrect(HttpServletRequest req){
			AjaxResult ajaxResult =new AjaxResult();
			try {
				String jwtToken = req.getHeader("jwtToken");
//				UserInfo  userInfo = (UserInfo)req.getAttribute("userInfo");
				if(StringUtils.isBlank(jwtToken) ||  "undefined".equals(jwtToken) || "null".equals(jwtToken)){
					ajaxResult.setStatus(2); 
					ajaxResult.setMessage("token传递异常，请重新确认！");
				}else {
					try {
						ajaxResult =JWTUtils.validateJwtToken(jwtToken,req);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return ajaxResult;
		}
		
		@Override
		public void destroy() {
			
		}
		
		
	
}
