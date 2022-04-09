package edu.wfu.lu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.wfu.lu.dao.BaseDictDao;
import edu.wfu.lu.po.BaseDict;
import edu.wfu.lu.service.BaseDictService;

/**
 * �����ֵ�Service�ӿ�ʵ����
 */
@Service("baseDictService")
public class BaseDictServiceImpl implements BaseDictService{	
	@Autowired
	private BaseDictDao baseDictDao;
	//�����������ѯ�����ֵ�
	public List<BaseDict> findBaseDictByTypeCode(String typecode) {
		return baseDictDao.selectBaseDictByTypeCode(typecode);
	}
}