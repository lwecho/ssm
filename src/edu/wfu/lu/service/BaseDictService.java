package edu.wfu.lu.service;

import java.util.List;

import edu.wfu.lu.po.BaseDict;

//数据字典Service接口
public interface BaseDictService {
	public List<BaseDict> findBaseDictByTypeCode(String typecode);
	

}
