package com.imooc.reflect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestDemo2 {
	public static void main(String[] arg){
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		Map<String,Object> maps = new HashMap<String,Object>();
		maps.put("custNo", "ci1111111111");
		maps.put("custName", "cdsdsdsd");
		maps.put("type", 12);
		
			for(int i=0;i<3;i++){
				Map<String,Object> map = new HashMap<String,Object>();
				map.putAll(maps); 
				map.put("bill", "第一个"+i);
				list.add(map);
				System.out.println(map);
			}
		System.out.println(list);
	}
}
