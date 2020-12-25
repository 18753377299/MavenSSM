package com.example.func.iobjectjava.javamain.workspacetest;


import java.io.File;

import javax.swing.JOptionPane;

import com.supermap.data.BlockSizeOption;
import com.supermap.data.Colors;
import com.supermap.data.Dataset;
import com.supermap.data.DatasetGridInfo;
import com.supermap.data.DatasetImageInfo;
import com.supermap.data.DatasetType;
import com.supermap.data.DatasetVectorInfo;
import com.supermap.data.Datasets;
import com.supermap.data.Datasource;
import com.supermap.data.DatasourceConnectionInfo;
import com.supermap.data.EncodeType;
import com.supermap.data.EngineType;
import com.supermap.data.PixelFormat;
import com.supermap.data.Workspace;
import com.supermap.data.WorkspaceConnectionInfo;
import com.supermap.data.WorkspaceType;

/**
 * <p>
 * Title:数据集管理
 * </p>
 * 
 * <p>
 * Description:
 * ============================================================================>
 * ------------------------------版权声明----------------------------
 * 此文件为SuperMap Objects Java 的示范代码 
 * 版权所有：北京超图软件股份有限公司
 * ----------------------------------------------------------------
 * ---------------------SuperMap iObjects Java 示范程序说明------------------------
 * 
 * 1、范例简介：示范如何管理数据集
 * 2、示例数据：安装目录\SampleData\World\World.smwu
 * 3、关键类型/成员: 
 *     Datasets.delete(String name) 方法
 *     Datasets.rename(String oldName,String newName) 方法
 *     Datasets.create(DatasetGridInfo datasetInfo) 方法
 *     Datasets.create(DatasetImageInfo datasetInfo) 方法
 *     Datasets.create(DatasetVectorInfo datasetInfo) 方法
 * 4、使用步骤：
 *  (1)点击“删除选中”按钮，删除选中的数据集
 *  (2)点击“重命名”按钮，重命名选中数据集
 *  (3)点击“创建”按钮，创建新的数据集 
 * ------------------------------------------------------------------------------
 * ============================================================================>
 * </p> 
 * 
 * <p>
 * Company: 北京超图软件股份有限公司
 * </p>
 * 
 */

public class SampleRun {
	private Workspace m_workspace;

	private Datasource m_datasource;

	/**
	 * 构造 SampleRun对象
	 */
	public SampleRun(Workspace workspace) {
		this.m_workspace = workspace;
		initialize();
	}

	/**
	 * 打开需要的工作空间文件
	 */
	private void initialize() {
		try {
			// 打开工作空间
			WorkspaceConnectionInfo conInfo = new WorkspaceConnectionInfo(
					"../../SampleData/World/World.smwu");
			conInfo.setType(WorkspaceType.SMWU);
			m_workspace.open(conInfo);

			//删除临时创建的数据源
			deleteTempDatasource();
			//创建一个数据源
			createTempDatasource();

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	/**
	 * 删除数据源
	 */
	private void deleteTempDatasource() {
		File file = new File("../../SampleData/World/CopyWorld.udb");
		if (file.exists()) {
			file.delete();
		}
		File file2 = new File("../../SampleData/World/CopyWorld.udd");
		if (file2.exists()) {
			file2.delete();
		}
	}

	private void createTempDatasource() {
		DatasourceConnectionInfo info = new DatasourceConnectionInfo();
		info.setEngineType(EngineType.UDB);
		info.setServer("../../SampleData/World/CopyWorld.udb");
		info.setAlias("CopyWorld");
		m_datasource = m_workspace.getDatasources().create(info);

		//拷贝数据
		int count = m_workspace.getDatasources().get(0).getDatasets()
				.getCount();
		for (int i = 0; i < count; i++) {
			Dataset dataset = m_workspace.getDatasources().get(0).getDatasets()
					.get(i);
			m_datasource.copyDataset(dataset, dataset.getName(),
					EncodeType.NONE);
		}

	}

	/**
	 * 获取数据集名数组
	 * @return 数据集名数组
	 */
	public String[] getDatasetsName() {
		Datasets datasets = m_datasource.getDatasets();
		String[] names = new String[datasets.getCount()];
		for (int i = 0; i < names.length; i++) {
			names[i] = datasets.get(i).getName();
		}
		return names;
	}

	/**
	 * 根据名字删除数据集
	 */
	public void deleteDataset(String datasetName) {
		m_datasource.getDatasets().delete(datasetName);
	}

	/**
	 * 重命名数据集
	 */
	public void renameDataset(String oldName, String newName) {
		if (!m_datasource.getDatasets().isAvailableDatasetName(newName)) {
			JOptionPane.showMessageDialog(null, "数据集名字不可用");
			return;
		}
		try {
			m_datasource.getDatasets().rename(oldName, newName);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	/**
	 *  根据类型创建数据集  
	 */
	public void createDataset(String datasetType, String name) {
		Datasets datasets = m_datasource.getDatasets();
		try {
			if (!datasets.isAvailableDatasetName(name)) {
			JOptionPane.showMessageDialog(null, "数据集名字不可用");
				return;
			}
			if (datasetType.equals("影像数据集")) {
				DatasetImageInfo datasetImageInfo = new DatasetImageInfo();
				datasetImageInfo.setName(name);
				datasetImageInfo.setBlockSizeOption(BlockSizeOption.BS_128);
				datasetImageInfo.setHeight(200);
				datasetImageInfo.setWidth(200);
				datasetImageInfo.setEncodeType(EncodeType.NONE);
				datasets.create(datasetImageInfo);
			} else if (datasetType.equals("栅格数据集")) {
				DatasetGridInfo datasetGridInfo = new DatasetGridInfo();
				datasetGridInfo.setName(name);
				datasetGridInfo.setBlockSizeOption(BlockSizeOption.BS_128);
				datasetGridInfo.setHeight(200);
				datasetGridInfo.setWidth(200);
				datasetGridInfo.setNoValue(1.0);
				datasetGridInfo.setPixelFormat(PixelFormat.SINGLE);
				datasetGridInfo.setEncodeType(EncodeType.LZW);

				datasets.create(datasetGridInfo);
			} else {
				DatasetVectorInfo datasetVectorInfo = new DatasetVectorInfo();

				if (datasetType.equals("点数据集")) {
					datasetVectorInfo.setType(DatasetType.POINT);
					datasetVectorInfo.setName(name);
				}
				if (datasetType.equals("线数据集")) {
					datasetVectorInfo.setType(DatasetType.LINE);
					datasetVectorInfo.setName(name);
				}
				if (datasetType.equals("面数据集")) {
					datasetVectorInfo.setType(DatasetType.REGION);
					datasetVectorInfo.setName(name);
				}
				if (datasetType.equals("文本数据集")) {
					datasetVectorInfo.setType(DatasetType.TEXT);
					datasetVectorInfo.setName(name);
				}
				if (datasetType.equals("CAD数据集")) {
					datasetVectorInfo.setType(DatasetType.CAD);
					datasetVectorInfo.setName(name);
				}
				if (datasetType.equals("属性表数据集")) {
					datasetVectorInfo.setType(DatasetType.TABULAR);
					datasetVectorInfo.setName(name);
				}
				datasets.create(datasetVectorInfo);
			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}

