package edu.wfu.lu.service;

import java.util.List;

import edu.wfu.lu.po.BaseDict;

//�����ֵ�Service�ӿ�
public interface BaseDictService {
	public List<BaseDict> findBaseDictByTypeCode(String typecode);
	

}
