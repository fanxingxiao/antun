package com.zdjy.bigdata.antun.service.scheduler;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.zdjy.bigdata.antun.entity.Users;
import com.zdjy.bigdata.antun.service.MyResponse;
import com.zdjy.bigdata.antun.service.UsersService;
/*
 *spring托管的对象 
 */
@Component
public class UsersSendScheduler {
	@Autowired
	private UsersService usersService;
	/*
	 * cron 表达式
	 * 秒  分  时  日  月  星期
	 * * * * * * ?   每秒执行一次
	 * 0 * * * * ?   每分钟执行一次
	 * 0 0 * * * ?   每小时执行一次
	 * 0 0 0 * * ?   每天执行一次
	 * 0 0 9 * * ?   每天9点执行一次
	 */
	@Scheduled(cron="0 * * * * ?")
	public void send(){
		System.out.println("开始执行");
		//查询
		List<Users> findStatus0 = usersService.findStatus0();
		for(Users users:findStatus0){
			users.setSendTime(new Date());
			MyResponse send = send(users);
			users.setCode(send.getCode());
			users.setResult(send.getResult());
			if(send.getCode()==200)
				users.setStatus1(3);
			else
				users.setStatus1(4);
			usersService.update(users);
		}
	}
	private MyResponse send(Users users){
		RestTemplate template = new RestTemplate();
		StringBuilder url=new StringBuilder("http://192.168.11.81:8080/pinganjiekou/user/add?");
		url.append("channelCode=afangti_zhangrui_001&");
		url.append("channelToken=26246952-113-11343-3510060-1131-46-46-91114&");
		url.append("productCode="+users.getPid()+"&");
		url.append("userName="+users.getName1()+"&");
		url.append("userSex="+users.getSex()+"&");
		url.append("userBirth="+users.getBirth()+"&");
		url.append("userPhone="+users.getPhone()+"&");
		url.append("userIdNo="+users.getIdno()+"&");
		url.append("province="+users.getProvince()+"&");
		url.append("city="+users.getCity()+"&");
		url.append("town="+users.getTown()+"&");
		MyResponse response = template.getForObject(url.toString(), MyResponse.class);
		return response;
	}
	
}
