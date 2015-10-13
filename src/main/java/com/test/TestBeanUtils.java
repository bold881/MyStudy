package com.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import com.bean.PrimaryAcctVo;
import com.google.gson.Gson;

public class TestBeanUtils {
	private static Gson gson = new Gson();
	public static void main(String[] args) {
		Map<String,String> map = testDescribe();
		System.out.println(gson.toJson(map));

	}
	/*
	 * 测试bean转map 
	 */
	private static Map testDescribe(){
		PrimaryAcctVo vo = new PrimaryAcctVo();
		vo.setCreater("nvee");
		vo.setCreateTime(new Date());
		vo.setCustNo("CI0000001");
		vo.setFreezeFlag(1);
		vo.setMerchantNo("MC0000001");
		Map<String,String> map= null;
		try {
			map = BeanUtils.describe(vo);
			String property = BeanUtils.getProperty(vo, "creater");
			System.out.println(property);
			Map properties = new HashMap();
			BeanUtils.populate(vo, properties);
			System.out.println("properties="+properties);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	} 
	
	/*
	 * 
	 */
}
