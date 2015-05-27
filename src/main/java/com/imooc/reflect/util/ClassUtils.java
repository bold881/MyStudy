package com.imooc.reflect.util;

import java.lang.reflect.Method;

public class ClassUtils {
	public static void printClassMessage(Object obj ) throws IllegalAccessException{
		Class o = obj.getClass();
		Method[] md = o.getMethods();
		for (int i = 0; i < md.length; i++) {
			String mdName = md[i].getName();
			Class<?> returnType = md[i].getReturnType();
			System.out.println("方法返回类型:"+returnType.getName());
			System.out.println("方法名称:"+mdName+"[");
			Class<?>[] param = md[i].getParameterTypes();
			for (Class<?> class1 : param) {
				System.out.println("参数类型:"+class1.getName()+",");
			}
			System.out.println("]");
		}
	}
}
