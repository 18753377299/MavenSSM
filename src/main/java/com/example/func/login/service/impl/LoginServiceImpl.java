package com.example.func.login.service.impl;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.common.jwt.JWTSubject;
import com.common.jwt.JWTUtils;
import com.example.dao.UserMapper;
import com.example.func.login.service.LoginService;
import com.example.po.response.AjaxResult;
import com.example.po.response.UserInfo;
import com.example.vo.User;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年11月5日 下午2:35:37
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
@Service(value="loginService")
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private UserMapper userMapper;
	/**
	 * @功能：用户登录
	 * @param 
	 * @author 
	 * @throws Exception
	 * @时间：20191105
	 * @修改记录：
	 */
	public AjaxResult userLogin(User user,HttpServletRequest request){
		AjaxResult ajaxResult =new AjaxResult();
		UserInfo userInfo = null;
		try {
			boolean isSuccess = this.queryUserCodePass(user);
			String jwtToken ="";
			if(isSuccess){
				userInfo = new UserInfo();
				userInfo.setUserCode(user.getUserCode());
				userInfo.setPassword(userInfo.getPassword());
				//用于校验是哪一个项目
				userInfo.setOnlyFlag("MavenSSM");
				jwtToken = this.generateToken(userInfo);
				userInfo.setJwtToken(jwtToken);
				userInfo.setUserCode(user.getUserCode());
				// 用户密码不返给前台显示
				ajaxResult.setData(userInfo);
				//存储用户信息
				userInfo.setPassword(user.getPassWord());
//				request.setAttribute("userInfo", userInfo);
//				UserInfo userInfo222 = (UserInfo)request.getAttribute("userInfo");
				ajaxResult.setStatus(1);
				ajaxResult.setMessage("用户名密码正确，可成功登录！");
			}else {
				ajaxResult.setStatus(2);
				ajaxResult.setMessage("用户名或者密码错误，请确认后重新输入！");
			}
		} catch (Exception e) {
			e.printStackTrace();
			ajaxResult.setStatus(2);
			ajaxResult.setMessage("用户登录异常！");
		}
		return ajaxResult;
	}
	/**
	 * @功能：进行token校验和续期操作
	 * @param 
	 * @author 
	 * @throws Exception
	 * @时间：20191105
	 * @修改记录：
	 */
	public AjaxResult getUserInfo(String jwtToken,HttpServletRequest request){
		AjaxResult ajaxResult =new AjaxResult();
		try {
			UserInfo userInfo = (UserInfo)request.getAttribute("userInfo");
			//对token进行校验，看传递的token是否正确
			ajaxResult = JWTUtils.validateJwtToken(jwtToken,request);
			if(ajaxResult.getStatus() == 5){
				String newToken = this.generateToken(userInfo);
				userInfo.setJwtToken(newToken);
				ajaxResult.setMessage("进行token续期操作！");
				ajaxResult.setData(userInfo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ajaxResult;
	}
	// 生成token文件
	public String generateToken(UserInfo userInfo){
		// 设置过期时间,设置时间为四个小时
		long  expireDate = 1000*60*60*4;
//		JWTSubject subject = new JWTSubject(user.getUserCode(),user.getPassWord());
//		org.apache.commons.beanutils.BeanUtils.copyProperties(dest, orig);
//		String jwtToken = JWTUtils.createJWT(UUID.randomUUID().toString(), "sxt-test-jwt", 
//				JWTUtils.generalSubject(subject), expireDate);
		String jwtToken = JWTUtils.createJWT(UUID.randomUUID().toString(), "sxt-test-jwt", 
				JWTUtils.generalSubject(userInfo), expireDate);
		return jwtToken;
	}
	// 查询用户名密码是否存在
	public boolean queryUserCodePass(User user){
		boolean flag = false;
		try {
			User  userVo= userMapper.selectByPrimaryKey(user.getUserCode(),user.getPassWord());
			if(userVo!=null){
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
}
