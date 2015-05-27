package com.test;

import org.junit.Test;

public class TestString {
	@Test
	public void testStringStartWith(){
		String custNo = "CI000000001";
		System.out.println(custNo.startsWith("CI001"));
		String str = "https://passport.baidu.com/2F/?login&tpl=mn&u=http%3A%2F%2Fwww.baidu.com%2F";
		String[] arr = str.split("2F");
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
	}
}
