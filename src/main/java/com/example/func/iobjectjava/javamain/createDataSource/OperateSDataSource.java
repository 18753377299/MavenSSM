package com.example.func.iobjectjava.javamain.createDataSource;

import com.example.func.iobjectjava.javamain.common.MapUtils;
import com.supermap.data.DatasourceConnectionInfo;
import com.supermap.data.Workspace;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年6月5日 下午3:54:26
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class OperateSDataSource {
	public  static void main(String []args){
		Workspace workspace = new Workspace();
		// 定义数据源连接信息，假设以下所有数据源设置都存在
       DatasourceConnectionInfo datasourceconnection = new  DatasourceConnectionInfo();
       MapUtils.connectDataSource(workspace,datasourceconnection);
       System.out.println("success");
	}
}
