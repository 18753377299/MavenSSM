package com.iobjectjava.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import com.common.utils.MapUtils;
import com.iobjectjava.service.SuperMapService;
import com.iobjectjava.vo.AttributeVo;
import com.iobjectjava.vo.FeatureVo;
import com.iobjectjava.vo.ReceivePolygonVector;
import com.po.response.AjaxResult;
import com.supermap.data.CursorType;
import com.supermap.data.DatasetGrid;
import com.supermap.data.DatasetType;
import com.supermap.data.DatasetVector;
import com.supermap.data.DatasetVectorInfo;
import com.supermap.data.Datasets;
import com.supermap.data.Datasource;
import com.supermap.data.DatasourceConnectionInfo;
import com.supermap.data.Feature;
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
	
	private static final String dataEarlyWarn = "TyphoonEarlyWarn";
	
	@SuppressWarnings({ "deprecation", "unused" })
	public AjaxResult testMapWarn(String tfbh){
		AjaxResult ajaxResult =new AjaxResult();
		Workspace workspace = new Workspace();
		// 定义数据源连接信息，假设以下所有数据源设置都存在
	    DatasourceConnectionInfo datasourceconnection = new  DatasourceConnectionInfo();
		Datasource datasource = MapUtils.connectDataSource(workspace,datasourceconnection);
		// 创建栅格数据集
		DatasetGrid datasetGridNew =MapUtils.createDatasetGrid(datasource);
		
		datasetGridNew.open();
		double value = datasetGridNew.setValue(10, 10, 0.2);
		
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
	
	/**
     * @Description 操作台风面
     * @Author 
     * @param obj
     * @return void
     * @Date 20190917
     */
	public  AjaxResult operateEarlyWarn(ReceivePolygonVector receivePolygonVector){
		AjaxResult ajaxResult =new AjaxResult();
		
		String dataSetName = dataEarlyWarn+UUID.randomUUID().toString().replace("-", "");
		Workspace workspace = new Workspace();
		// 定义数据源连接信息，假设以下所有数据源设置都存在
	    DatasourceConnectionInfo datasourceconnection = new  DatasourceConnectionInfo();
		Datasource datasource = MapUtils.connectDataSource(workspace,datasourceconnection);
		AttributeVo attributeVo =new AttributeVo();
		//创建面数据集
		DatasetVector datasetVector_new = MapUtils.createDataSet(dataSetName,datasource,attributeVo);
		// 将面数据增加到面数据集中
		// 新增的数据集
		Recordset recordset_new = datasetVector_new.getRecordset(false, CursorType.DYNAMIC);
//		List<Geometry> geometryList = new ArrayList<Geometry>();
		/*将json数据组织成面数据*/
		recordset_new = this.generatePolygonData(receivePolygonVector,recordset_new);
		Map<Integer,Feature>  features= recordset_new.getAllFeatures();
		ajaxResult.setData(features);
		ajaxResult.setStatus(1);
	 // 关闭地图资源
	    MapUtils.closeMapResource(recordset_new,null,datasetVector_new,null,null,null,
	    		datasource,datasourceconnection,workspace);
	    return ajaxResult;
	}
	/**
     * @Description 通过json数据生成面数据，面数据中有多条数据
     * @Author 
     * @param obj
     * @return Recordset
     * @Date 20190917
     */
	@SuppressWarnings("deprecation")
	public Recordset  generatePolygonData(ReceivePolygonVector receivePolygonVector,Recordset recordset_new){
		try {
			if(receivePolygonVector!=null){
				List<FeatureVo>  featureVoList = receivePolygonVector.getFeatures();
				if(featureVoList!=null &&featureVoList.size()>0){
					for(FeatureVo featureVo:featureVoList){
						Map<String,Object> map = MapUtils.getResultByReflect(featureVo.getAttributes());
						/*使用这种方式减少了一层嵌套，使层级减少*/
						if(map.isEmpty() || StringUtils.isBlank(featureVo.getGeometry())){
							continue;
						}
						//将json面数据转换成面
						Geometry  geometry = Toolkit.GeoJsonToGemetry(featureVo.getGeometry());
						recordset_new.edit();
						recordset_new.update();
//					recordset_new.delete();
						recordset_new.addNew(geometry,map);
						// 没有这个数据集更新不能够成功
						recordset_new.update();
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return recordset_new;
	}
	/**
     * @Description 将数据源中的数据集进行 在页面展示
     * @Author 
     * @param obj
     * @return AjaxResult
     * @Date 20190918
     */
	public AjaxResult operateEarlyWarnArea(){
		AjaxResult ajaxResult =new AjaxResult();
		
		String dataSetName = "TyphoonEarlyWarna13708bee20440909b34bf2b7866529e";
		Workspace workspace = new Workspace();
		// 定义数据源连接信息，假设以下所有数据源设置都存在
	    DatasourceConnectionInfo datasourceconnection = new  DatasourceConnectionInfo();
		Datasource datasource = MapUtils.connectDataSource(workspace,datasourceconnection);
		DatasetVector datasetVector_new = (DatasetVector)datasource.getDatasets().get(dataSetName);
		// 新增的数据集
		Recordset recordset_new = datasetVector_new.getRecordset(false, CursorType.DYNAMIC);
//		List<Geometry> geometryList = new ArrayList<Geometry>();
		List<FeatureVo>  featureVoList= this.getPolygonVector(recordset_new);
		ajaxResult.setData(featureVoList);
		ajaxResult.setStatus(1);
	 // 关闭地图资源
	    MapUtils.closeMapResource(recordset_new,null,datasetVector_new,null,null,null,
	    		datasource,datasourceconnection,workspace);
	    return ajaxResult;
	}
	/**
     * @Description 获取返回的对象的值
     * @Author 
     * @param obj
     * @return List<FeatureVo>
     * @Date 20190918
     */
	public List<FeatureVo> getPolygonVector(Recordset recordset_new){
//		ReceivePolygonVector receivePolygonVector =new ReceivePolygonVector();
		List<FeatureVo> featureVoList =new ArrayList<FeatureVo>();
		if(recordset_new != null){
			Map<Integer,Feature>  features= recordset_new.getAllFeatures();
			for(Feature feature:features.values()){
				FeatureVo featureVo  =new FeatureVo();
	    		Geometry geometry= feature.getGeometry(); 
	    		String geometryJson = Toolkit.GemetryToGeoJson(geometry);
	    		featureVo.setGeometry(geometryJson);
	    		AttributeVo attributeVo =  this.setAttributeVo(feature);
	    		featureVo.setAttributes(attributeVo);
	    		featureVoList.add(featureVo);
	    		if(feature!=null){
	    			feature.dispose();
	    		}
			}
		}
		return  featureVoList;
	} 
	/**
     * @Description 将字段中值设置到对象中去
     * @Author 
     * @param obj
     * @return AttributeVo
     * @Date 20190918
     */
	public AttributeVo setAttributeVo(Feature feature){
		AttributeVo attributeVo =new AttributeVo();
		if(feature!=null){
			String areaDesc = feature.getString("areaDesc");
			String description = feature.getString("description");
			String eventType = feature.getString("eventType");
			String headline = feature.getString("headline");
			String identifier = feature.getString("identifier");
			String sendTime = feature.getString("sendTime");
			String severity = feature.getString("severity");
			String x = feature.getString("x");
			String y = feature.getString("y");
			attributeVo.setAreaDesc(areaDesc);
			attributeVo.setDescription(description);
			attributeVo.setEventType(eventType);
			attributeVo.setHeadline(headline);
			attributeVo.setIdentifier(identifier);
			attributeVo.setSendTime(sendTime);
			attributeVo.setSeverity(severity);
			attributeVo.setX(x);
			attributeVo.setY(y);
		}
		return attributeVo;
	}
	
	
	
}
