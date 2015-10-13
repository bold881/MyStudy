package com.test;

import java.util.ArrayList;
import java.util.List;

import com.tool.HexUtils;

public class Test5 {

	public static void main(String[] args) {
		String a ="pinetree";
		byte[] arr = a.getBytes();
		String str = HexUtils.encodeHex(arr);
		
		
		List<String> list  = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.remove("aa");
		System.out.println(list);
		
		String s1 = "01-当前用户已被注册";
		String s2 = "当前用户已被注册1";
		System.out.println(s1.contains(s2));
		boolean p1 = false;
		boolean p2 = true;
		boolean p3 = false;
		if(p1 | p2 |p3){
			System.out.println(11);
		}
	}

}
