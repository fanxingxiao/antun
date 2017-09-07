package com.zdjy.bigdata.antun.test.areaCrawlerTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

public class AreaCrawlerTest {
	@Test
	public void testHttpClient() throws Exception{
		HttpClientBuilder builder = HttpClientBuilder.create();
		CloseableHttpClient client = builder.build();
		
		//构造get请求
		HttpGet get=new HttpGet("http://www.diqudaima.com/");
		//通过客户端发送get请求返回响应
		CloseableHttpResponse execute = client.execute(get);
		//响应有很多内容，需要主体内容
		HttpEntity entity = execute.getEntity();
		//将主题内容转成字符串
		String string = EntityUtils.toString(entity, "gb2312");
		System.out.println(string);
	}
	@Test
	public void testJsoup() throws Exception{
		BufferedWriter writer = new BufferedWriter(new FileWriter("areas.txt"));
		Document document = Jsoup.connect("http://www.diqudaima.com/").get();
		Elements select = document.select(".Count li a");
		for(int i=0;i<select.size();i++){
			Elements eq = select.eq(i);
			System.out.println(i);
			List<String> testJsoup2 = testJsoup2("http://www.diqudaima.com"+eq.attr("href"));
					if(testJsoup2.size()>0){
						String string = testJsoup2.get(0).split(" ")[2];
						writer.write(string+" "+eq.text()+" "+"0 1\n");
						for(String string2:testJsoup2){
							writer.write(string2+"\n");
						}
					}else{
						writer.write(eq.text()+" "+"0 1\n");
					}
			writer.flush();
		}
		writer.flush();
		writer.close();
	}
	public List<String> testJsoup2(String url) throws Exception{
		List<String> list=new ArrayList<>();
		Document document = Jsoup.connect(url).get();
		Elements select = document.select(".all ul a");
		if(select.size()>0){
		for(int i=0;i<select.size();i++){
			Elements eq = select.eq(i);
			List<String> testJsoup31 = testJsoup3("http://www.diqudaima.com"+eq.attr("href"));	
				if(testJsoup31.size()>0){
					String string = testJsoup31.get(0).split(" ")[2];
					//通过空格把他们分开 选择分隔开的第三个
					list.add(string+" "+eq.text()+" "+string.substring(0, 2)+"0000 2");
					list.addAll(testJsoup31);
				}
		}
		}
		return list;
	}
	public List<String> testJsoup3(String url) throws Exception{
		List<String> list=new ArrayList<>();
		Document document = Jsoup.connect(url).get();
		Elements select = document.select(".all3 ul li");
		if(select.size()>0){
		Pattern pattern=Pattern.compile("(.+?) 地区编码：(\\d+)");
		for(int i=0;i<select.size();i++){
			Elements eq = select.eq(i);
			Matcher matcher=pattern.matcher(eq.text());
			if(matcher.find()){
				list.add(matcher.group(2)+" "+matcher.group(1)+" "+matcher.group(2).substring(0, 4)+"00 3");
			}
		}
		}
		return list;
	}
}
