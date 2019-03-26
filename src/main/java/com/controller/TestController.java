package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.service.EmpService;
import com.vo.Emp;


@Controller
@RequestMapping(value="/into")
public class TestController extends AbstractController{

	@Autowired
	EmpService empService;
	
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
	public ModelAndView getEMp(){
		ModelAndView mav =new ModelAndView();
		mav.setViewName("hello");
		System.out.println("getEMp");
		Integer id =1;
		Emp emp = empService.getEMpById(id);
		System.out.println("success:"+emp.getEmpName());
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
	
	
}
