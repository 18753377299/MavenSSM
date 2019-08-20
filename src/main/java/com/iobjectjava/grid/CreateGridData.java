package com.iobjectjava.grid;

import java.util.Locale;
import java.util.ResourceBundle;

import com.common.utils.MapUtils;
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
 * @date 创建时间：2019年8月19日 下午4:34:59
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class CreateGridData {

	//连接参数获取
    private static final String iobjectJavaServer,iobjectJavaDatabase,iobjectJavaUser,iobjectJavaPassword;

    static {
    	/*获取连接iobjectjava的数据信息*/
//		ResourceBundle filePath = ResourceBundle.getBundle("config.map", Locale.getDefault());
		 // 定义数据源连接信息，假设以下所有数据源设置都存在
		iobjectJavaServer = "10.10.68.248:1521/orcl";
		iobjectJavaDatabase = "riskcontrol_freeze";
		iobjectJavaUser = "riskcontrol_freeze";
		iobjectJavaPassword = "Picc_2019risk";
    }
	public static void main(String[] args) {
		createGridData();
	}
	/**通过传递行号列号和value值来阻止栅格数据*/
	public static void createGridData(){
		Workspace workspace = new Workspace();
		// 定义数据源连接信息，假设以下所有数据源设置都存在
	    DatasourceConnectionInfo datasourceconnection = new  DatasourceConnectionInfo();
		Datasource datasource = MapUtils.connectDataSource(workspace,datasourceconnection);
		// 创建栅格数据集
		DatasetGrid datasetGridNew =MapUtils.createDatasetGrid(datasource);
		// 用于给栅格数据创建金字塔
		datasetGridNew.buildPyramid(); 
		datasetGridNew.open();
		double [][] gridArray={{292, 211, 0.2},{367, 663, 0.3}};
//		for(int  i=0;i<gridArray.length;i++){
//			datasetGridNew.setValue(new Double(gridArray[i][0]).intValue(), 
//					new Double(gridArray[i][1]).intValue(), gridArray[i][2]);
//		}
		for(int  i=0;i<50;i++){
			datasetGridNew.setValue(new Double(gridArray[0][0]).intValue()+i, 
					new Double(gridArray[0][1]).intValue()+i, gridArray[0][2]+0.1*i);
		}
//		double value = datasetGridNew.setValue(10, 10, 0.2);
		
        if (datasetGridNew.calculateExtremum()) {
            double maxValue = datasetGridNew.getMaxValue();
            double minValue = datasetGridNew.getMinValue();
            System.out.println("栅格值的最大值为：" + maxValue + "栅格值的最小值为：" + minValue);
        }
        datasetGridNew.close();
        
		DatasetGrid datasetGrid = (DatasetGrid)datasource.getDatasets().get("typhoon_hazard_scale_1km");
		System.out.println("===================BlockSizeOption:"+datasetGrid.getBlockSizeOption()+
				",PixelFormat:"+datasetGrid.getPixelFormat()+",EncodeType:"+datasetGrid.getEncodeType()+
				",width:"+datasetGrid.getWidth()+",height:"+datasetGrid.getHeight());
		
//		Datasets datasets = datasource.getDatasets();
//	    DatasetVectorInfo datasetVectorInfo = new DatasetVectorInfo();
//	    datasetVectorInfo.setType(DatasetType.REGION);
//	    datasetVectorInfo.setName("A"+java.util.UUID.randomUUID().toString().replace("-", ""));
//		  
//		DatasetVector datasetVector = datasets.create(datasetVectorInfo);
//		  
//		PrjCoordSys prjCoordSys = new PrjCoordSys();
//		//地理经纬坐标
//		prjCoordSys.setType(PrjCoordSysType.PCS_EARTH_LONGITUDE_LATITUDE );
//		Recordset recordset = datasetVector.getRecordset(true, CursorType.DYNAMIC);
////		Recordset recordset = datasetVector.query(filter,CursorType.DYNAMIC );
//		recordset.edit();
//		Geometry  geometry = Toolkit.GeoJsonToGemetry(tfbh);
//		recordset.update();
//    	recordset.delete();
//		recordset.addNew(geometry);
//		// 没有这个数据集更新不能够成功
//		recordset.update();
		// 关闭地图资源
	    MapUtils.closeMapResource(null,null,null,null,null,null,
	    		datasource,datasourceconnection,workspace);
	}

}
