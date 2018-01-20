package com.itheima.crm.service.impl;

import com.itheima.crm.mapper.BaseDictMapper;
import com.itheima.crm.pojo.BaseDict;
import com.itheima.crm.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseDictServiceImpl implements BaseDictService {

	
	@Autowired
	private BaseDictMapper mapper;
	
	@Override
	public List<BaseDict> getBaseDictList(String typeCode) {
		return mapper.getBaseDictList(typeCode);
	}

}
