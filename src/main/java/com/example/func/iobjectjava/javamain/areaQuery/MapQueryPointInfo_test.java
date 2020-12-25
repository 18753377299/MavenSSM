//package com.iobjectjava.javamain.areaQuery;
//
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import com.iobjectjava.javamain.common.MapUtils;
//import com.supermap.data.DatasetVector;
//import com.supermap.data.Datasource;
//import com.supermap.data.DatasourceConnectionInfo;
//import com.supermap.data.GeoRegion;
//import com.supermap.data.LinkItem;
//import com.supermap.data.LinkItems;
//import com.supermap.data.QueryParameter;
//import com.supermap.data.Recordset;
//import com.supermap.data.SpatialQueryMode;
//import com.supermap.data.Workspace;
//
//	/**
// * @author  作者 E-mail:
// * @date 创建时间：2019年8月7日 上午9:18:30
// * @version 1.0
// * @parameter
// * @since
// * @return  */
//public class MapQueryPointInfo_test {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Workspace workspace = new Workspace();
//		// 定义数据源连接信息，假设以下所有数据源设置都存在
//		DatasourceConnectionInfo datasourceconnection = new  DatasourceConnectionInfo();
//		Datasource datasource = MapUtils.connectDataSource(workspace, datasourceconnection);
//		if(datasource!=null){
//			// 点矢量集
//			DatasetVector datasetVector_address = (DatasetVector)datasource.getDatasets().get("RISKMAP_ADDRESS");
//			DatasetVector datasetVector_c = (DatasetVector)datasource.getDatasets().get("china_city");
//			DatasetVector datasetVector_p = (DatasetVector)datasource.getDatasets().get("TF_New");
//			DatasetVector datasetVector_point = (DatasetVector)datasource.getDatasets().get("RISKMAP_ADDRESS_POINT");
//
//			QueryParameter parameter_pro = new QueryParameter();
//			parameter_pro.setSpatialQueryObject(datasetVector_p);
//			parameter_pro.setSpatialQueryMode(SpatialQueryMode.INTERSECT);
//
//			//查询省市面信息和新增的面数据相交的信息
//			Recordset queryRecordset = datasetVector_c.query(parameter_pro);
//			System.out.println("======查出Ls的省份的个数======:"+queryRecordset.getRecordCount());
//			//通过点数据集和新增面数据集的交集的有效的点的个数
//			parameter_pro.setAttributeFilter("VALIDSTATUS=1");
//			Recordset queryRecordset_address_intersect = datasetVector_address.query(parameter_pro);
//			//清除矢量数据集中的所有记录,清空成功之后，添加新的查询出来的记录
////			boolean riskmapFlag =datasetVector_point.truncate();
////			boolean appendFlag  =false;
////			if(riskmapFlag){
////				appendFlag = datasetVector_point.append(queryRecordset_address_intersect);
////			}
//			System.out.println("======查出Ls的相交的标的的个数======:"+queryRecordset_address_intersect.getRecordCount());
////			queryRecordset.
//			// 省份或者市进行循环
//			int count =0;
//			while(!queryRecordset.isEOF()){
//				String cityAdCode = queryRecordset.getString("CityAdCode");
//				GeoRegion geoRegion=(GeoRegion)queryRecordset.getGeometry();
//				System.out.println(cityAdCode+"面数据是否为空："+queryRecordset.isEmpty());
//
//				QueryParameter parameterP_address = new QueryParameter();
//				parameterP_address.setSpatialQueryObject(geoRegion);
//				parameterP_address.setAttributeFilter("VALIDSTATUS=1");
//				parameterP_address.setSpatialQueryMode(SpatialQueryMode.INTERSECT);
//				// 进行关联查询，过滤掉无效的标的点
//				SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
//			    String tfdate = sdf.format(new Date());
//			    String filter = " RISKMAP_MAIN.ENDDATE>to_date('" +tfdate+ "','yyyy-MM-dd hh24:mi:ss')";
//				LinkItem linkItem = new LinkItem();
//		        linkItem.setConnectionInfo(datasourceconnection);
//		        linkItem.setForeignKeys(new String[] {"ADDRESSID"});//主数据集的外键
//		        linkItem.setPrimaryKeys(new String[] {"ADDRESSID"});//关联数据集的主键
//		        linkItem.setForeignTable("RISKMAP_MAIN");//关联数据集
//		        linkItem.setLinkFields(new String[] {"RISKMAP_MAIN.ADDRESSID","RISKMAP_MAIN.PROPOSALNO","RISKMAP_MAIN.ENDDATE"});//关联数据集的字段
////		        linkItem.setLinkFilter("SMID < 10");//关联数据集的过滤条件
//		        linkItem.setLinkFilter(filter);
//		        linkItem.setName("connect");
////		        System.out.println("关联信息为：" + linkItem.toString());
//		        // 构造一个 LinkItems 对象并将 linkItem 添加到其中
//		        LinkItems linkItems = new LinkItems();
//		        linkItems.add(linkItem);
//		        parameterP_address.setLinkItems(linkItems);
//				//查询出各省或者市的标的信息     queryRecordset_address_intersect
////				Recordset queryRecordset_address = datasetVector_address.query(parameterP_address);
//
//				Recordset queryRecordset_address = datasetVector_point.query(parameterP_address);
//
//				System.out.println(cityAdCode+"=====省的标的个数======="+queryRecordset_address.getRecordCount());
////				String  proposalNo = queryRecordset_address_intersect.getFieldValue("PROPOSALNO")+"";
////				if(StringUtils.isNotBlank(proposalNo)&&!"null".equals(proposalNo.trim())){
////					j++;
////				}
//				count+=queryRecordset_address.getRecordCount();
//				queryRecordset.moveNext();
//			}
//			System.out.println("计算之后的总数："+count);
//			if(queryRecordset_address_intersect!=null){
//				queryRecordset_address_intersect.close();
//				queryRecordset_address_intersect.dispose();
//			}
//			if(datasetVector_c!=null){
//				datasetVector_c.close();
//			}
//			if(datasetVector_p!=null){
//				datasetVector_p.close();
//			}
//	        if(datasetVector_address!=null){
//	        	datasetVector_address.close();
//			}
//
//		    if(datasource!=null){
//				datasource.close();
//			}
//		    if(datasourceconnection!=null){
//				datasourceconnection.dispose();
//			}
//			if(workspace!=null){
//				// 关闭工作空间
//				workspace.close();
//				// 释放该对象所占用的资源
//				workspace.dispose();
//			}
//
//		}
//
//	}
//
//}
