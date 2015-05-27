package com.nvee.spider;

public class Test {

	public static void main(String[] args) {
		 String url = "http://www.253lu.com/yz/20135.html";  
	     // String url1 = "http://www.oschina.net/code/explore";  
	      //String url2 = "http://www.oschina.net/code/explore/achartengine";  
	     // String url3 = "http://www.oschina.net/code/explore/achartengine/client";
	      
	      UrlQueue.addElem(url);  
//	      UrlQueue.addElem(url1);  
//	      UrlQueue.addElem(url2);  
//	      UrlQueue.addElem(url3);
	      
	      UrlDataHanding[] url_Handings = new UrlDataHanding[5];
	      for (int i = 0; i < url_Handings.length; i++) {
			url_Handings[i] = new UrlDataHanding();
			new Thread(url_Handings[i]).start();
		}
	}

}
