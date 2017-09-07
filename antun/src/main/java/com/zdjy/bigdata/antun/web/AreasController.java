package com.zdjy.bigdata.antun.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zdjy.bigdata.antun.entity.Areas;
import com.zdjy.bigdata.antun.service.AreasService;
/**
 *提供地区服务 
 */
@RestController
@RequestMapping("/areas")
public class AreasController{
	/*
	 *查询省市县三级联动
	 *192.168.11.3:8081/antun/areas/{pid} 
	 */
	@Autowired
	private AreasService areasService;
	@RequestMapping("/{pid}")
	public List<Areas> findByPid(@PathVariable Integer pid){
		return areasService.findByPid(pid);
	}
	@RequestMapping("/list")
	public List<Areas> findAll(){
		return areasService.findAll();
	}
}
