package com.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegTest {

	public static void main(String[] args) {
		String path = "https: \\www.hao123.com";
		String regex = "http[s]:\\s\\\\w{3}\\.[a-z]+\\d{3}\\.[a-z]{1,3}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(path);
		boolean pass = matcher.matches();
		System.out.println(pass);
	}
	

}
