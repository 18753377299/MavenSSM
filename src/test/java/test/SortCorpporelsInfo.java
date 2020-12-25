//package test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//
//import com.common.utils.MapUtils;
//import com.example.func.iobjectjava.javamain.vo.WzCorporeLs;
//import com.supermap.data.CursorType;
//import com.supermap.data.DatasetVector;
//import com.supermap.data.Datasource;
//import com.supermap.data.DatasourceConnectionInfo;
//import com.supermap.data.GeoRegion;
//import com.supermap.data.QueryParameter;
//import com.supermap.data.Recordset;
//import com.supermap.data.SpatialQueryMode;
//import com.supermap.data.Workspace;
//
//public class SortCorpporelsInfo {
//
//	@Autowired
//	JdbcTemplate jdbcTemplate;
//
//	@Test
//	public  void sortData() {
//		Workspace workspace = new Workspace();
//		// 定义数据源连接信息，假设以下所有数据源设置都存在
//	    DatasourceConnectionInfo dsci = new  DatasourceConnectionInfo();
//		//进行数据源的连接
//		Datasource datasource =MapUtils.connectDataSource(workspace,dsci);
//		//获取县行政区划china_county，
//		DatasetVector datasetVector_county = (DatasetVector)datasource.getDatasets().get("china_county");
//
//		DatasetVector datasetVector_TFUNION_7M = (DatasetVector)datasource.getDatasets().get("TFUNION_7M");
//
//		Recordset recordset_county = datasetVector_county.getRecordset(false, CursorType.DYNAMIC);
//
//		String filter = "tfbh =201822";
//		Recordset recordset_7 = datasetVector_TFUNION_7M.query(filter,CursorType.DYNAMIC );
//		System.out.println("=========recordset_7=========="+recordset_7.getRecordCount());
//		Recordset queryRecordset_contain = null;
//
//		while (!recordset_7.isEOF()){
//			String tfbh = recordset_7.getString("tfbh");
//			System.out.println("==================="+tfbh);
//			List<WzCorporeLs> wzCorporeLsPList = new ArrayList<WzCorporeLs>();
//			recordset_7.moveNext();
//		}
//		System.out.println("==================="+recordset_county.getRecordCount());
//		GeoRegion geoRegion=(GeoRegion)recordset_7.getGeometry();
//		QueryParameter parameterP_address = new QueryParameter();
////		parameterP_address.setSpatialQueryObject(datasetVector_TFUNION_7M);
//		parameterP_address.setSpatialQueryObject(recordset_7);
////		parameterP_address.setAttributeFilter("VALIDSTATUS=1");
//		parameterP_address.setSpatialQueryMode(SpatialQueryMode.CONTAIN);
//
//		queryRecordset_contain = datasetVector_county.query(parameterP_address);
//		System.out.println("========包含的数据==========="+queryRecordset_contain.getRecordCount());
//		int count =0;
//		while (!queryRecordset_contain.isEOF()){
//			count++ ;
//			String name = queryRecordset_contain.getString("Name");
//			String proName = queryRecordset_contain.getString("PRONAME");
//			String ProAdCode = queryRecordset_contain.getString("ProAdCode");
//			System.out.println("==================="+name+":" + proName+":"+ProAdCode);
//
//			System.out.println("+++++++++++++++++++++"+count);
//			queryRecordset_contain.moveNext();
//		}
//
//
//		MapUtils.closeMapResource(recordset_7,recordset_county,queryRecordset_contain,datasetVector_county,
//				datasetVector_TFUNION_7M,null,null,  datasource,dsci, workspace);
//
//	}
//}
