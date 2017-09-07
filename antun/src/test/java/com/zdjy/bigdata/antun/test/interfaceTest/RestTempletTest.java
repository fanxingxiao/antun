package com.zdjy.bigdata.antun.test.interfaceTest;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

public class RestTempletTest {
	@Test
	public void test001(){
		RestTemplate template=new RestTemplate();
		StringBuilder url=new StringBuilder("http://localhost:8080/pinganjiekou/user/add?");
		url.append("channelCode=afangti_zhangrui_001&");
		url.append("channelToken=26246952-113-11343-3510060-1131-46-46-91114&");
		url.append("productCode=PA000000CXSF-CXWY-01&");
		url.append("userName=中国&");
		url.append("userSex=1&");
		url.append("userBirth=1991-04-08&");
		url.append("userPhone=18851632234&");
		url.append("userIdNo=32012514785469187x&");
		url.append("province=110000&");
		url.append("city=110100&");
		url.append("town=110101&");
		
		MyResponse response = template.getForObject(url.toString(), MyResponse.class);
		
		System.out.println(response);
	}
}
