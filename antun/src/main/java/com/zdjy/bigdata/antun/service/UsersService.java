package com.zdjy.bigdata.antun.service;

import java.util.List;

import com.zdjy.bigdata.antun.entity.Response;
import com.zdjy.bigdata.antun.entity.Users;

public interface UsersService {

	public Response add(Users users);
	
	List<Users> findStatus0();
	
	void update(Users users);
	
	public boolean isRepeated(String phone);

}
