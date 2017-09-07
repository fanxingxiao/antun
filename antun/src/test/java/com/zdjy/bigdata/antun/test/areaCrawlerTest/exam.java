package com.zdjy.bigdata.antun.test.areaCrawlerTest;

import java.io.BufferedWriter;
import java.io.FileWriter;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

public class exam {
	@Test
	public void Jsoup() throws Exception{
		BufferedWriter writer = new BufferedWriter(new FileWriter("exam1.txt"));
		Document document = Jsoup.connect("http://sou.zhaopin.com/jobs/searchresult.ashx?jl=%E5%8C%97%E4%BA%AC&kw=java&sm=0&p=1/").get();
		Elements select = document.select(" td.zwmc div a:eq(0)");
		Elements select1 = document.select("td.gsmc a:eq(0)");
		Elements select2 = document.select("td.zwyx");
		Elements select3 = document.select("td.gzdd");
		for(int i =0;i<select.size();i++){
			Elements eq = select.eq(i);
			Elements eq1 = select1.eq(i);
			Elements eq2 = select2.eq(i);
			Elements eq3 = select3.eq(i);
			System.out.println(eq.text()+" "+eq1.text()+" "+eq2.text()+" "+eq3.text());
			writer.write(eq.text()+" "+eq1.text()+" "+eq2.text()+" "+eq3.text());
			writer.newLine();
		}
		writer.flush();  
		writer.close();  
	    System.out.println("写入ok");  
	}
	@Test
	public void Jsoup1() throws Exception{
		Document document = Jsoup.connect("http://sou.zhaopin.com/jobs/searchresult.ashx?jl=%E5%8C%97%E4%BA%AC&kw=java&sm=0&p=1/").get();
		Elements select = document.select(".gsmc a:eq(0)");
		for(int i =0;i<select.size();i++){
			Elements eq = select.eq(i);
			System.out.println(eq.text());
		}
	}
	@Test
	public void Jsoup2() throws Exception{
		Document document = Jsoup.connect("http://sou.zhaopin.com/jobs/searchresult.ashx?jl=%E5%8C%97%E4%BA%AC&kw=java&sm=0&p=1/").get();
		Elements select = document.select(".zwyx");
		for(int i =0;i<select.size();i++){
			Elements eq = select.eq(i);
			System.out.println(eq.text());
		}
	}
	@Test
	public void Jsoup3() throws Exception{
		Document document = Jsoup.connect("http://sou.zhaopin.com/jobs/searchresult.ashx?jl=%E5%8C%97%E4%BA%AC&kw=java&sm=0&p=1/").get();
		Elements select = document.select(".gzdd");
		for(int i =0;i<select.size();i++){
			Elements eq = select.eq(i);
			System.out.println(eq.text());
		}
	}
}
