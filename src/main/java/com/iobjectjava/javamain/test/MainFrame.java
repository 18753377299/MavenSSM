package com.iobjectjava.javamain.test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;

import com.supermap.data.Workspace;

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

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	private Workspace m_workspace;

	private JPanel m_contentPane;

	private JScrollPane m_panelDataset;

	private JPanel m_panelSelectDatasetOperate;

	private JPanel m_panelDatasetCreate;

	private JList m_ListDatasets;

	private SampleRun m_sampleRun;

	private JButton m_buttonDatasetDelete;

	private JButton m_buttonDatasetRename;

	private JTextField m_textFieldRename;

	private JComboBox m_comboBoxDatasetType;

	private JButton m_buttonOK;

	private JTextField m_textFieldDatasetCreate;

	private JLabel m_labelDatasetName;

	private JLabel m_labelDatasetType;

	/**
	 * 获取m_panelDataset
	 */
	private JScrollPane getPanelDataset() {
		if (m_panelDataset == null) {
			m_panelDataset = new JScrollPane();
			m_panelDataset.setBorder(BorderFactory.createTitledBorder(null,
					"数据集列表"));
			m_panelDataset.add(getListDatasets());
			m_panelDataset.setViewportView(getListDatasets());
		}
		return m_panelDataset;
	}

	/**
	 * 获取 m_panelSelectDatasetOperate 	
	 */
	private JPanel getPanelSelectDatasetOperate() {
		if (m_panelSelectDatasetOperate == null) {
			m_panelSelectDatasetOperate = new JPanel();
			JPanel panelSelectDatasetOperate = new JPanel();
			panelSelectDatasetOperate.setLayout(new BoxLayout(
					panelSelectDatasetOperate, BoxLayout.Y_AXIS));
			m_panelSelectDatasetOperate.setBorder(BorderFactory
					.createTitledBorder(null, "操作选中数据集"));

			Box box = Box.createHorizontalBox();
			box.add(getButtonDatasetDelete());
			box.add(Box.createGlue());
			panelSelectDatasetOperate.add(box, null);
			panelSelectDatasetOperate.add(Box.createVerticalStrut(10));

			Box box2 = Box.createHorizontalBox();
			box2.add(getButtonDatasetRename());
			box2.add(Box.createHorizontalStrut(5));
			box2.add(getTextFieldName());
			panelSelectDatasetOperate.add(box2, null);
			m_panelSelectDatasetOperate.add(panelSelectDatasetOperate);
		}
		return m_panelSelectDatasetOperate;
	}

	/**
	 * 获取 m_panelDatasetCreate
	 */
	private JPanel getPanelDatasetCreate() {
		if (m_panelDatasetCreate == null) {
			m_labelDatasetType = new JLabel();
			m_labelDatasetType.setText("数据集类型");
			m_labelDatasetName = new JLabel();
			m_labelDatasetName.setText("数据集名字");
			m_panelDatasetCreate = new JPanel();

			JPanel panelDatasetCreate = new JPanel();

			panelDatasetCreate.setLayout(new BoxLayout(panelDatasetCreate,
					BoxLayout.Y_AXIS));
			Box box = Box.createHorizontalBox();

			box.add(m_labelDatasetType);
			box.add(getComboBoxDatasetType());
			box.add(Box.createGlue());

			Box box2 = Box.createHorizontalBox();
			box2.add(m_labelDatasetName);
			box2.add(getTextFieldDatasetCreate());
			box2.add(Box.createGlue());
			Box box3 = Box.createHorizontalBox();
			box3.add(Box.createGlue());
			box3.add(getButtonOK());

			m_panelDatasetCreate.setBorder(BorderFactory.createTitledBorder(
					null, "创建数据集"));
			panelDatasetCreate.add(box, null);
			panelDatasetCreate.add(Box.createVerticalStrut(10));
			panelDatasetCreate.add(box2, null);
			panelDatasetCreate.add(Box.createVerticalStrut(10));
			panelDatasetCreate.add(box3, null);
			m_panelDatasetCreate.add(panelDatasetCreate);
		}
		return m_panelDatasetCreate;
	}

	/**
	 * 获取m_buttonDatasetDelete
	 */
	private JButton getButtonDatasetDelete() {
		if (m_buttonDatasetDelete == null) {
			m_buttonDatasetDelete = new JButton();
			m_buttonDatasetDelete.setText("删除选中");
			m_buttonDatasetDelete.addActionListener(new ActionListener() {

				//执行删除操作
				public void actionPerformed(ActionEvent e) {
					if (m_ListDatasets.getSelectedIndex() != -1) {
						m_sampleRun.deleteDataset(m_ListDatasets
								.getSelectedValue().toString());
						//刷新列表 ，并选中0行
						m_ListDatasets.setListData(m_sampleRun
								.getDatasetsName());
						if (m_ListDatasets.getModel().getSize() > 0) {
							m_ListDatasets.setSelectedIndex(0);
						}
					}
				}

			});
		}
		return m_buttonDatasetDelete;
	}

	/**
	 * 获取m_buttonDatasetRename
	 */
	private JButton getButtonDatasetRename() {
		if (m_buttonDatasetRename == null) {
			m_buttonDatasetRename = new JButton();
			m_buttonDatasetRename.setText(" 重 命 名 ");
			m_buttonDatasetRename.addActionListener(new ActionListener() {

				//执行重命名功能
				public void actionPerformed(ActionEvent e) {

					int index = m_ListDatasets.getSelectedIndex();
					if (index != -1) {
						m_sampleRun.renameDataset(m_ListDatasets
								.getSelectedValue().toString(),
								m_textFieldRename.getText());

						//刷新列表，并选中原来的选中项
						m_ListDatasets.setListData(m_sampleRun
								.getDatasetsName());
						m_ListDatasets.setSelectedIndex(index);
					}
				}

			});
		}
		return m_buttonDatasetRename;
	}

	/**
	 * 获取m_textFieldRename
	 */
	private JTextField getTextFieldName() {
		if (m_textFieldRename == null) {
			m_textFieldRename = new JTextField(15);
			m_textFieldRename.setMaximumSize(m_textFieldRename
					.getPreferredSize());
			m_textFieldRename.setText("");
		}
		return m_textFieldRename;
	}

	/**
	 * 获取m_comboBoxDatasetType
	 */
	private JComboBox getComboBoxDatasetType() {
		if (m_comboBoxDatasetType == null) {
			m_comboBoxDatasetType = new JComboBox();
			m_comboBoxDatasetType.addItem("点数据集");
			m_comboBoxDatasetType.addItem("线数据集");
			m_comboBoxDatasetType.addItem("面数据集");
			m_comboBoxDatasetType.addItem("文本数据集");
			m_comboBoxDatasetType.addItem("CAD数据集");
			m_comboBoxDatasetType.addItem("属性表数据集");
			m_comboBoxDatasetType.addItem("栅格数据集");
			m_comboBoxDatasetType.addItem("影像数据集");
			m_comboBoxDatasetType.setPreferredSize(new Dimension(170, 24));
		}
		return m_comboBoxDatasetType;
	}

	/**
	 * 	获取m_buttonOK
	 */
	private JButton getButtonOK() {
		if (m_buttonOK == null) {
			m_buttonOK = new JButton();
			m_buttonOK.setText("创建");
			m_buttonOK.addActionListener(new ActionListener() {

				//执行创建数据集功能
				public void actionPerformed(ActionEvent e) {
					m_sampleRun.createDataset(m_comboBoxDatasetType
							.getSelectedItem().toString(),
							m_textFieldDatasetCreate.getText());

					//刷新列表，并选中新加行
					m_ListDatasets.setListData(m_sampleRun.getDatasetsName());
					m_ListDatasets.setSelectedIndex(m_ListDatasets.getModel()
							.getSize() - 1);
				}

			});
		}
		return m_buttonOK;
	}

	/**
	 * 	获取m_textFieldDatasetCreate
	 */
	private JTextField getTextFieldDatasetCreate() {
		if (m_textFieldDatasetCreate == null) {
			m_textFieldDatasetCreate = new JTextField(15);
			m_textFieldDatasetCreate.setMaximumSize(m_textFieldDatasetCreate
					.getPreferredSize());
		}
		return m_textFieldDatasetCreate;
	}

	/**
	 * 程序入口点
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MainFrame thisClass = new MainFrame();
				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});
	}

	/**
	 * 构造函数
	 */
	public MainFrame() {
		super();
		initialize();
	}

	/**
	 * 初始化窗体
	 */
	private void initialize() {
		//最大化显示窗体
		this.setSize(800, 500);
		this.setMinimumSize(new Dimension(750,450));
		this.setTitle("数据集管理");
		this.setContentPane(getJContentPane());
		this.addWindowListener(new java.awt.event.WindowAdapter() {
			// 在主窗体加载时，初始化SampleRun类型，来完成功能的展现
			public void windowOpened(java.awt.event.WindowEvent e) {
				m_workspace = new Workspace();
				m_sampleRun = new SampleRun(m_workspace);

				//初始化列表和选中项
				m_ListDatasets.setListData(m_sampleRun.getDatasetsName());
				if (m_ListDatasets.getModel().getSize() > 0) {
					m_ListDatasets.setSelectedIndex(0);
				}
			}

			// 在窗体关闭时，需要释放相关的资源
			public void windowClosing(java.awt.event.WindowEvent e) {
				m_workspace.dispose();
			}
		});
		try {
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			Dimension frameSize = this.getSize();
			if (frameSize.height > screenSize.height) {
				frameSize.height = screenSize.height;
			}
			if (frameSize.width > screenSize.width) {
				frameSize.width = screenSize.width;
			}
			this.setLocation((screenSize.width - frameSize.width) / 2,
					(screenSize.height - frameSize.height) / 2);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * 获取m_contentPane
	 */
	private JPanel getJContentPane() {
		if (m_contentPane == null) {
			GridLayout gridLayout = new GridLayout();
			gridLayout.setColumns(3);
			gridLayout.setRows(1);
			m_contentPane = new JPanel();
			m_contentPane.setLayout(gridLayout);
			m_contentPane.add(getPanelDataset(), null);
			m_contentPane.add(getPanelSelectDatasetOperate(), null);
			m_contentPane.add(getPanelDatasetCreate(), null);
		}
		return m_contentPane;
	}

	/**
	 * 显示数据集的列表	
	 */
	private JList getListDatasets() {
		if (m_ListDatasets == null) {
			m_ListDatasets = new JList();
			m_ListDatasets
					.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			m_ListDatasets.setBackground(Color.white);
		}
		return m_ListDatasets;
	}
}

