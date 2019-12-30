package com.common.utils.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.supermap.data.GeoCircle;
import com.supermap.data.GeoRegion;
import com.supermap.data.Geometrist;
import com.supermap.data.Geometry;
import com.supermap.data.Point2D;
import com.supermap.data.Recordset;

public class MapGeometryUtils {
	/*对geometry中list数据进行融合*/
	public static void unionGeometryList(List<Geometry> geometryList,Recordset recordset_new,Map<String,Object> map){
		// 将新增的数据集进行整合成一个面数据
		if(geometryList!=null&&geometryList.size()>0){
			Geometry geometryNew = geometryList.get(0);
			for(int i=0;i<geometryList.size();i++){
				Geometry geome= geometryList.get(i);
				geometryNew = Geometrist.union(geometryNew, geome);
			}
			recordset_new.edit();
			recordset_new.update();
			recordset_new.delete();
			recordset_new.addNew(geometryNew,map);
			/*没有这个数据集更新不能够成功*/
			recordset_new.update();
		}
	}
	
	/*需要整合面数据的集合*/
	public static List<Geometry> getGeometryList(List<Object> list,String radius,String flag){
		
		List<Geometry> geoList=new ArrayList<Geometry>();
		if(list!=null&&list.size()>0){
			for (Object obj :list){
				// 获取半径的值,如果半径为空，则不给相应的面数据集添加数据
				Object object  = new Object();
				if("YJ".equals(flag)){
					object = radius;
				}else {
					object = MapReflectUtils.getRadius(radius,obj);
				}
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
//					Map<String , Object> map =getResultByReflect(obj);
					/*设置中心点坐标*/
					Point2D  point2D =new Point2D(Double.parseDouble(jd), Double.parseDouble(wd));
					
					GeoCircle geoCircle =new GeoCircle();
					geoCircle.setRadius(radiusN);
					geoCircle.setCenter(point2D);
					/*将圆几何对象转换为面几何对象。*/
					GeoRegion geoRegion = geoCircle.convertToRegion(50);
					Geometry geometry = (Geometry)geoRegion;
					geoList.add(geometry);
					
//					if(geoCircle!=null){
//						geoCircle.dispose();
//					}
//					if(geometry!=null){
//						geometry.dispose();
//					}
//					if(geoRegion!=null){
//						geoRegion.dispose();
//					}
				}
			}
		}
		return geoList;
		
	}
	
}
