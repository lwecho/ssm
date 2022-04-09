package edu.wfu.lu.dao;

import java.util.List;

import edu.wfu.lu.po.BaseDict;

public interface BaseDictDao {
	
	public List<BaseDict> selectBaseDictByTypeCode(String typecode);

}
