package com.nvee.httpUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class HttpClient {

	public  String sendMsg(String urlStr,String paramStr,String reqStr)  {
		URL url =null;
		HttpURLConnection conn=null;
		String resp="";
		try {
			StringBuilder sb = new StringBuilder(urlStr).append("?");
			sb.append(reqStr).append("=").append(URLEncoder.encode(paramStr,"utf-8"));
			url = new URL(sb.toString());
			System.out.println(sb.toString());
			// 打开和URL之间的连接
			conn = (HttpURLConnection) url.openConnection();
			// 设置通用的请求属性
			conn.setRequestMethod("POST");
			conn.setRequestProperty("accept", "*/*");
			conn.setRequestProperty("connection", "Keep-Alive");
			conn.setRequestProperty("user-agent",
	                 "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
			conn.setUseCaches(false);
			// 建立实际的连接
			conn.connect();
			InputStream in = conn.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(in,"utf-8"));
			String tempLine = rd.readLine();
			StringBuffer tempStr = new StringBuffer();
			String crlf = System.getProperty("line.separator");
			while (tempLine != null) {
				tempStr.append(tempLine);
				tempStr.append(crlf);
				tempLine = rd.readLine();
			}
			resp = tempStr.toString();
			rd.close();
			in.close();
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			if (url != null) {
				conn.disconnect();
			}
		}
		return resp;
	}

}
