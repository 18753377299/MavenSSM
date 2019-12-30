package com.example.func.iobjectjava.javamain.common;


	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年5月8日 下午5:31:18
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */

public class MapUtils {
    
	
	/**连接数据源*/
//	public static Datasource connectDataSource(Workspace workspace,DatasourceConnectionInfo datasourceconnection,
//			String iobjectJavaServer,String iobjectJavaDatabase,String iobjectJavaUser,String iobjectJavaPassword){
	
	
	/*给面数据集增加数据*/
//	public static Recordset addDataToDatasetVector (DatasetVector datasetVector,List<WzTFLslj>  wzTFLsljsList,String radius){
//		
//		Recordset recordset = datasetVector.getRecordset(false, CursorType.DYNAMIC);
////		BatchEditor editor = recordset.getBatch();
////		// 设置批量更新每次提交的记录数目
////        editor.setMaxRecordCount(50);
////        // 从 World 数据集中读取几何对象和字段值，批量更新到 example 数据集中
////        editor.begin();
//		double  [][]dataList = {{22,116,36},{10,110,22}};
//		
//		if(null!=wzTFLsljsList&&wzTFLsljsList.size()>0){
//			for (WzTFLslj wzTFLslj :wzTFLsljsList){
//				// 获取半径的值,如果半径为空，则不给相应的面数据集添加数据
//				Object object = getRadius(radius,wzTFLslj);
//				String jd = wzTFLslj.getJd();
//				String wd = wzTFLslj.getWd();
//				if(null != object&&StringUtils.isNotBlank(jd)&&StringUtils.isNotBlank(wd)){
//					/*初始化半径*/
//					double radiusN = Double.parseDouble(object.toString());
//					
//					/*半径应该大于0*/
//					if (radiusN<=0){
//						continue;
//					}
//					double distance =  getDistance(wzTFLslj);
//					radiusN = radiusN*1000/distance;
//					
//					// 通过反射把vo类中字段整合到map中
//					Map<String , Object> map =getResultByReflect(wzTFLslj);
////					Map<String , Object> map = new HashMap<String, Object>();
//					
//					recordset.edit();
//					/*设置中心点坐标*/
//					Point2D  point2D =new Point2D(Double.parseDouble(jd), Double.parseDouble(wd));
//					
//					GeoCircle geoCircle =new GeoCircle();
//					geoCircle.setRadius(radiusN);
//					geoCircle.setCenter(point2D);
//					
//					/*将圆几何对象转换为面几何对象。*/
//					GeoRegion geoRegion = geoCircle.convertToRegion(50);
//					Geometry geometry = (Geometry)geoRegion;
//					
//					recordset.update();
//					recordset.addNew(geometry,map);
//					// 没有这个数据集更新不能够成功
//					recordset.update();
//					
//					if(geoCircle!=null){
//						geoCircle.dispose();
//					}
//					if(geometry!=null){
//						geometry.dispose();
//					}
//					if(geoRegion!=null){
//						geoRegion.dispose();
//					}
//				}
//				
//				
//			}
//			
//		}
//		
//		 // 批量操作统一提交
////        editor.update();
//
//		return  recordset;
//	}
	
	
	
}
