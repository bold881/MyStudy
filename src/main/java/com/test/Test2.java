package com.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Test2 {
	public static void main(String[] args) {
		Date date  = new Date();
		long str = System.currentTimeMillis();
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		Random r = new Random();
		String s1= format.format(date);
		String UniqueNo = format.format(date)+String.format("%06d", 5); 
		System.out.println(UniqueNo);
		System.out.println(s1);
		String ss1 = "aaa";
		String ss2 = ss1;
		ss1 = ss2;
		System.out.println(ss1);
		System.out.println(ss2);
	}
}
