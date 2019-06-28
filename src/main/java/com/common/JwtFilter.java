package com.common;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年3月26日 上午10:00:19
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class JwtFilter implements Filter{

		
		@Override
		public void init(FilterConfig filterConfig) throws ServletException {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void doFilter(ServletRequest request, ServletResponse response,
				FilterChain chain) throws IOException, ServletException {
			// TODO Auto-generated method stub
//			System.out.println("================================");
			chain.doFilter(request, response);
		}

		@Override
		public void destroy() {
			// TODO Auto-generated method stub
		}
		
	
}
