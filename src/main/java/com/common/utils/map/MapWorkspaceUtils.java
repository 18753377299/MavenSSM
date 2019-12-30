package com.common.utils.map;

import java.util.Locale;
import java.util.ResourceBundle;

import com.example.po.response.AjaxResult;
import com.supermap.data.Datasets;
import com.supermap.data.Datasource;
import com.supermap.data.Workspace;
import com.supermap.data.WorkspaceConnectionInfo;
import com.supermap.data.WorkspaceType;
import com.supermap.data.WorkspaceVersion;

public class MapWorkspaceUtils {
	//连接参数获取
    private static final String iobjectJavaServer,iobjectJavaDatabase,iobjectJavaUser,iobjectJavaPassword;

   
	static {
    	/*获取连接iobjectjava的数据信息*/
		ResourceBundle filePath = ResourceBundle.getBundle("config.map", Locale.getDefault());
		 // 定义数据源连接信息，假设以下所有数据源设置都存在
		iobjectJavaServer = filePath.getString("iobjectJavaServer");
		iobjectJavaDatabase = filePath.getString("iobjectJavaDatabase");
		iobjectJavaUser = filePath.getString("iobjectJavaUser");
		iobjectJavaPassword = filePath.getString("iobjectJavaPassword");
		
//		iobjectJavaServer = "10.10.68.248:1521/orcl";
//		iobjectJavaDatabase = "riskcontrol_freeze";
//		iobjectJavaUser = "riskcontrol_freeze";
//		iobjectJavaPassword = "Picc_2019risk";
    }
	 /*创建工作空间*/
    public static  AjaxResult   createWorkspace(){
    	AjaxResult ajaxResult =new AjaxResult();
    	Workspace workspace = new Workspace();
    	WorkspaceConnectionInfo connectionInfo = new WorkspaceConnectionInfo();
		connectionInfo.setType(WorkspaceType.ORACLE);		
		connectionInfo.setServer(iobjectJavaServer);
		connectionInfo.setDatabase(iobjectJavaDatabase);
		connectionInfo.setUser(iobjectJavaUser);
		connectionInfo.setPassword(iobjectJavaPassword);
		connectionInfo.setName("GridWorkspace"+java.util.UUID.randomUUID().toString().replace("-", ""));
		
		connectionInfo.setVersion(WorkspaceVersion.UGC60);
		boolean saveResult = workspace.create(connectionInfo);
		if (saveResult) {
			 System.out.println("创建工作空间成功！");
			 ajaxResult.setStatus(1);
		} else {
			System.out.println("创建工作空间失败！");
			 ajaxResult.setStatus(2);
		}
		return ajaxResult;
    }
    /*打开工作空间*/
    public static  AjaxResult   openWorkSpace(){
    	AjaxResult ajaxResult =new AjaxResult();
    	Workspace workspace = new Workspace();
		
		WorkspaceConnectionInfo connectionInfo = new WorkspaceConnectionInfo();
		connectionInfo.setType(WorkspaceType.ORACLE);
		connectionInfo.setServer(iobjectJavaServer);
		connectionInfo.setDatabase(iobjectJavaDatabase);
		connectionInfo.setUser(iobjectJavaUser);
		connectionInfo.setPassword(iobjectJavaPassword);
		connectionInfo.setName("fcfk");
		
		boolean openResult = workspace.open(connectionInfo);
		
		Datasource datasource = workspace.getDatasources().get(0);
		Datasets datasets=  datasource.getDatasets();
		int count = datasets.getCount();
		for(int i=0;i<count;i++){
			System.out.println(datasets.get(i).getName());
		}
		
//		DatasetVector datasetVector = (DatasetVector) datasource.getDatasets().get("typhoon_hazard_scale_1km");
//		System.out.println("+++++++++++++++++++"+datasetVector.getName());
		// 保存工作空间
	    workspace.save();
	      
		if (openResult) {
			System.out.println("打开工作空间成功！");
			 ajaxResult.setStatus(1);
		} else {
			System.out.println("打开工作空间失败！");
			 ajaxResult.setStatus(2);
		}
		// 释放资源
//		datasetVector.close();
        connectionInfo.dispose();
        workspace.close();
        workspace.dispose();
        
    	return ajaxResult;
    }
}
