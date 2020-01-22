package com.example.func.iobjectjava.javamain.QueryParameter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.common.utils.MapUtils;
import com.supermap.data.CursorType;
import com.supermap.data.DatasetVector;
import com.supermap.data.Datasource;
import com.supermap.data.DatasourceConnectionInfo;
import com.supermap.data.GeoRegion;
import com.supermap.data.QueryParameter;
import com.supermap.data.Recordset;
import com.supermap.data.SpatialQueryMode;
import com.supermap.data.Workspace;

// 统计标的数量
public class CountCorpporels {
	public static void main(String[] args) {
		Workspace workspace = new Workspace();
		// 定义数据源连接信息，假设以下所有数据源设置都存在
	    DatasourceConnectionInfo dsci = new  DatasourceConnectionInfo();
		//进行数据源的连接
		Datasource datasource =MapUtils.connectDataSource(workspace,dsci);
		//获取县行政区划china_county，
		DatasetVector datasetVector_county = (DatasetVector)datasource.getDatasets().get("china_county");
		//降雨组织之后
		DatasetVector datasetVector_dataEarlyWarnRain = (DatasetVector)datasource.getDatasets().get("dataEarlyWarnRain_new");
		//标的点
		DatasetVector datasetVector_address = (DatasetVector)datasource.getDatasets().get("RISKMAP_ADDRESS");
		
//		Recordset recordset_county = datasetVector_county.getRecordset(false, CursorType.DYNAMIC);
		Recordset recordset_Rain = datasetVector_dataEarlyWarnRain.getRecordset(false, CursorType.DYNAMIC);
		
//		String filter = "tfbh =201822";
//		Recordset recordset_7 = datasetVector_dataEarlyWarnRain.query(filter,CursorType.DYNAMIC );
//		System.out.println("=========recordset_7=========="+recordset_7.getRecordCount());
		Recordset queryRecordset_contain = null;
		Recordset queryRecordset_address_intersect = null;
		Recordset queryRecordset_address = null;
		int count =0;
		long startTime = System.currentTimeMillis();
		try {
//			System.out.println("===========recordset_county========"+recordset_county.getRecordCount());
			System.out.println("========包含的数据recordset_Rain==========="+recordset_Rain.getRecordCount());
			Map<String,Set<String>> mapCover = new HashMap<String, Set<String>>();
			Set<String> setIntersect = new HashSet<String>();
			// 第二阶段进行标的数量的统计
			int countAddress = 0;
			while (!recordset_Rain.isEOF()){
				//setSpatialQueryObject不能使用recordset，recordset指的是所有的内容，使用GeoRegion才是循环获取的内容。
				GeoRegion geoRegion=(GeoRegion)recordset_Rain.getGeometry();
				QueryParameter parameterP_address = new QueryParameter();
				parameterP_address.setSpatialQueryObject(geoRegion);
				parameterP_address.setSpatialQueryMode(SpatialQueryMode.INTERSECT);
				parameterP_address.setAttributeFilter("VALIDSTATUS=1");
				if(datasetVector_address!=null){
					queryRecordset_address = datasetVector_address.query(parameterP_address);
//					queryRecordset_address_intersect = datasetVector_county.query(parameterP_address);
					countAddress+=queryRecordset_address.getRecordCount();
				}
				// 用于统计标的数量
				System.out.println("========统计标的数量countAddress==========="+countAddress);
				// 用于统计总的相交的县
//				System.out.println("========相交的县的个数==========="+queryRecordset_address_intersect.getRecordCount());
				
//				while (!queryRecordset_address_intersect.isEOF()){
//					// 县级名称
//					String adminCode = queryRecordset_contain.getString("ADMINCODE");
//					if(!setIntersect.contains(adminCode)){
//						GeoRegion geoRegionAddress=(GeoRegion)queryRecordset_address_intersect.getGeometry();
//						QueryParameter parameterP_address_in = new QueryParameter();
//						parameterP_address_in.setSpatialQueryObject(geoRegionAddress);
//						parameterP_address_in.setSpatialQueryMode(SpatialQueryMode.INTERSECT);
////						String gridCode = recordset_Rain.getString("GRIDCODE");
//						queryRecordset_address = datasetVector_address.query(parameterP_address_in);
//						countAddress += queryRecordset_address.getRecordCount();
//						System.out.println("==========总标的数量==============="+countAddress);
//					}
//					
//					queryRecordset_address_intersect.moveNext();
//	//				count++;
//				}
				recordset_Rain.moveNext();
			}
			long endTime = System.currentTimeMillis();
			System.out.println("===========time===================="+(endTime-startTime)/1000+"s");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MapUtils.closeMapResource(recordset_Rain,queryRecordset_address_intersect,queryRecordset_address,datasetVector_county,
					datasetVector_dataEarlyWarnRain,null,null,  datasource,dsci, workspace);
		}
	}
}
