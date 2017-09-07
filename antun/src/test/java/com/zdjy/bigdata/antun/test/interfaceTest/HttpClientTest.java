package com.zdjy.bigdata.antun.test.interfaceTest;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import com.google.gson.Gson;

public class HttpClientTest {
	@Test
	public void test001() throws Exception{
		HttpClientBuilder builder = HttpClientBuilder.create();
		CloseableHttpClient client = builder.build();
		
		//拼接一个get请求
		StringBuilder url=new StringBuilder("http://localhost:8080/pinganjiekou/user/add?");
		url.append("channelCode=afangti_zhangrui_001&");
		url.append("channelToken=26246952-113-11343-3510060-1131-46-46-91114&");
		url.append("productCode=PA000000CXSF-CXWY-01&");
		url.append("userName=中国&");
		url.append("userSex=1&");
		url.append("userBirth=1991-04-08&");
		url.append("userPhone=18851632235&");
		url.append("userIdNo=32012514785469187x&");
		url.append("province=110000&");
		url.append("city=110100&");
		url.append("town=110101&");
		//构造get请求
		HttpGet get=new HttpGet(url.toString());
		//通过客户端发送get请求返回响应
		CloseableHttpResponse execute = client.execute(get);
		//响应有很多内容，需要主体内容
		HttpEntity entity = execute.getEntity();
		//将主题内容转成字符串
		String string = EntityUtils.toString(entity, "utf-8");
		/**
		 * {"code":200,"result":"asdfhjksadfh"}
		 */
		
		
		//将字符串变成MyResponse对象
//		Pattern pattern=Pattern.compile("\\{\"code\":(\\d+),\"result\":\"(.+?)\"\\}");
//		Matcher matcher=pattern.matcher(string);
//		if(matcher.find()){
//			MyResponse myResponse=new MyResponse();
//			myResponse.setCode(Integer.parseInt(matcher.group(1)));
//			myResponse.setResult(matcher.group(2));
//			System.out.println(myResponse);
//		}
		
		//gson解析json格式的字符串
		MyResponse fromJson = new Gson().fromJson(string,MyResponse.class);
		System.out.println(fromJson);
		
//		System.out.println(string);
	}
	
}
