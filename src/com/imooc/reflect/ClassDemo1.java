package com.imooc.reflect;

public class ClassDemo1 {
	public static void main(String[] args) {
		try {
				Class<?> cla =Class.forName("com.imooc.reflect.Excel");
				OffceAble oa = (OffceAble)cla.newInstance();
				oa.print();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
		   } catch (ClassNotFoundException e) {
			   e.printStackTrace();
		}
	}
	
}
