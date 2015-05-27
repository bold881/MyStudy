package com.test;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test3 {
	public static void main(String[] args) {
		File file = new File("E://YTF.pdf");
		String filename = file.getName();
		System.out.println(filename.substring(filename.lastIndexOf(".")+1,filename.length()));
		String url = "http://www.jcodecraeer.com/a/chengxusheji/java/2012/0610/240.html";
		String[] elems = url.split("/");
		for (int i = 0; i < elems.length; i++) {
			Pattern p = Pattern.compile("\\w+\\.[a-zA-Z]+");
			Matcher mc = p.matcher(elems[i]);
			System.out.println(mc.matches());
			//String[] fileName = elems[i].split("\\.");
		}
		
	}
}
