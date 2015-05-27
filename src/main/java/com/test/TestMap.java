package com.test;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
		Map<String,Integer> p = new HashMap<String,Integer>(){
			{
				put("aa",1);
			}
		};
		System.out.println(p);
		Map<String,Integer> p1 = new HashMap<String,Integer>();
		p1.put("bb", 22);
		System.out.println(p1);
	}
	
	
}
