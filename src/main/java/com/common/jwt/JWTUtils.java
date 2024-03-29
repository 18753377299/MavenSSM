package com.common.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.io.IOException;
import java.util.Date;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.HttpServletRequest;

import com.example.po.response.AjaxResult;
import com.example.po.response.UserInfo;
import com.example.vo.User;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年3月26日 下午1:38:43
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class JWTUtils {
	// 服务器的key。用于做加解密的key数据。 如果可以使用客户端生成的key。当前定义的常亮可以不使用。
	private static final String JWT_SECERT = "test_jwt_secert" ;
	private static final ObjectMapper MAPPER = new ObjectMapper();
	public static final int JWT_ERRCODE_EXPIRE = 1005;//Token过期
	public static final int JWT_ERRCODE_FAIL = 1006;//验证不通过
	
	/**
	 * 验证JWT
	 * @param jwtStr
	 * @return
	 */
	public static JWTResult validateJWT(String jwtStr) {
		JWTResult checkResult = new JWTResult();
		Claims claims = null;
		try {
			claims = parseJWT(jwtStr);
			checkResult.setSuccess(true);
			checkResult.setClaims(claims);
		} catch (ExpiredJwtException e) { // token超时
			checkResult.setErrCode(JWT_ERRCODE_EXPIRE);
			checkResult.setSuccess(false);
//		} catch (SignatureException e) { // 校验失败
//			checkResult.setErrCode(JWT_ERRCODE_FAIL);
//			checkResult.setSuccess(false);
		} catch (Exception e) {
			checkResult.setErrCode(JWT_ERRCODE_FAIL);
			checkResult.setSuccess(false);
		}
		return checkResult;
	}
	
	/**
	 * 
	 * 解析JWT字符串
	 * @param jwt 就是服务器为客户端生成的签名数据，就是token。
	 * @return解析之后的内容：{jti=ffe9aa20-d4c2-4596-84a4-ebecf2a4a079, iss=sxt-test-jwt, 
	 *	sub={"username":"A000011533","password":"a11111"}, iat=1572944024, exp=1572958424}
	 * @throws Exception
	 */
	public static Claims parseJWT(String jwt) {
		SecretKey secretKey = generalKey();
		Claims  claims  =  null;
		try {
			// getBody获取的就是token中记录的payload数据。就是payload中保存的所有的claims。
			claims  = Jwts.parser().setSigningKey(secretKey).parseClaimsJws(jwt).getBody();
		} catch (Exception e) {
			e.printStackTrace();
		}
//		return Jwts.parser().setSigningKey(secretKey).parseClaimsJws(jwt)
//			.getBody(); // getBody获取的就是token中记录的payload数据。就是payload中保存的所有的claims。
		return claims;
	}
	
	public static SecretKey generalKey() {
		try {
			// byte[] encodedKey = Base64.decode(JWT_SECERT); 
			// 不管哪种方式最终得到一个byte[]类型的key就行
			byte[] encodedKey = JWT_SECERT.getBytes("UTF-8");
		    SecretKey key = new SecretKeySpec(encodedKey, 0, encodedKey.length, "AES");
		    return key;
		} catch (Exception e) {
			e.printStackTrace();
			 return null;
		}
	}
	
	/**
	 * 签发JWT，创建token的方法。
	 * @param id  jwt的唯一身份标识，主要用来作为一次性token,从而回避重放攻击。
	 * @param iss jwt签发者
	 * @param subject jwt所面向的用户。payload中记录的public claims。当前环境中就是用户的登录名。
	 * @param ttlMillis 有效期,单位毫秒
	 * @return token， token是一次性的。是为一个用户的有效登录周期准备的一个token。用户退出或超时，token失效。
	 * @throws Exception
	 */
	public static String createJWT(String id,String iss, String subject, long ttlMillis) {
		// 加密算法
		SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
		// 当前时间。
		long nowMillis = System.currentTimeMillis();
		// 当前时间的日期对象。
		Date now = new Date(nowMillis);
		SecretKey secretKey = generalKey();
		// 创建JWT的构建器。 就是使用指定的信息和加密算法，生成Token的工具。
		JwtBuilder builder = Jwts.builder()
				.setId(id)  // 设置身份标志。就是一个客户端的唯一标记。 如：可以使用用户的主键，客户端的IP，服务器生成的随机数据。
				.setIssuer(iss)
				.setSubject(subject)
				.setIssuedAt(now) // token生成的时间。
				.signWith(signatureAlgorithm, secretKey); // 设定密匙和算法
		if (ttlMillis >= 0) { 
			long expMillis = nowMillis + ttlMillis;
			Date expDate = new Date(expMillis); // token的失效时间。
			builder.setExpiration(expDate);
		}
		return builder.compact(); // 生成token
	}
	
	/**
	 * 生成subject信息
	 * @param subObj - 要转换的对象。
	 * @return java对象->JSON字符串出错时返回null
	 */
	public static String generalSubject(Object subObj){
		try {
			return MAPPER.writeValueAsString(subObj);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * @功能：对token进行校验,看是否符合条件
	 * @param 
	 * @author 
	 * @throws Exception
	 * @时间：20191105
	 * @修改记录：
	 */
	public static AjaxResult validateJwtToken(String jwtToken,HttpServletRequest req){
		AjaxResult ajaxResult =new AjaxResult();
		try {
			// 校验token是否过期
			JWTResult jwtResult = JWTUtils.validateJWT(jwtToken);
			if(!jwtResult.isSuccess()){
				// token如果过期则进行续期
				if(1005 == jwtResult.getErrCode()){
					ajaxResult.setStatus(5); 
					ajaxResult.setMessage("token已过期，请重新进行登录！");
				}else if(1006 == jwtResult.getErrCode()){
					ajaxResult.setStatus(6); 
					ajaxResult.setMessage("token校验失败，请重新进行登录！");
				}
			}else {
				Claims  claims =  JWTUtils.parseJWT(jwtToken);
				System.out.println(claims);
				if(claims!=null){
					// 进行jwtToken中用户基本信息的解析
					String subject = claims.getSubject();
//					JWTSubject userVo = MAPPER.readValue(subject, JWTSubject.class);
					UserInfo userVo = MAPPER.readValue(subject, UserInfo.class);
					// 校验token是否正确
					if(userVo!=null && "MavenSSM".equals(userVo.getOnlyFlag()) ){
						ajaxResult.setStatus(1);
						ajaxResult.setMessage("校验token成功，可以正常使用该token！");
						userVo.setJwtToken(jwtToken);
						ajaxResult.setData(userVo);
						req.setAttribute("userInfo", userVo);
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
			ajaxResult.setStatus(7); 
			ajaxResult.setMessage("token解析处理异常！");
		}
		return ajaxResult;
	}
	
}
