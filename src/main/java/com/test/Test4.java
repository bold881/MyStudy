package com.test;

import java.io.UnsupportedEncodingException;

import com.tool.IdcardUtils;

public class Test4 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String s1 = "16:10:46.0";
		System.out.println(s1. substring(0,s1.lastIndexOf("-")+3));
		
		String s2 = "2,";
		System.out.println(s2.substring(0, s2.length()-1));
		
		String s3 = "你好56";
		String s = new String(s3.getBytes(),"utf-8");
		System.out.println(s.getBytes().length);
		
		boolean pass = IdcardUtils.validateCard("43012219900327002x");
		System.out.println(pass);
		
		String s4 = "湘al3e27";
		System.out.println(s4.toUpperCase());
	}

}
