package com.test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("fa");
		list.add("ga");
		System.out.println(String.format("list=%s", list));
	}

}
