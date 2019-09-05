package com.iobjectjava.grid;

import java.awt.Color;

import com.supermap.data.DatasetGrid;
import com.supermap.data.Datasource;
import com.supermap.data.Maps;
import com.supermap.data.PrjCoordSys;
import com.supermap.data.PrjCoordSysType;
import com.supermap.data.Workspace;
import com.supermap.data.WorkspaceConnectionInfo;
import com.supermap.data.WorkspaceType;
import com.supermap.data.conversion.DataImport;
import com.supermap.data.conversion.IgnoreMode;
import com.supermap.data.conversion.ImportResult;
import com.supermap.data.conversion.ImportSetting;
import com.supermap.data.conversion.ImportSettingGRD;
import com.supermap.mapping.Layer;
import com.supermap.mapping.Map;
import com.supermap.mapping.ThemeGridRange;
import com.supermap.mapping.ThemeGridRangeItem;
import com.supermap.ui.Action;
import com.supermap.ui.MapControl;

/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年8月19日 下午3:32:46
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class GridDataMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		setThemeRangeByFile(true);
		long startDate =System.currentTimeMillis();
		// 绘制专题图
		setThemeRangeByData(true);
		// 导入栅格文件
//		setThemeRangeByDataPng(true);
//		setThemeRangeByFilePng(true);
		long endDate =System.currentTimeMillis();
		System.out.println("=====所需的时间=========="+(endDate-startDate));
	}
	public static void setThemeRangeByFilePng(boolean value) {
		Workspace m_workspace = new Workspace();
		// 打开工作空间和地图
//		WorkspaceConnectionInfo info = new WorkspaceConnectionInfo(
//				"F:/A_supermap/superMap_file/MapFile/db/dataLayer.smwu");
//		WorkspaceConnectionInfo info = new WorkspaceConnectionInfo(
//				"F:/A_supermap/superMap_file/MapFile/Interpolation/Interpolation.smwu");
		WorkspaceConnectionInfo info = new WorkspaceConnectionInfo(
				"F:/A_supermap/superMap_file/MapFile/db_dj/dataLayer.smwu");
		info.setType(WorkspaceType.SMWU);
		m_workspace.open(info);
		Datasource m_datasource = m_workspace.getDatasources().get(0);
		if (m_datasource!=null) {
			 System.out.println("打开m_datasource成功！");
		} else {
			System.out.println("打开m_datasource失败！");
		}
		DataImport dataImport =new DataImport();
//		String filePath ="C:/Users/Administrator/Desktop/aaaa.png";
		String filePath ="C:/Users/Administrator/Desktop/surf.asc";
		
		try {
//			ImportSettingPNG importSettingPNG =new ImportSettingPNG(filePath,m_datasource);
//			importSettingPNG.setImportingAsGrid(true);
			
			ImportSettingGRD importSettingGRD =new ImportSettingGRD(filePath,m_datasource);
//			importSettingGRD.setImportingAsGrid(true);
			//设置是否自动建立影像金字塔
			importSettingGRD.setPyramidBuilt(true);
			//设置 GRD 文件的忽略颜色值的模式
			importSettingGRD.setIgnoreMode(IgnoreMode.IGNORENONE);
			System.out.println("======file======="+dataImport.getImportSettings().getCount());
			dataImport.getImportSettings().add(importSettingGRD);
			System.out.println("=====file========"+dataImport.getImportSettings().getCount());
			ImportResult importResult =dataImport.run();
			ImportSetting []  sets = importResult.getFailedSettings();
			System.out.println("===file===failCount======="+sets.length);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(m_datasource!=null){
	    	m_datasource.close();
		}
	    
	    if(info!=null){
	    	info.dispose();
		}
		if(m_workspace!=null){
			// 关闭工作空间
			m_workspace.close();
			// 释放该对象所占用的资源
			m_workspace.dispose();
		}

		
	}
	
	/**
	 * 设置是否显示栅格分段专题图，直接使用map操作，
	 * 可以在linux无界面环境操作，MapControl 进行有界面操作。
	 */
	public static void setThemeRangeByDataPng(boolean value) {
//		MapControl m_mapControl =  new MapControl();
		Workspace m_workspace = new Workspace();
		Map m_map = new Map(m_workspace);
		// 打开工作空间和地图
		
		WorkspaceConnectionInfo connectionInfo = new WorkspaceConnectionInfo();
		connectionInfo.setType(WorkspaceType.ORACLE);
		connectionInfo.setServer("10.10.68.248:1521/orcl");
		connectionInfo.setDatabase("riskcontrol_freeze");
		connectionInfo.setUser("riskcontrol_freeze");
		connectionInfo.setPassword("Picc_2019risk");
		//工作空间名称
		connectionInfo.setName("riskcontrol_freeze");
		
//		connectionInfo.setType(WorkspaceType.ORACLE);
//		connectionInfo.setServer("10.10.68.248:1521/orcl");
//		connectionInfo.setDatabase("RISKCONTROL_BACK");
//		connectionInfo.setUser("RISKCONTROL_BACK");
//		connectionInfo.setPassword("RISKCONTROL_BACK");
//		//工作空间名称
//		connectionInfo.setName("RISKCONTROL_BACK");
		
		boolean openResult = m_workspace.open(connectionInfo);
		if (openResult) {
			 System.out.println("打开工作空间成功！");
		} else {
			System.out.println("打开工作空间失败！");
		}
//		m_workspace.open(info);
		Datasource m_datasource = m_workspace.getDatasources().get(0);
		// 删除指定名称的数据集
//		m_datasource.getDatasets().delete("surf");
		
//		DataImport dataImport =new DataImport();
//		String filePath ="C:/Users/Administrator/Desktop/aaaa.png";
//		ImportSettingPNG importSettingPNG =new ImportSettingPNG(filePath,m_datasource);
//		importSettingPNG.setImportingAsGrid(true);
//		System.out.println("============="+dataImport.getImportSettings().getCount());
//		dataImport.getImportSettings().add(importSettingPNG);
//		System.out.println("============="+dataImport.getImportSettings().getCount());
//		dataImport.run();
		
		try {
			DataImport dataImport =new DataImport();
//			String filePath ="C:/Users/Administrator/Desktop/aaaa.png";
			String filePath ="C:/Users/Administrator/Desktop/surf.asc";
			
//			ImportSettingPNG importSettingPNG =new ImportSettingPNG(filePath,m_datasource);
//			importSettingPNG.setImportingAsGrid(true);
			
			ImportSettingGRD importSettingGRD =new ImportSettingGRD(filePath,m_datasource);
//			importSettingGRD.setImportingAsGrid(true);
			//设置是否自动建立影像金字塔
			importSettingGRD.setPyramidBuilt(true);
			//设置 GRD 文件的忽略颜色值的模式,IGNORENONE 不忽略颜色值
			importSettingGRD.setIgnoreMode(IgnoreMode.IGNORENONE);
			
			PrjCoordSys prjCoordSys = new PrjCoordSys();
			  //地理经纬坐标
			prjCoordSys.setType(PrjCoordSysType.PCS_EARTH_LONGITUDE_LATITUDE );
			importSettingGRD.setTargetPrjCoordSys(prjCoordSys);
			
			System.out.println("======data======="+dataImport.getImportSettings().getCount());
			dataImport.getImportSettings().add(importSettingGRD);
			System.out.println("======data======="+dataImport.getImportSettings().getCount());
			ImportResult importResult =dataImport.run();
			ImportSetting []  sets = importResult.getFailedSettings();
			System.out.println("===data===failCount======="+sets.length);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		DatasetGrid m_datasetGrid = (DatasetGrid) m_datasource.getDatasets().get("hail_n_days_annual_maxima");
		
//		System.out.println("====栅格数据的总列数======="+m_datasetGrid.getColumnBlockCount());
		
//		m_map.getLayers().add(m_datasetGrid, true);
		
//		Layer m_layerThemeGridRange ;	
		
		try {
			
//			if (m_layerThemeGridRange == null) {
				//构造栅格分段专题图对象
//				ThemeGridRange themeGridRange = new ThemeGridRange();
//
//				//初始化栅格分段专题图子项并设置各自的属性
//				ThemeGridRangeItem item0 = new ThemeGridRangeItem();
//				item0.setStart(-9999);
//				item0.setEnd(m_datasetGrid.getMinValue());
//				item0.setColor(Color.CYAN);
//				item0.setVisible(true);
//
//				ThemeGridRangeItem item1 = new ThemeGridRangeItem();
//				item1.setStart(m_datasetGrid.getMinValue());
//				item1.setEnd(5.3);
//				item1.setColor(Color.GREEN);
//				item1.setVisible(true);
//
//				ThemeGridRangeItem item2 = new ThemeGridRangeItem();
//				item2.setStart(5.3);
//				item2.setEnd(15.7);
//				item2.setColor(Color.BLUE);
//				item2.setVisible(true);
//
//				ThemeGridRangeItem item3 = new ThemeGridRangeItem();
//				item3.setStart(15.7);
//				item3.setEnd(26.0);
//				item3.setColor(Color.RED);
//				item3.setVisible(true);
//
//				ThemeGridRangeItem item4 = new ThemeGridRangeItem();
//				item4.setStart(26.0);
//				item4.setEnd(Double.MAX_VALUE);
//				item4.setColor(Color.GRAY);
//				item4.setVisible(true);
//
//
//				//将栅格分段专题图子项依次添加到栅格分段专题图
//				themeGridRange.addToHead(item0);
//				themeGridRange.addToTail(item1);
//				themeGridRange.addToTail(item2);
//				themeGridRange.addToTail(item3);
//				themeGridRange.addToTail(item4);
//				//添加栅格分段专题图
//				m_layerThemeGridRange = m_map.getLayers().add(
//						m_datasetGrid, themeGridRange, true);
//				//设置图层是否可显示，刷新地图
//				m_layerThemeGridRange.setVisible(value);
//				
//				Maps maps =m_workspace.getMaps();
//				maps.remove("hail_n_days_annual_maxima");
//				maps.add("hail_n_days_annual_maxima1",m_map.toXML());
//				// 保存工作空间
//				m_workspace.save();
//				System.out.println("===setThemeRangeByData=====success==========");
				
//				if(m_datasetGrid!=null){
//					m_datasetGrid.close();
//				}
			    if(m_datasource!=null){
			    	m_datasource.close();
				}
			    
			    if(connectionInfo!=null){
			    	connectionInfo.dispose();
				}
			    if(m_map!=null){
					// 释放该对象所占用的资源
			    	m_map.dispose();
				}
				if(m_workspace!=null){
					// 关闭工作空间
					m_workspace.close();
					// 释放该对象所占用的资源
					m_workspace.dispose();
				}
				
//			}

		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

		
	}
	
	/**
	 * 设置是否显示栅格分段专题图，直接使用map操作，
	 * 可以在linux无界面环境操作，MapControl 进行有界面操作。
	 */
	public static void setThemeRangeByData(boolean value) {
//		MapControl m_mapControl =  new MapControl();
		Workspace m_workspace = new Workspace();
		Map m_map = new Map(m_workspace);
		// 打开工作空间和地图
		
		WorkspaceConnectionInfo connectionInfo = new WorkspaceConnectionInfo();
		connectionInfo.setType(WorkspaceType.ORACLE);
		connectionInfo.setServer("10.10.68.248:1521/orcl");
		connectionInfo.setDatabase("riskcontrol_freeze");
		connectionInfo.setUser("riskcontrol_freeze");
		connectionInfo.setPassword("Picc_2019risk");
		//工作空间名称
		connectionInfo.setName("riskcontrol_freeze");
		
//		connectionInfo.setType(WorkspaceType.ORACLE);
//		connectionInfo.setServer("10.10.68.248:1521/orcl");
//		connectionInfo.setDatabase("RISKCONTROL_BACK");
//		connectionInfo.setUser("RISKCONTROL_BACK");
//		connectionInfo.setPassword("RISKCONTROL_BACK");
//		//工作空间名称
//		connectionInfo.setName("RISKCONTROL_BACK");
		
		boolean openResult = m_workspace.open(connectionInfo);
		if (openResult) {
			 System.out.println("打开工作空间成功！");
		} else {
			System.out.println("打开工作空间失败！");
		}
//		m_workspace.open(info);
		Datasource m_datasource = m_workspace.getDatasources().get(0);
//		DatasetGrid m_datasetGrid = (DatasetGrid) m_datasource.getDatasets().get("Temp5000");
//		DatasetGrid m_datasetGrid = (DatasetGrid) m_datasource.getDatasets().get("hail_n_days_annual_maxima");
//		DatasetGrid m_datasetGrid = (DatasetGrid) m_datasource.getDatasets().get("surf");
		DatasetGrid m_datasetGrid = (DatasetGrid) m_datasource.getDatasets().get("surf_2");
		
//		m_datasetGrid.m_prjCoordSys
		System.out.println("====栅格数据的总列数======="+m_datasetGrid.getColumnBlockCount());
//		m_mapControl.getMap().setWorkspace(m_workspace);
		//调整m_mapControl的状态
//		m_mapControl.setAction(Action.PAN);
//		m_mapControl.getMap().getLayers().add(m_datasetGrid, true);
//		m_mapControl.setWaitCursorEnabled(false);
		
		m_map.getLayers().add(m_datasetGrid, true);
		
		Layer m_layerThemeGridRange ;	
		
		try {
			
//			if (m_layerThemeGridRange == null) {
				//构造栅格分段专题图对象
				ThemeGridRange themeGridRange = new ThemeGridRange();

				//初始化栅格分段专题图子项并设置各自的属性
				ThemeGridRangeItem item0 = new ThemeGridRangeItem();
				item0.setStart(-9999);
//				item0.setStart(0);
				item0.setEnd(m_datasetGrid.getMinValue());
				item0.setColor(Color.CYAN);
				item0.setVisible(true);

				ThemeGridRangeItem item1 = new ThemeGridRangeItem();
				item1.setStart(m_datasetGrid.getMinValue());
				item1.setEnd(5.3);
				item1.setColor(Color.GREEN);
				item1.setVisible(true);

				ThemeGridRangeItem item2 = new ThemeGridRangeItem();
				item2.setStart(5.3);
				item2.setEnd(15.7);
				item2.setColor(Color.BLUE);
				item2.setVisible(true);

				ThemeGridRangeItem item3 = new ThemeGridRangeItem();
				item3.setStart(15.7);
				item3.setEnd(26.0);
				item3.setColor(Color.RED);
				item3.setVisible(true);

				ThemeGridRangeItem item4 = new ThemeGridRangeItem();
				item4.setStart(26.0);
				item4.setEnd(Double.MAX_VALUE);
				item4.setColor(Color.GRAY);
				item4.setVisible(true);


				//将栅格分段专题图子项依次添加到栅格分段专题图
				themeGridRange.addToHead(item0);
				themeGridRange.addToTail(item1);
				themeGridRange.addToTail(item2);
				themeGridRange.addToTail(item3);
				themeGridRange.addToTail(item4);
				//添加栅格分段专题图
//				m_layerThemeGridRange = m_mapControl.getMap().getLayers().add(
//						m_datasetGrid, themeGridRange, true);
				m_layerThemeGridRange = m_map.getLayers().add(
						m_datasetGrid, themeGridRange, true);
				//设置图层是否可显示，刷新地图
				m_layerThemeGridRange.setVisible(value);
//				m_mapControl.getMap().refresh();
				
				Maps maps =m_workspace.getMaps();
//				maps.remove("Temp5001");
//				maps.add("Temp5001",m_map.toXML());
//				hail_n_days_annual_maxima
				maps.remove("surf_2");
				maps.add("surf_2",m_map.toXML());
				// 保存工作空间
				m_workspace.save();
				System.out.println("===setThemeRangeByData=====success==========");
				
				if(m_datasetGrid!=null){
					m_datasetGrid.close();
				}
			    if(m_datasource!=null){
			    	m_datasource.close();
				}
			    
			    if(connectionInfo!=null){
			    	connectionInfo.dispose();
				}
			    if(m_map!=null){
					// 释放该对象所占用的资源
			    	m_map.dispose();
				}
				if(m_workspace!=null){
					// 关闭工作空间
					m_workspace.close();
					// 释放该对象所占用的资源
					m_workspace.dispose();
				}
				
//			}

		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

		
	}
	
	/**
	 * 设置是否显示栅格分段专题图
	 */
	public static void setThemeRangeByFile(boolean value) {
		MapControl m_mapControl =  new MapControl();
		Workspace m_workspace = new Workspace();
		// 打开工作空间和地图
//		WorkspaceConnectionInfo info = new WorkspaceConnectionInfo(
//				"F:/A_supermap/superMap_file/MapFile/db/dataLayer.smwu");
		WorkspaceConnectionInfo info = new WorkspaceConnectionInfo(
				"F:/A_supermap/superMap_file/MapFile/Interpolation/Interpolation.smwu");
		info.setType(WorkspaceType.SMWU);
		m_workspace.open(info);
		Datasource m_datasource = m_workspace.getDatasources().get(0);
		DatasetGrid m_datasetGrid = (DatasetGrid) m_datasource.getDatasets().get("Temp5000");

		m_mapControl.getMap().setWorkspace(m_workspace);
		//调整m_mapControl的状态
		m_mapControl.setAction(Action.PAN);
		m_mapControl.getMap().getLayers().add(m_datasetGrid, true);
		m_mapControl.setWaitCursorEnabled(false);
		
		Layer m_layerThemeGridRange ;	
		
		try {
//			if (m_layerThemeGridRange == null) {
				//构造栅格分段专题图对象
				ThemeGridRange themeGridRange = new ThemeGridRange();

				//初始化栅格分段专题图子项并设置各自的属性
				ThemeGridRangeItem item0 = new ThemeGridRangeItem();
				item0.setStart(-9999);
				item0.setEnd(m_datasetGrid.getMinValue());
				item0.setColor(Color.CYAN);
				item0.setVisible(true);

				ThemeGridRangeItem item1 = new ThemeGridRangeItem();
				item1.setStart(m_datasetGrid.getMinValue());
				item1.setEnd(5.3);
				item1.setColor(Color.GREEN);
				item1.setVisible(true);

				ThemeGridRangeItem item2 = new ThemeGridRangeItem();
				item2.setStart(5.3);
				item2.setEnd(15.7);
				item2.setColor(Color.BLUE);
				item2.setVisible(true);

				ThemeGridRangeItem item3 = new ThemeGridRangeItem();
				item3.setStart(15.7);
				item3.setEnd(26.0);
				item3.setColor(Color.RED);
				item3.setVisible(true);

				ThemeGridRangeItem item4 = new ThemeGridRangeItem();
				item4.setStart(26.0);
				item4.setEnd(Double.MAX_VALUE);
				item4.setColor(Color.GRAY);
				item4.setVisible(true);


				//将栅格分段专题图子项依次添加到栅格分段专题图
				themeGridRange.addToHead(item0);
				themeGridRange.addToTail(item1);
				themeGridRange.addToTail(item2);
				themeGridRange.addToTail(item3);
				themeGridRange.addToTail(item4);
				//添加栅格分段专题图
				m_layerThemeGridRange = m_mapControl.getMap().getLayers().add(
						m_datasetGrid, themeGridRange, true);
				//设置图层是否可显示，刷新地图
				m_layerThemeGridRange.setVisible(value);
//				m_mapControl.getMap().refresh();
				Maps maps =m_workspace.getMaps();
				maps.remove("Temp5000");
				
				Map map = m_mapControl.getMap();
				map.ensureVisible(m_layerThemeGridRange);
				
				maps.add("Temp5000",map.toXML());
				
//				Map map = new Map(m_workspace);
				// 用于全幅显示给定的图层所对应的空间对象
//				map.ensureVisible(m_layerThemeGridRange);
				// 保存工作空间
				m_workspace.save();
				
//			}

		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

		
	}
	

}
