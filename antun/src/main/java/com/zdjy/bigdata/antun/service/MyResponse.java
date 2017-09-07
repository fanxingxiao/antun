package com.zdjy.bigdata.antun.service;

public class MyResponse {
	private Integer code;
	private String result;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	@Override
	public String toString() {
		return String.format("code:%d,result:%s",code,result);
	}
}
