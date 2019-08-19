package com.iobjectjava.service.impl;

import org.springframework.stereotype.Service;

import com.common.utils.MapUtils;
import com.iobjectjava.service.SuperMapService;
import com.po.response.AjaxResult;
import com.supermap.data.CursorType;
import com.supermap.data.DatasetGrid;
import com.supermap.data.DatasetType;
import com.supermap.data.DatasetVector;
import com.supermap.data.DatasetVectorInfo;
import com.supermap.data.Datasets;
import com.supermap.data.Datasource;
import com.supermap.data.DatasourceConnectionInfo;
import com.supermap.data.Geometry;
import com.supermap.data.PrjCoordSys;
import com.supermap.data.PrjCoordSysType;
import com.supermap.data.Recordset;
import com.supermap.data.Toolkit;
import com.supermap.data.Workspace;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年8月19日 上午10:53:03
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
@Service
public class SuperMapServiceImpl implements  SuperMapService{
	
	public AjaxResult testMapWarn(String tfbh){
		AjaxResult ajaxResult =new AjaxResult();
		Workspace workspace = new Workspace();
		// 定义数据源连接信息，假设以下所有数据源设置都存在
	    DatasourceConnectionInfo datasourceconnection = new  DatasourceConnectionInfo();
		Datasource datasource = MapUtils.connectDataSource(workspace,datasourceconnection);
		// 创建栅格数据集
		DatasetGrid datasetGridNew =MapUtils.createDatasetGrid(datasource);
		
		datasetGridNew.open();
        if (datasetGridNew.calculateExtremum()) {
            double maxValue = datasetGridNew.getMaxValue();
            double minValue = datasetGridNew.getMinValue();
            System.out.println("栅格值的最大值为：" + maxValue + "栅格值的最小值为：" + minValue);
        }
        datasetGridNew.close();
        
		DatasetGrid datasetGrid = (DatasetGrid)datasource.getDatasets().get("typhoon_hazard_scale_1km");
		System.out.println("==================="+datasetGrid.getName());
		Datasets datasets = datasource.getDatasets();
	    DatasetVectorInfo datasetVectorInfo = new DatasetVectorInfo();
	    datasetVectorInfo.setType(DatasetType.REGION);
	    datasetVectorInfo.setName("A"+java.util.UUID.randomUUID().toString().replace("-", ""));
		  
		DatasetVector datasetVector = datasets.create(datasetVectorInfo);
		  
		PrjCoordSys prjCoordSys = new PrjCoordSys();
		//地理经纬坐标
		prjCoordSys.setType(PrjCoordSysType.PCS_EARTH_LONGITUDE_LATITUDE );
		Recordset recordset = datasetVector.getRecordset(true, CursorType.DYNAMIC);
//		Recordset recordset = datasetVector.query(filter,CursorType.DYNAMIC );
		recordset.edit();
		Geometry  geometry = Toolkit.GeoJsonToGemetry(tfbh);
		recordset.update();
    	recordset.delete();
		recordset.addNew(geometry);
		// 没有这个数据集更新不能够成功
		recordset.update();
		// 关闭地图资源
	    MapUtils.closeMapResource(null,recordset,null,null,null,datasetVector,
	    		datasource,datasourceconnection,workspace);
		return ajaxResult;
	}
	
	public  void operateWorkSpace(){
//		AjaxResult  ajaxResullt = MapUtils.createWorkspace();
		AjaxResult  ajaxResullt = MapUtils.openWorkSpace();
		if(ajaxResullt.getStatus() == 1){
			System.out.println("==============success");
		}else {
			System.out.println("==============fail");	
		}
	}
	
}
