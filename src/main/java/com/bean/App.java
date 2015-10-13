package com.bean;

import java.util.HashMap;
import java.util.Map;

import javax.management.MBeanServer;
import javax.management.MBeanServerFactory;
import javax.management.ObjectName;

public class App {
	public static void main(String[] args) throws Exception {
		// 创建MBeanServer 两种方式都可以
		//MBeanServer mbser = ManagementFactory.getPlatformMBeanServer();
		MBeanServer mbser = MBeanServerFactory.createMBeanServer();
		// 新建MBean ObjectName, 在MBeanServer里标识注册的MBean  
		ObjectName obn = new ObjectName("com.bean:type=echo");
		//新建echobean
		Echo echo = new Echo();
		// 在MBeanServer里注册MBean, 标识为ObjectName(com.bean:type=echo)  
		mbser.registerMBean(echo, obn);
		Map map = new HashMap<String,String>();
		map.put("a", "a");
		map.put("b", "b");
		mbser.invoke(obn, "print", new Object[]{"hello nvee",2,map},  new String[]{"java.lang.String","int","java.util.Map"});
		
	}
}
