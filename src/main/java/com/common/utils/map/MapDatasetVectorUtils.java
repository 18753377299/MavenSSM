package com.common.utils.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.supermap.data.CursorType;
import com.supermap.data.DatasetVector;
import com.supermap.data.GeoCircle;
import com.supermap.data.GeoRegion;
import com.supermap.data.Geometrist;
import com.supermap.data.Geometry;
import com.supermap.data.Point2D;
import com.supermap.data.Recordset;

public class MapDatasetVectorUtils {
	
	/*给面数据集增加数据*/
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Recordset addDataToDatasetVector (DatasetVector datasetVector,Object objectList,String radius){
		
		Recordset recordset = datasetVector.getRecordset(false, CursorType.DYNAMIC);
//		BatchEditor editor = recordset.getBatch();
//		// 设置批量更新每次提交的记录数目
//        editor.setMaxRecordCount(50);
//        // 从 World 数据集中读取几何对象和字段值，批量更新到 example 数据集中
//        editor.begin();
		double  [][]dataList = {{22,116,36},{10,110,22}};
		/*转换成list集合*/
		List<Object> list = (List)objectList;
		if(null!=objectList&&list.size()>0){
			for (Object obj :list){
				// 获取半径的值,如果半径为空，则不给相应的面数据集添加数据
				Object object = MapReflectUtils.getRadius(radius,obj);
				String jd = MapReflectUtils.getMethod(obj,"jd").toString();
				String wd = MapReflectUtils.getMethod(obj,"wd").toString();
				if(null != object&&StringUtils.isNotBlank(jd)&&StringUtils.isNotBlank(wd)){
					/*初始化半径*/
					double radiusN = Double.parseDouble(object.toString());
					/*半径应该大于0*/
					if (radiusN<=0){
						continue;
					}
					double distance =  MapReflectUtils.getDistance(obj);
					radiusN = radiusN*1000/distance;
					
					// 通过反射把vo类中字段整合到map中
					Map<String , Object> map =MapReflectUtils.getResultByReflect(obj);
					
					recordset.edit();
					/*设置中心点坐标*/
					Point2D  point2D =new Point2D(Double.parseDouble(jd), Double.parseDouble(wd));
					
					GeoCircle geoCircle =new GeoCircle();
					geoCircle.setRadius(radiusN);
					geoCircle.setCenter(point2D);
					
					/*将圆几何对象转换为面几何对象。*/
					GeoRegion geoRegion = geoCircle.convertToRegion(50);
					Geometry geometry = (Geometry)geoRegion;
					
					recordset.update();
					recordset.addNew(geometry,map);
					// 没有这个数据集更新不能够成功
					recordset.update();
					
					if(geoCircle!=null){
						geoCircle.dispose();
					}
					if(geometry!=null){
						geometry.dispose();
					}
					if(geoRegion!=null){
						geoRegion.dispose();
					}
				}
				
				
			}
			
		}
//		  批量操作统一提交
//        editor.update();

		return  recordset;
	}
	/*给面数据集增加融合数据*/
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Recordset addUnionDataToDatasetVector (DatasetVector datasetVector,Object objectList,String radius,String flag){
		/*转换成list集合*/
		List<Object> list = (List)objectList;
		
		String tfbh = MapReflectUtils.getMethod(list.get(0),"tfbh").toString();
		String filter = "TFBH ="+tfbh;
		Map<String , Object> map = new HashMap<String, Object>();
		map.put("tfbh", tfbh);
		
		Recordset recordset = datasetVector.query(filter,CursorType.DYNAMIC );
		/*如果recordset为null则直接返回*/
		if(recordset==null){
			return recordset;
		}
//		Recordset recordset = datasetVector.getRecordset(false, CursorType.DYNAMIC);
		List<Geometry> geoList=new ArrayList<Geometry>();
		
		if(flag.equals("YJ")){
			// 假如是预警则是新增
			if(null!=objectList&&list.size()>0){
				geoList = MapGeometryUtils.getGeometryList(list,radius,"");
				recordset.edit();
				if(geoList!=null&&geoList.size()>0){
					Geometry geometry = geoList.get(0);
			    	for (int j = 1;j<geoList.size();j++) {
		    			Geometry geome= geoList.get(j);
		    			geometry = Geometrist.union(geometry, geome);
		    		}
			    	recordset.update();
			    	recordset.delete();
					recordset.addNew(geometry,map);
					// 没有这个数据集更新不能够成功
					recordset.update();
					if(geometry!=null){
						geometry.dispose();
					}
				}
				
			}
		}else if(flag.equals("LS")){
			// 假如有数据，则进行合并，否则新增
			if(recordset.getRecordCount()>0){
				Geometry geometry = recordset.getGeometry();
				geoList = MapGeometryUtils.getGeometryList(list,radius,"");
				recordset.edit();
				if(geoList!=null&&geoList.size()>0){
			    	for (int j = 0;j<geoList.size();j++) {
		    			Geometry geome= geoList.get(j);
		    			geometry = Geometrist.union(geometry, geome);
		    		}
			    	recordset.update(); 
			    	recordset.delete();
			    	recordset.addNew(geometry,map);
//					// 没有这个数据集更新不能够成功
					recordset.update();
					if(geometry!=null){
						geometry.dispose();
					}
				}
			} else {
				if(null!=objectList&&list.size()>0){
					geoList = MapGeometryUtils.getGeometryList(list,radius,"");
					recordset.edit();
					if(geoList!=null&&geoList.size()>0){
						Geometry geometry = geoList.get(0);
				    	for (int j = 1;j<geoList.size();j++) {
			    			Geometry geome= geoList.get(j);
			    			geometry = Geometrist.union(geometry, geome);
			    		}
				    	recordset.update();
						recordset.addNew(geometry,map);
						// 没有这个数据集更新不能够成功
						recordset.update();
						if(geometry!=null){
							geometry.dispose();
						}
					}
					
				}
				
			}
		}
		
		return  recordset;
	}
}
