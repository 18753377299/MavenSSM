package com.common.db.datasource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import com.common.db.datasource.holder.DynamicDataSourceHolder;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年9月9日 下午4:34:04
 * @version 1.0  
 * @parameter 
 * @since  创建双数据源
 * @return  */
public class DynamicDataSource extends AbstractRoutingDataSource{

		@Override
		protected Object determineCurrentLookupKey() {
			// TODO Auto-generated method stub
//			return null;
			return DynamicDataSourceHolder.getDataSouce();
		}

}
