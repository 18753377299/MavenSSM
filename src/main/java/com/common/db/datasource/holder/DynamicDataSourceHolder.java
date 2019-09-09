package com.common.db.datasource.holder;
	/**
 * @author  作者 E-mail: 
 * @date 创建时间：2019年9月9日 下午4:39:19
 * @version 1.0 
 * @parameter 
 * @since  
 * @return  */
public class DynamicDataSourceHolder {
	
	public static final ThreadLocal<String> holder = new ThreadLocal<String>();

    public static void putDataSource(String name) {
        holder.set(name);
    }

    public static String getDataSouce() {
        return holder.get();
    }
    
}
