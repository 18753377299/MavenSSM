package com.example.dao.impl;

import java.util.List;
import java.util.Map;

import com.example.dao.LeaveMainMapper;
import com.example.vo.LeaveMain;
/**
 * 如果将自己写的新的方法，放在LeaveMainMapperImpl，那么新写的xml文件的namespace应该和
 * com.example.dao.impl.LeaveMainMapperImpl 保持一致，为了能够调用原本的xml文件中的内容，
 * 那么原有的命名空间的名称也要和这个保持一致。
 * **/
//@Mapper
public interface LeaveMainMapperImpl extends LeaveMainMapper{
    
    public List<LeaveMain> queryLeaveMainList(Map<String,String> map);
}