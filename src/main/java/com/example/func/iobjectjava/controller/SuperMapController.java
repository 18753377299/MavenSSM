package com.example.func.iobjectjava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.func.iobjectjava.service.SuperMapService;
import com.example.func.iobjectjava.vo.ReceivePolygonVector;
import com.example.func.map.vo.request.MapRequestInfoVo;
import com.example.po.response.AjaxResult;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年8月19日 上午10:54:52
 * @version 1.0 
 * @parameter 
 * @since   关于iobjectjava的操作
 * @return  */
@Controller
@RequestMapping(value="/supermap")
public class SuperMapController {
	
	@Autowired
	public SuperMapService superMapService;
	
	//进行面数据的测试
	@RequestMapping(value="/testMapWarn",method= {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public AjaxResult testMapWarn(@RequestBody MapRequestInfoVo mapRequestInfoVo) {
		AjaxResult ajaxResult =new AjaxResult();
		try {
			ajaxResult = superMapService.testMapWarn(mapRequestInfoVo.getScope());
		}catch(Exception e) {
			e.printStackTrace();
		}
		return ajaxResult;
	}
	
	@RequestMapping(value="/operateWorkSpace",method= {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public AjaxResult operateWorkSpace() {
		AjaxResult ajaxResult =new AjaxResult();
		
		superMapService.operateWorkSpace();
		
		return ajaxResult;
	}
	/**
     * @Description 操作台风面，调用的文件名称是earlywarning.json
     * @Author 
     * @param obj
     * @return void
     * @Date 20190917
     */
	@RequestMapping(value="/operateEarlyWarn",method= {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public AjaxResult operateEarlyWarn(@RequestBody ReceivePolygonVector receivePolygonVector) {
		AjaxResult ajaxResult =new AjaxResult();
		
		ajaxResult = superMapService.operateEarlyWarn(receivePolygonVector);
		
		return ajaxResult;
	}
	
	/**
     * @Description 操作台风面，将面数据在页面展示
     * @Author 
     * @param obj
     * @return void
     * @Date 20190917
     */
	@RequestMapping(value="/operateEarlyWarnArea",method= {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public AjaxResult operateEarlyWarnArea() {
		AjaxResult ajaxResult =new AjaxResult();
		
		ajaxResult = superMapService.operateEarlyWarnArea();
		
		return ajaxResult;
	}
	
	
}
