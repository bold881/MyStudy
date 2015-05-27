package com.nvee.spider;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

/**
 * 
 * @author Administrator
 *
 */
public class DownloadPage {
	public static String getContentFormUrl(String url){
		HttpClient client = new DefaultHttpClient();
		HttpGet getHttp = new HttpGet(url);
		
		String content = null;
		HttpResponse response;
		try {
			response = client.execute(getHttp);
			HttpEntity entity = response.getEntity();
			VisitedUrlQueue.addElem(url);
			if(entity != null){
				/*转化为文本信息*/
				content = EntityUtils.toString(entity);
				/*判断是否符合下载网页源代码到本地的条件*/
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}
