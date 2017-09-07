package com.zdjy.bigdata.antun.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Response {
	OK						(200,"操作成功"),
	ERROR					(400,"操作失败"),
	NAMEERROR				(501,"姓名错误"),
	SEXERROR				(502,"性别错误"),
	PHONEERROR				(503,"手机号错误"),
	IDNOERROR				(504,"身份证号错误"),
	PROVINCEERROR			(505,"省分错误"),
	CITYERROR				(506,"城市错误"),
	TOWNERROR				(507,"区县错误"),
	AREAERROR				(508,"地区没有关联性"),
	CHANNELERROR			(509,"渠道错误"),
	MEDIAERROR				(510,"媒体错误"),
	PRODUCTERROR			(511,"产品错误"),
	BIRTHERROR				(512,"生日错误"),
	HAVEPHONETOOERROR				(513,"手机号重复"),
	;
	
	private Integer code;
	private String result;
	private Response(Integer code, String result) {
		this.code = code;
		this.result = result;
	}
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
	
}
