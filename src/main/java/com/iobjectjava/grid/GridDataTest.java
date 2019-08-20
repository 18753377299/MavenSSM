package com.iobjectjava.grid;

import java.awt.Color;

import com.supermap.data.DatasetGrid;
import com.supermap.data.Datasource;
import com.supermap.data.Maps;
import com.supermap.data.Workspace;
import com.supermap.data.WorkspaceConnectionInfo;
import com.supermap.data.WorkspaceType;
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
public class GridDataTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		setThemeRangeByFile(true);
		long startDate =System.currentTimeMillis();
		setThemeRangeByData(true);
		long endDate =System.currentTimeMillis();
		System.out.println("=====所需的时间=========="+(endDate-startDate));
	}
	
	/**
	 * 设置是否显示栅格分段专题图
	 */
	public static void setThemeRangeByData(boolean value) {
		MapControl m_mapControl =  new MapControl();
		Workspace m_workspace = new Workspace();
		// 打开工作空间和地图
//		WorkspaceConnectionInfo info = new WorkspaceConnectionInfo(
//				"F:/A_supermap/superMap_file/MapFile/db/dataLayer.smwu");
//		WorkspaceConnectionInfo info = new WorkspaceConnectionInfo(
//				"F:/A_supermap/superMap_file/MapFile/Interpolation/Interpolation.smwu");
//		info.setType(WorkspaceType.SMWU);
		
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
		DatasetGrid m_datasetGrid = (DatasetGrid) m_datasource.getDatasets().get("Temp5000");
		System.out.println("====栅格数据的总列数======="+m_datasetGrid.getColumnBlockCount());
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
				maps.add("Temp5000",m_mapControl.getMap().toXML());
				
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
			    if(m_mapControl!=null){
					// 释放该对象所占用的资源
			    	m_mapControl.dispose();
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
