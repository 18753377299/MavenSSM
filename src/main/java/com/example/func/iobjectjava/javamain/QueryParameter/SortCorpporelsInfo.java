package com.example.func.iobjectjava.javamain.QueryParameter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

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

/**
 * @author liqiankun
 * @功能: 过滤完全覆盖的(县级信息)
 * @param 
 * @return 
 * @throws Exception
 * @日期：2020-01-15
 */
public class SortCorpporelsInfo {
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
			// 可以用来统计不同级别的降雨完全覆盖的县级行政区
			while (!recordset_Rain.isEOF()){
				//setSpatialQueryObject不能使用recordset，recordset指的是所有的内容，使用GeoRegion才是循环获取的内容。
				GeoRegion geoRegion1=(GeoRegion)recordset_Rain.getGeometry();
				QueryParameter parameterP_address = new QueryParameter();
				parameterP_address.setSpatialQueryObject(geoRegion1);
				parameterP_address.setSpatialQueryMode(SpatialQueryMode.CONTAIN);
//				parameterP_address.setSpatialQueryMode(SpatialQueryMode.INTERSECT);
				String gridCode = recordset_Rain.getString("GRIDCODE");
				queryRecordset_contain = datasetVector_county.query(parameterP_address);
//				System.out.println("==================="+gridCode);
				System.out.println("==================="+queryRecordset_contain.getRecordCount()+":"+gridCode);
				Set<String> strSet = new HashSet<String>();
				while (!queryRecordset_contain.isEOF()){
					count++ ;
					String name = queryRecordset_contain.getString("Name");
					String adminCode = queryRecordset_contain.getString("ADMINCODE");
					String provinceName = queryRecordset_contain.getString("PROVINCENAME");
					System.out.println("==================="+name+":" + adminCode+":"+provinceName);
					
					System.out.println("+++++++++++++++++++++"+count);
					queryRecordset_contain.moveNext();
	//				count++;
					strSet.add(adminCode);
					setIntersect.add(adminCode);
				}
				mapCover.put(gridCode, strSet);
				recordset_Rain.moveNext();
				String gridCode1 = recordset_Rain.getString("GRIDCODE");
				System.out.println("============"+gridCode1+":"+!recordset_Rain.isEOF());
			}
			long endTime = System.currentTimeMillis();
			System.out.println("===========time========"+(endTime-startTime));
			//重新对该数据进行操作
			recordset_Rain.moveFirst();
			// 第二阶段进行标的数量的统计
			long startTimeSecond = System.currentTimeMillis();
			int countAddress = 0;
			while (!recordset_Rain.isEOF()){
				// 清空
				queryRecordset_address_intersect = null;
				//setSpatialQueryObject不能使用recordset，recordset指的是所有的内容，使用GeoRegion才是循环获取的内容。
				GeoRegion geoRegion2=(GeoRegion)recordset_Rain.getGeometry();
				QueryParameter parameterP_address = new QueryParameter();
				parameterP_address.setSpatialQueryObject(geoRegion2);
				parameterP_address.setSpatialQueryMode(SpatialQueryMode.INTERSECT);
				String gridCode = recordset_Rain.getString("GRIDCODE");
//				queryRecordset_address = datasetVector_address.query(parameterP_address);
				queryRecordset_address_intersect = datasetVector_county.query(parameterP_address);
				// 用于统计标的数量
//				System.out.println("==================="+queryRecordset_address.getRecordCount());
				// 用于统计总的相交的县
				System.out.println("========相交的县的个数county==========="+queryRecordset_address_intersect.getRecordCount());
				int cycleNum = 0;
				while (!queryRecordset_address_intersect.isEOF()){
//					queryRecordset_address = null;
//					String name = queryRecordset_contain.getString("Name");
					String proName = queryRecordset_address_intersect.getString("PROVINCENAME");
					// 县级名称
					String adminCode = queryRecordset_address_intersect.getString("AdminCode");
					System.out.println("==========AdminCode================"+adminCode+":"+proName);
//					System.out.println("==========adminCode==============="+adminCode);
					if(StringUtils.isNotBlank(adminCode)&&!setIntersect.contains(adminCode)){
						cycleNum ++;
						GeoRegion geoRegionAddress=(GeoRegion)queryRecordset_address_intersect.getGeometry();
						QueryParameter parameterP_address_in = new QueryParameter();
						parameterP_address_in.setSpatialQueryObject(geoRegionAddress);
						parameterP_address_in.setAttributeFilter("VALIDSTATUS=1");
						parameterP_address_in.setSpatialQueryMode(SpatialQueryMode.INTERSECT);
//						String gridCode = recordset_Rain.getString("GRIDCODE");
						queryRecordset_address = datasetVector_address.query(parameterP_address_in);
						
						countAddress += queryRecordset_address.getRecordCount();
//						System.out.println("==========area============"+geoRegionAddress.getArea());
						System.out.println("========contain==总标的数量sum==============="+countAddress);
					}
					queryRecordset_address_intersect.moveNext();
				}
				System.out.println("=============cycleNum总共循环的次数============" + cycleNum);
				recordset_Rain.moveNext();
			}
			long endTimeSecond = System.currentTimeMillis();
			System.out.println("===========firstTime========"+(endTime-startTime));
			System.out.println("=============secondTime================="+(endTimeSecond-startTimeSecond));
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			MapUtils.closeMapRecordResource(recordset_Rain,queryRecordset_address_intersect,queryRecordset_address, queryRecordset_contain);
			MapUtils.closeMapResource(null,null,null,datasetVector_county,
					datasetVector_dataEarlyWarnRain,datasetVector_address,null,  datasource,dsci, workspace);
		}
	}
//	public Map<String,Set<String>> countCoverCounty(){
//		
//	}
	
}
