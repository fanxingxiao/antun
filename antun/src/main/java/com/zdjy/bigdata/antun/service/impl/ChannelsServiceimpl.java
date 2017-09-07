package com.zdjy.bigdata.antun.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdjy.bigdata.antun.dao.ChannelsMapper;
import com.zdjy.bigdata.antun.entity.Channels;
import com.zdjy.bigdata.antun.entity.ChannelsExample;
import com.zdjy.bigdata.antun.entity.ChannelsExample.Criteria;
import com.zdjy.bigdata.antun.service.ChannelsService;
@Service
public class ChannelsServiceimpl implements ChannelsService{
	@Autowired
	private ChannelsMapper channelsMapper;
	@Override
	public boolean isValidChannel(String cid){
		if(StringUtils.isBlank(cid))
			return false;
			//select * from products where id = id and status1=1;
		ChannelsExample channels = new ChannelsExample();
			Criteria createCriteria = channels.createCriteria();
			createCriteria.andIdEqualTo(cid);
			createCriteria.andStatus1EqualTo(1);
			List<Channels> selectByExample = channelsMapper.selectByExample(channels);
			if(selectByExample.size()>0){
				return true;
			}
		return false;
	}
}
