package com.itheima.crm.service;

import com.itheima.crm.pojo.BaseDict;

import java.util.List;

public interface BaseDictService {
	
	public List<BaseDict> getBaseDictList(String typeCode);
	
}
