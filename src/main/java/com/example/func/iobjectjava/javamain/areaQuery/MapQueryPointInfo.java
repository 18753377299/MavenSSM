package com.iobjectjava.javamain.areaQuery;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.iobjectjava.javamain.common.MapUtils;
import com.supermap.data.DatasetVector;
import com.supermap.data.Datasource;
import com.supermap.data.DatasourceConnectionInfo;
import com.supermap.data.FieldInfo;
import com.supermap.data.FieldInfos;
import com.supermap.data.LinkItem;
import com.supermap.data.LinkItems;
import com.supermap.data.QueryParameter;
import com.supermap.data.Recordset;
import com.supermap.data.SpatialQueryMode;
import com.supermap.data.Workspace;

	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年8月7日 上午9:18:30
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class MapQueryPointInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Workspace workspace = new Workspace();
		// 定义数据源连接信息，假设以下所有数据源设置都存在
		DatasourceConnectionInfo datasourceconnection = new  DatasourceConnectionInfo();
		Datasource datasource = MapUtils.connectDataSource(workspace, datasourceconnection);
		if(datasource!=null){
			// 点矢量集
			DatasetVector datasetVector_address = (DatasetVector)datasource.getDatasets().get("RISKMAP_ADDRESS");
//			DatasetVector datasetVector_p = (DatasetVector)datasource.getDatasets().get("TF_New");
			DatasetVector datasetVector_rain = (DatasetVector)datasource.getDatasets().get("dataEarlyWarnRain_new");
			// 数据集表的名称
			String tableName = datasetVector_address.getTableName();
			
			QueryParameter parameter_p = new QueryParameter();
//			parameter_p.setSpatialQueryObject(datasetVector_p);
			parameter_p.setSpatialQueryObject(datasetVector_rain);
			parameter_p.setSpatialQueryMode(SpatialQueryMode.INTERSECT);
			// 进行日期查询
		    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		    Calendar calendar = Calendar.getInstance();
		    calendar.setTime(new Date());
		    calendar.set(Calendar.YEAR, (calendar.get(Calendar.YEAR)+10));
		    calendar.set(Calendar.HOUR_OF_DAY, (calendar.get(Calendar.HOUR_OF_DAY)-24));
		    String tfdate = sdf.format(calendar.getTime());
//		    String tfdate = "2017-04-11 00:00:00";
		    String filter = " RISKMAP_MAIN.ENDDATE>to_date('" +tfdate+ "','yyyy-MM-dd hh24:mi:ss')";
			//通过点数据集和新增面数据集的交集的有效的点的个数
//			parameter_p.setAttributeFilter("VALIDSTATUS=1 and SMID=109");
			parameter_p.setAttributeFilter("VALIDSTATUS=1");
//		    parameter_p.setAttributeFilter(filter);
			
//			JoinItems joinItems = new JoinItems();
//			JoinItem joinitem = new JoinItem();
//			joinitem.setForeignTable("RISKMAP_MAIN");
//	        joinitem.setJoinFilter(filter);
//	        joinitem.setJoinType(JoinType.LEFTJOIN);
////	        joinitem.setName("Connect");
//	        joinItems.add(joinitem);
//			parameter_p.setJoinItems(joinItems);
			LinkItem linkItem = new LinkItem();
	        linkItem.setConnectionInfo(datasourceconnection);
	        linkItem.setForeignKeys(new String[] {"ADDRESSID"});//主数据集的外键
	        linkItem.setPrimaryKeys(new String[] {"ADDRESSID"});//关联数据集的主键
	        linkItem.setForeignTable("RISKMAP_MAIN");//关联数据集
	        linkItem.setLinkFields(new String[] {"RISKMAP_MAIN.ADDRESSID","RISKMAP_MAIN.PROPOSALNO","RISKMAP_MAIN.ENDDATE"});//关联数据集的字段
//	        linkItem.setLinkFilter("SMID < 10");//关联数据集的过滤条件 
	        linkItem.setLinkFilter(filter);
	        linkItem.setName("关联");

	        System.out.println("关联信息为：" + linkItem.toString());

	        // 构造一个 LinkItems 对象并将 linkItem 添加到其中
	        LinkItems linkItems = new LinkItems();
	        linkItems.add(linkItem);
	        parameter_p.setLinkItems(linkItems);
			
			Recordset queryRecordset_address_intersect = datasetVector_address.query(parameter_p);
			FieldInfos  fieldInfos = queryRecordset_address_intersect.getFieldInfos();
			int count = fieldInfos.getCount();
			System.out.println("=====================输出字段名称");
			for(int i=0;i<count;i++){
				FieldInfo  fieldInfo = fieldInfos.get(i);
				String  name = fieldInfo.getName();
				String  value = fieldInfo.getDefaultValue();
				System.out.println(name+":"+value);
			}
//			FieldInfo  fieldInfo = fieldInfos.get(0);
//			String  name = fieldInfo.getName();
//			String  value = fieldInfo.getDefaultValue();
			System.out.println("======查出的相交的标的的个数======"+queryRecordset_address_intersect.getRecordCount());
			int j=0;
			while (!queryRecordset_address_intersect.isEOF()){
				String  proposalNo = queryRecordset_address_intersect.getFieldValue("PROPOSALNO")+"";
				if(StringUtils.isNotBlank(proposalNo)&&!"null".equals(proposalNo.trim())){
					j++;
					Integer  smid = Integer.parseInt(queryRecordset_address_intersect.getFieldValue("SMID")+"");
					String  endDate = queryRecordset_address_intersect.getFieldValue("ENDDATE")+"";
					System.out.println("============="+smid+":"+proposalNo+":"+endDate);
				}
				queryRecordset_address_intersect.moveNext();
			}
			System.out.println("=====有效的标的个数======="+j);
			
			if(queryRecordset_address_intersect!=null){
				queryRecordset_address_intersect.close();
				queryRecordset_address_intersect.dispose();
			}
	        if(datasetVector_address!=null){
	        	datasetVector_address.close();
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

}
