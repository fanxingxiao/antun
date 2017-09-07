package com.zdjy.bigdata.antun.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdjy.bigdata.antun.dao.UsersMapper;
import com.zdjy.bigdata.antun.entity.Response;
import com.zdjy.bigdata.antun.entity.Users;
import com.zdjy.bigdata.antun.entity.UsersExample;
import com.zdjy.bigdata.antun.entity.UsersExample.Criteria;
import com.zdjy.bigdata.antun.service.AreasService;
import com.zdjy.bigdata.antun.service.ChannelsService;
import com.zdjy.bigdata.antun.service.MediasSrevice;
import com.zdjy.bigdata.antun.service.ProductsSrevice;
import com.zdjy.bigdata.antun.service.UsersService;
import com.zdjy.bigdata.antun.util.ValidateUtils;
@Service
public class UsersServiceimpl implements UsersService{
	@Autowired
	private UsersMapper usersMapper;
	@Autowired
	private AreasService areasService;
	@Autowired
	private ProductsSrevice productsSrevice;
	@Autowired
	private ChannelsService channelsService;
	@Autowired
	private MediasSrevice mediasService;
	
	@Override
	public Response add(Users users) {
		/**
		 *数据验证 
		 */
		//基本验证
		if(!ValidateUtils.isName(users.getName1()))
			return Response.NAMEERROR;
		if(!ValidateUtils.isMobile(users.getPhone()))
			return Response.PHONEERROR;
		if(!ValidateUtils.isSex(users.getSex()))
			return Response.SEXERROR;
		if(!ValidateUtils.isBirth(users.getBirth()))
			return Response.BIRTHERROR;
		if(!ValidateUtils.isIdNo(users.getIdno()))
			return Response.IDNOERROR;
		if(users.getProvince()==null)
			return Response.PRODUCTERROR;
		if(users.getCity()==null)
			return Response.CITYERROR;
		if (users.getTown()==null)
			return Response.TOWNERROR;
		//地区关联验证
		if(!areasService.isValidArea(users.getProvince(),users.getCity(),users.getTown()))
			return Response.AREAERROR;
		//产品验证
		if(!productsSrevice.isValidProduct(users.getPid()))
			return Response.PRODUCTERROR;
		//验证渠道
		if(!channelsService.isValidChannel(users.getCid())){
			return Response.CHANNELERROR;
		}
		//媒体验证
		if(!mediasService.isValidMedias(users.getMid())){
			return Response.MEDIAERROR;
		}
		//数据去重
		if(isRepeated(users.getPhone()))
			return Response.HAVEPHONETOOERROR;
		//数据入库
		users.setInsertTime(new Date());
		users.setStatus1(0);
		usersMapper.insert(users);
		return Response.OK;
	}
	public boolean isRepeated(String phone){
		//select * from users where phone=phone;
		UsersExample usersExample = new UsersExample();
		Criteria createCriteria = usersExample.createCriteria();
		createCriteria.andPhoneEqualTo(phone);
		List<Users> list = usersMapper.selectByExample(usersExample);
		if(list.size()>0){
			return true;
		}
		return false;
	}
	@Override
	public List<Users> findStatus0() {
		UsersExample usersExample = new UsersExample();
		Criteria createCriteria = usersExample.createCriteria();
		createCriteria.andStatus1EqualTo(0);
		List<Users> list = usersMapper.selectByExample(usersExample);
		return list;
	}
	@Override
	public void update(Users users) {
		usersMapper.updateByPrimaryKey(users);
	}
}
