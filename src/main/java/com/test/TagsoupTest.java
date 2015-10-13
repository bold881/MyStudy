package com.test;

import java.io.File;
import java.io.InputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.ccil.cowan.tagsoup.PYXScanner;
import org.ccil.cowan.tagsoup.Parser;
import org.ccil.cowan.tagsoup.Scanner;
import org.ccil.cowan.tagsoup.XMLWriter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.xml.sax.InputSource;





@SuppressWarnings("deprecation")
public class TagsoupTest {
	public static void main(String[] args) throws Exception {
		String html = "http://www.iteye.com/topic/1070620";
		@SuppressWarnings({ "resource" })
		HttpClient client = new DefaultHttpClient();
		HttpGet get = new HttpGet(html);
		HttpResponse resp = client.execute(get);
		HttpEntity entity = resp.getEntity();
		String content = EntityUtils.toString(entity);
		
		Map<String,String> map = new HashMap<String,String>();
//		Jsoup.connect("http://www.iteye.com/topic/1070620").get(); get 请求
//		Jsoup.connect("").data("query", "java").userAgent("Mozilla") post 请求
//		.cookie("auth", "token").timeout(3000).post();
		
		Document doc = Jsoup.parse(content);
//		Element element = doc.getElementById("content");
//		Elements eles = element.getElementsByTag("a");
		Elements links = doc.select("a[href]"); //带有href属性的a元素
		int idx = 1;
		for (Element ele : links) {
			map.put("href"+idx++, ele.attr("href")+"\n");
		}
//		Elements eles = doc.getAllElements();
//		int i = 1;
//		for (Element ele : eles) {
//			map.put("tag"+ i++, ele.tagName());
//		}
		System.out.println("===================================================================\n\n\n");
		System.out.println(map);
	}
}
