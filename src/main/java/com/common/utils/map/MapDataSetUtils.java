package com.common.utils.map;

import com.supermap.data.BlockSizeOption;
import com.supermap.data.DatasetGrid;
import com.supermap.data.DatasetGridInfo;
import com.supermap.data.DatasetType;
import com.supermap.data.DatasetVector;
import com.supermap.data.DatasetVectorInfo;
import com.supermap.data.Datasets;
import com.supermap.data.Datasource;
import com.supermap.data.EncodeType;
import com.supermap.data.PixelFormat;
import com.supermap.data.PrjCoordSys;
import com.supermap.data.PrjCoordSysType;
/**
 * @功能：iobjectjava 操作小工具，进行面数据集的操作
 * @param 
 * @return 
 * @author liqiankun
 * @时间：20190515
 * @修改记录：
 */
public class MapDataSetUtils {
		/*创建栅格数据集*/
	    public static DatasetGrid createDatasetGrid(Datasource datasource){
	    	 // 假设打开一个工作空间 workspace 对象，工作空间中存在一个数据源 datasource 对象
	        // 创建一个栅格数据集信息对象，对其进行必要的设置
	//    	String name = "Grid"+java.util.UUID.randomUUID().toString().replace("-", "");
	    	String name = "Grid";
	    	// 用于删除指定名称的数据集
	    	boolean flag =datasource.getDatasets().delete(name);
	    	
	        DatasetGridInfo datasetGridInfo = new DatasetGridInfo();
	        datasetGridInfo.setName(name);
	        datasetGridInfo.setBlockSizeOption(BlockSizeOption.BS_128);
	        datasetGridInfo.setWidth(3524);
	        datasetGridInfo.setHeight(3040);
	        datasetGridInfo.setNoValue(1.0);
	        datasetGridInfo.setPixelFormat(PixelFormat.SINGLE);
	        datasetGridInfo.setEncodeType(EncodeType.LZW);
	        
	        // 通过栅格数据集信息创建栅格数据集
	        DatasetGrid datasetGrid = datasource.getDatasets().create(
	                datasetGridInfo);
	        if (datasetGrid != null) {
	            System.out.println(datasetGrid.getName() + "创建成功！");
	        }
	    	return datasetGrid;
	    }
	    // 创建面数据集
		public static DatasetVector createDataSet(String dataSetName,Datasource datasource,Object object){
			  //如果不为null，则直接返回， 若为null则新建面数据集
			  DatasetVector datasetVector_exist = (DatasetVector)datasource.getDatasets().get(dataSetName);
			  if(datasetVector_exist!=null){
				  return datasetVector_exist;
			  }else {
				  Datasets datasets = datasource.getDatasets();
			      DatasetVectorInfo datasetVectorInfo = new DatasetVectorInfo();
			      // 名称中含有point 为点数据集
			      if(dataSetName.indexOf("POINT")>0){
			    	//点数据集类型
				    datasetVectorInfo.setType(DatasetType.POINT);
			      }else {
			    	//面数据集类型
				    datasetVectorInfo.setType(DatasetType.REGION);
			      }
			      
			      datasetVectorInfo.setName(dataSetName);
				  
				  DatasetVector datasetVector = datasets.create(datasetVectorInfo);
				  
				  PrjCoordSys prjCoordSys = new PrjCoordSys();
				  //地理经纬坐标
				  prjCoordSys.setType(PrjCoordSysType.PCS_EARTH_LONGITUDE_LATITUDE );
//					  GeoCoordSys geoCoordSys = new GeoCoordSys(GeoCoordSysType.GCS_CHINA_2000,GeoSpatialRefType.SPATIALREF_EARTH_LONGITUDE_LATITUDE );
//					  prjCoordSys.setCoordUnit(Unit.KILOMETER); // 千米
				  datasetVector.setPrjCoordSys(prjCoordSys);
//				  Recordset recordset = datasetVector.getRecordset(false, CursorType.DYNAMIC);
//				  recordset.edit();
				  
				  //为面数据集增加vo类中的字段
				  MapReflectUtils.addFieldInfo(datasetVector,object);
				  
			      return datasetVector;
			  }
			  
		}
		// 创建面数据集
		public static DatasetVector createDataSet(String dataSetName,Datasource datasource){
			  
			  Datasets datasets = datasource.getDatasets();
		      DatasetVectorInfo datasetVectorInfo = new DatasetVectorInfo();
		      //面数据集类型
		      datasetVectorInfo.setType(DatasetType.REGION);
		      datasetVectorInfo.setName(dataSetName);
			  
			  DatasetVector datasetVector = datasets.create(datasetVectorInfo);
			  
			  PrjCoordSys prjCoordSys = new PrjCoordSys();
			  //地理经纬坐标
			  prjCoordSys.setType(PrjCoordSysType.PCS_EARTH_LONGITUDE_LATITUDE );
//				  GeoCoordSys geoCoordSys = new GeoCoordSys(GeoCoordSysType.GCS_CHINA_2000,GeoSpatialRefType.SPATIALREF_EARTH_LONGITUDE_LATITUDE );
//				  prjCoordSys.setCoordUnit(Unit.KILOMETER); // 千米
			  datasetVector.setPrjCoordSys(prjCoordSys);
			  
//			  Recordset recordset = datasetVector.getRecordset(false, CursorType.DYNAMIC);
//			  recordset.edit();
			  
		      return datasetVector;
		}
}
