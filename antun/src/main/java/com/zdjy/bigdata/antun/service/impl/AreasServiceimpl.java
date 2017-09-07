package com.zdjy.bigdata.antun.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdjy.bigdata.antun.dao.AreasMapper;
import com.zdjy.bigdata.antun.entity.Areas;
import com.zdjy.bigdata.antun.entity.AreasExample;
import com.zdjy.bigdata.antun.entity.AreasExample.Criteria;
import com.zdjy.bigdata.antun.service.AreasService;
@Service
public class AreasServiceimpl implements AreasService{
	@Autowired
	private AreasMapper areasMapper;
	@Override
	public List<Areas> findByPid(Integer pid) {
		AreasExample example=new AreasExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andPidEqualTo(pid);
		return areasMapper.selectByExample(example); 
	}
	@Override
	public List<Areas> findAll() {
		return areasMapper.selectByExample(null);
	}
	public boolean isValidArea(Integer province, Integer city, Integer town) {
		if(areasMapper.selectByPrimaryKey(town).getPid()==null)
			return false;
		if(!(areasMapper.selectByPrimaryKey(town).getPid().intValue()==city.intValue()))
			return false;
		if(!(areasMapper.selectByPrimaryKey(city).getPid().intValue()==province.intValue()))
			return false;
		return true;
	}

}
