package com.nvee.spider;

import java.util.HashSet;
import java.util.Set;

/**
 * 主要保持已访问的url ，使用hashSet保持
 * @author Administrator
 *
 */
public class VisitedUrlQueue {
	public static Set<String> visitedUrlQueue = new HashSet<String>();
	
	public synchronized static void addElem(String url){
		visitedUrlQueue.add(url);
	}
	public synchronized static boolean isContains(String url){
		return visitedUrlQueue.contains(url);
	}
	public synchronized static int size(){
		return visitedUrlQueue.size();
	}
}
