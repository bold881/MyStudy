package com.nvee.spider;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FunctionUtils {
	/**
	 * 匹配吵连接的正则表达式
	 */
	private static String pat = "Http://www\\.oschina\\.net/code/explore/.*/\\w+\\.[a-zA-Z]+";
	private static Pattern pattern = Pattern.compile(pat);
	
	private static BufferedWriter writer = null;
	/**
	 * 爬虫搜索深度
	 */
	public static int depth = 0;
	
	public static String[] divUrl(String url){
		return url.split("/");
	}
	/**
	 * 判断对应文件
	 * @param url
	 * @return
	 */
	public static boolean isCreateFile(String url){
		Matcher mathcher = pattern.matcher(url);
		return mathcher.matches();
	}
	public static void createFile(String content,String urlPath){
		String[] elems = divUrl(urlPath);
		StringBuffer path = new StringBuffer();
		File file = null;
		for (int i = 0; i < elems.length; i++) {
			if(i !=elems.length - 1){
				path.append(elems[i]);
				path.append(File.separator);
				file = new File("D:"+File.separator+path.toString());
			}
			if(i !=elems.length -1){
				Pattern p = Pattern.compile("\\w+\\.[a-zA-Z]+");
				Matcher mc = p.matcher(elems[i]);
				if(mc.matches()){
					if(!file.exists()){
						file.mkdirs();
					}
					String[] fileName = elems[i].split("\\.");
					file = new File("D:"+File.separator+path.toString()
							+File.separator+fileName[0]+".txt");
				}
			}
			try {
				file.createNewFile();
				writer = new BufferedWriter(new OutputStreamWriter(
						new FileOutputStream(file)));
				writer.write(content);
				writer.flush();
				writer.close();
				System.out.println("文件创建成功 地址为:"+file.getPath());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
