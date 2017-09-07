package com.zdjy.bigdata.antun.test.areaCrawlerTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
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
public class Tests {
	@Test
	public void test() throws Exception{
		HttpClientBuilder hc = HttpClientBuilder.create();
		CloseableHttpClient ch = hc.build();
		HttpGet hg = new HttpGet("http://www.diqudaima.com/");
		CloseableHttpResponse chc = ch.execute(hg);
		HttpEntity entity = chc.getEntity();
		String str = EntityUtils.toString(entity,"gb2312");
		System.out.println(str);
	}
	@Test
	public void Jsoup() throws Exception{
		Document document = Jsoup.connect("http://www.diqudaima.com/").get();
		Elements select = document.select(".Count li a");
		for(int i =0;i<select.size();i++){
			Elements eq = select.eq(i);
			System.out.println("http://www.diqudaima.com"+eq.attr("href"));
		}
	}
	@Test
	public void Jsoup1() throws Exception{
		Document document = Jsoup.connect("http://www.diqudaima.com/beijing/").get();
		Elements select = document.select(".all ul a");
		for(int i = 0;i<select.size();i++){
			Elements eq = select.eq(i);
			System.out.println(eq.text());
			System.out.println("http://www.diqudaima.com/beijing"+eq.attr("href"));
		}
	}
	@Test
	public void Jsoup2() throws Exception{
		Document document = Jsoup.connect("http://www.diqudaima.com/beijing/shixiaqu/").get();
		Elements select = document.select(".all3 ul li");
		System.out.println(select.size());
		Pattern pattern = Pattern.compile("(.+?) 地区编码：(\\d+)");
		for(int i = 0;i<select.size();i++){
			Elements eq = select.eq(i);
			Matcher matcher=pattern.matcher(eq.text());
			if(matcher.find()){
				System.out.println(matcher.group(2)+" "+matcher.group(1)+" "+matcher.group(2).substring(0, 4)+"00 3");
			}
		}
	}
	@Test
	public void Jsoup4() throws Exception{
//		BufferedWriter writer = new BufferedWriter(new FileWriter("exam1.txt"));
		for(int a=1;a<200;a++){
			Document document = Jsoup.connect("http://sou.zhaopin.com/jobs/searchresult.ashx?jl=%e5%8c%97%e4%ba%ac&kw=java&sm=0&isfilter=0&fl=530&isadv=0&sg=87bacdaa6eef4ccfa50a187269a1ee6d&p='"+a+"'").get();
		Elements select = document.select(" td.zwmc div a:eq(0)");
		Elements select1 = document.select("td.gsmc a:eq(0)");
		Elements select2 = document.select("td.zwyx");
		Elements select3 = document.select("td.gzdd");
		for(int i =0;i<select.size();i++){
			Elements eq = select.eq(i);
			Elements eq1 = select1.eq(i);
			Elements eq2 = select2.eq(i);
			Elements eq3 = select3.eq(i);
//			System.out.println(eq.text()+" "+eq1.text()+" "+eq2.text()+" "+eq3.text());
//			writer.write(eq.text()+" "+eq1.text()+" "+eq2.text()+" "+eq3.text());
//			writer.newLine();
		}
		System.out.println(a);
		}
//		writer.flush();  
//		writer.close();  
//	    System.out.println("写入ok");  
	}
}
