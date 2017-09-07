package com.zdjy.bigdata.antun.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TestController {
	@RequestMapping("test")
	public String toString(){
		return "test";
	}
}
