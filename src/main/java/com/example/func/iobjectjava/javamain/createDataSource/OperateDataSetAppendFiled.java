package com.example.func.iobjectjava.javamain.createDataSource;

import java.util.HashMap;
import java.util.Map;

import com.supermap.data.CursorType;
import com.supermap.data.DatasetType;
import com.supermap.data.DatasetVector;
import com.supermap.data.DatasetVectorInfo;
import com.supermap.data.Datasets;
import com.supermap.data.Datasource;
import com.supermap.data.DatasourceConnectionInfo;
import com.supermap.data.EngineType;
import com.supermap.data.FieldInfo;
import com.supermap.data.FieldInfos;
import com.supermap.data.FieldType;
import com.supermap.data.GeoCircle;
import com.supermap.data.GeoPie;
import com.supermap.data.GeoRegion;
import com.supermap.data.Geometry;
import com.supermap.data.Point2D;
import com.supermap.data.PrjCoordSys;
import com.supermap.data.PrjCoordSysType;
import com.supermap.data.Recordset;
import com.supermap.data.Workspace;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年11月26日 上午10:50:34
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class OperateDataSetAppendFiled {
		/*静态变量*/
		private static final  String  iobjectJavaServer = "10.10.68.248:1521/orcl";
		private static final  String  iobjectJavaDatabase = "riskcontrol";
		private static final  String  iobjectJavaUser = "riskcontrol";
		private static final  String  iobjectJavaPassword = "Picc_2019risk";
		private static final  String  riskMap_address  = "SMDTV_60";
		
		public static void main(String[]args){
			/*读取圆形 的面数据集*/
//				getRegionDataSet();
		}
		
		/*读取圆形 的面数据集*/
		public static void getRegionDataSet(){
			Workspace workspace = new Workspace();
			// 定义数据源连接信息，假设以下所有数据源设置都存在
	      DatasourceConnectionInfo datasourceconnection = new  DatasourceConnectionInfo();
		  datasourceconnection.setEngineType(EngineType.ORACLEPLUS);
//		   datasourceconnection.setEngineType(EngineType.MYSQL);
	      datasourceconnection.setServer(iobjectJavaServer);
	      datasourceconnection.setDatabase(iobjectJavaDatabase);
	      datasourceconnection.setUser(iobjectJavaUser); // riskcontrol_freeze
	      datasourceconnection.setPassword(iobjectJavaPassword);
		  datasourceconnection.setAlias("ORACLE");
//	      datasourceconnection.setAlias("MYSQL");
	      // 打开数据源
	      Datasource datasource = workspace.getDatasources().open(datasourceconnection);
	      
	      // 获取的点数据集
//		   DatasetVector datasetVector = (DatasetVector)datasource.getDatasets().get("RISKMAP_ADDRESS");
//	      
	      if (datasource == null) {
	          System.out.println("打开数据源失败");
	      } else {
	         System.out.println("数据源打开成功！");
	      }
	      
	   // 获取的点数据集(给数据集添加字段时，使用Recordset不能成功，使用DatasetVector可以成功)
	      DatasetVector datasetVector = (DatasetVector)datasource.getDatasets().get("dataEarlyWarnRain_1");
	      //Recordset recordset = datasetVector.getRecordset(false, CursorType.DYNAMIC);
		  
		  // 实例化一个字段信息对象，对其进行设置
	      FieldInfo fieldInfoNew = new FieldInfo();
	      fieldInfoNew.setName("Pop_2009");
	      fieldInfoNew.setCaption("Pop_2009");
	      fieldInfoNew.setDefaultValue("0");
	      fieldInfoNew.setType(FieldType.DOUBLE);
	      fieldInfoNew.setRequired(true);
	      
	      FieldInfos  fieldInfosOld = datasetVector.getFieldInfos();
	      fieldInfosOld.add(fieldInfoNew);
	      
	      FieldInfos  fieldInfos = datasetVector.getFieldInfos();
	      for(int i =0;i<fieldInfos.getCount();i++){
			  FieldInfo  fieldInfo = fieldInfos.get(i);
			  String  name = fieldInfo.getName();
			  String  value = fieldInfo.getDefaultValue();
			  System.out.println("字段值："+i+":"+name+":"+value);
		  }
		    
//			    if(fieldInfoNew!=null){
//			    	fieldInfoNew.dispose();
//				}
		    
			if(datasetVector!=null){
				datasetVector.close();
			}
		    if(datasource!=null){
				datasource.close();
			}
		    if(datasourceconnection!=null){
				datasourceconnection.dispose();
			}
			if(workspace!=null){
				// 关闭工作空间
				workspace.close();
				// 释放该对象所占用的资源
				workspace.dispose();
			}
			
		}
		
		
		
		

	}
