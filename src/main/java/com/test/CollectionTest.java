package com.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionTest {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>(); 
		c.add("aaa");
		c.add("bbb");
		c.add("ddd");
		System.out.println(c);
		Collections.reverse((List<String>)c);//把List元素顺序反转
		System.out.println(c);
	}
}
