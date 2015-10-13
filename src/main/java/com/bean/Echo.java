package com.bean;

import java.util.Map;

public class Echo implements EchoMBean {

	@Override
	public void print(String echoName,int n,Map map) {
		System.out.println(echoName+n+map.toString());
	}

}
