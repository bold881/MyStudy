package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

public class CollectionTest {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>(); 
		c.add("aaa");
		c.add("bbb");
		c.add("ddd");
		System.out.println(c);
		Collections.reverse((List<String>)c);//把List元素顺序反转
		System.out.println(c);
		Collection<String> l = Collections.singletonList("aaa");//初始化后不能修改
		System.out.println(l);
		Map<String,String>  map = Collections.emptyMap();//空的只读map
		Map<String,String> map1 = Collections.EMPTY_MAP;
	
		Enumeration en = System.getProperties().propertyNames();
		List proList = Collections.list(en);
		System.out.println(proList);
		Collections.swap(proList, 0, 1);
		
	}
}
