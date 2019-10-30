package com.example.func.iobjectjava.service;

import com.example.func.iobjectjava.vo.ReceivePolygonVector;
import com.example.po.response.AjaxResult;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年8月19日 上午10:53:03
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public interface SuperMapService {
	
	public AjaxResult testMapWarn(String tfbh);
	
	public  void operateWorkSpace();
	
	public  AjaxResult operateEarlyWarn(ReceivePolygonVector receivePolygonVector);
	
	public AjaxResult operateEarlyWarnArea();
	
}
