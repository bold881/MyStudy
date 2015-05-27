package com.imooc.reflect;

import com.imooc.reflect.util.ClassUtils;

public class ClassDemo2 {
	public static void main(String[] args) {
		Foo foo = new Foo();
		try {
			ClassUtils.printClassMessage(foo);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		String custNo =  String.format("CI%010d", 1);
		System.out.println(custNo);
	}

}
class Foo{
	public String getName(long id){
		return "";
	}
	public boolean isRight(int a,String b){
		return true;
	}
}
