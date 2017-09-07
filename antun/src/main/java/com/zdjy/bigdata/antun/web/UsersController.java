package com.zdjy.bigdata.antun.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zdjy.bigdata.antun.entity.Response;
import com.zdjy.bigdata.antun.entity.Users;
import com.zdjy.bigdata.antun.service.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {
	@Autowired
	private UsersService usersService;
	@RequestMapping("/add")
	public Response add(Users users){
		return usersService.add(users);
	}
}
