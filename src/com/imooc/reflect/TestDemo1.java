package com.imooc.reflect;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class TestDemo1 {
	public static void main(String[] args) {
		Map<String,Object> pa = new HashMap<String,Object>();
		pa.put("name", "nvee");
		pa.put("age", 24);
		pa.put("addr", "湖南长沙");
		pa.put("sex", "man");
		People pl =new People();
		try {
			 pl = (People) ConvertUtils.convertMap(People.class, pa);
		} catch (IntrospectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(pl.toString());
	}
}
