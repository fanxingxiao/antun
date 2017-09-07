package com.zdjy.bigdata.antun.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdjy.bigdata.antun.dao.MediasMapper;
import com.zdjy.bigdata.antun.entity.Medias;
import com.zdjy.bigdata.antun.entity.MediasExample;
import com.zdjy.bigdata.antun.entity.MediasExample.Criteria;
import com.zdjy.bigdata.antun.service.MediasSrevice;
@Service
public class MediasSreviceimpl implements MediasSrevice{
	@Autowired
	private MediasMapper MediasMapper;
	@Override
	public boolean isValidMedias(String id) {
		if(StringUtils.isBlank(id))
			return false;
			//select * from products where id = id and status1=1;
			MediasExample example = new MediasExample();
			Criteria createCriteria = example.createCriteria();
			createCriteria.andIdEqualTo(id);
			createCriteria.andStatus1EqualTo(1);
			List<Medias> selectByExample = MediasMapper.selectByExample(example);
			if(selectByExample.size()>0){
				return true;
			}
		return false;
	}

	
}
