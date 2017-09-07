package com.zdjy.bigdata.antun.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/foregroundpage/")
public class ForeGroundPageController {
	@RequestMapping("/{page}")
	public String toPage(@PathVariable String page){
		return "foregroundpage/"+page;
	}
}
