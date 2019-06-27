package com.common;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年6月27日 上午10:33:48
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class CharacterEncodingFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletRequest myrequest = new MyRequest(httpServletRequest);
		chain.doFilter(myrequest, response);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	class MyRequest extends HttpServletRequestWrapper {
		private HttpServletRequest request;
		private boolean hasEncode;

		public MyRequest(HttpServletRequest request) {
			super(request);
			this.request = request;
		}

		@Override
		public Map<String, String[]> getParameterMap() {
			Map<String, String[]> parameterMap = request.getParameterMap();
			if (request.getMethod().equalsIgnoreCase("get") && !hasEncode) {
				for (String parameterName : parameterMap.keySet()) {
					String[] values = parameterMap.get(parameterName);
					if (values != null) {
						for (int i = 0; i < values.length; i++) {
							try {
								/*使用指定的编码机制对 application/x-www-form-urlencoded 字符串解码。 */
//								values[i] = URLDecoder.decode(values[i], "utf-8");
								/*get方式提交中文乱码*/
								/*若是Tomcat服务器中配置了编码格式，则 无需进行下列操作，使用上述操作即可*/
								values[i] =new String(values[i].getBytes("ISO-8859-1"), "UTF-8");
							} catch (UnsupportedEncodingException e) {
								e.printStackTrace();
							}
						}
					}
				}
				hasEncode = true;
			}
			return parameterMap;
		}

		@Override
		public String getParameter(String name) {
			Map<String, String[]> parameterMap = getParameterMap();
			String[] values = parameterMap.get(name);
			if (values == null) {
				return null;
			}
			return values[0];
		}
		

		@Override
		public String[] getParameterValues(String name) {
			Map<String, String[]> parameterMap = getParameterMap();
			String[] values = parameterMap.get(name);
			return values;
		}

	}
}
