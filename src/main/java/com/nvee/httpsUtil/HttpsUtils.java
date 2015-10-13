package com.nvee.httpsUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.security.KeyStore;
import java.security.Provider;

import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HTTP;


public class HttpsUtils {
	private static HttpClient httpClient;
	
	@SuppressWarnings("deprecation")
	public static synchronized HttpClient getHttpClient(){
		if(httpClient == null){
			try {
				File file = new File("F:\\cailing.p12");
				System.out.println(file.getName());
				InputStream in = new FileInputStream(file);
				KeyStore trustStore= KeyStore.getInstance("pkcs12");
				char[] passw = "cailing88663".toCharArray();
				trustStore.load(in, passw);
				SSLSocketFactoryEx ssf=new SSLSocketFactoryEx(trustStore);
				ssf.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
				HttpParams params = new BasicHttpParams();
				HttpProtocolParams.setVersion(params, HttpVersion.HTTP_1_1);
				HttpProtocolParams.setContentCharset(params, HTTP.DEFAULT_CONTENT_CHARSET);
				HttpProtocolParams.setUseExpectContinue(params, true);
				
				ConnManagerParams.setTimeout(params, 10000);
				HttpConnectionParams.setConnectionTimeout(params, 10000);
				HttpConnectionParams.setSoTimeout(params, 10000);
				
				SchemeRegistry sre = new SchemeRegistry();
				
				sre.register(new Scheme("http",PlainSocketFactory.getSocketFactory(),80));
				sre.register(new Scheme("https",ssf,443));
				
				ClientConnectionManager conMan = new ThreadSafeClientConnManager(params,sre);
				httpClient = new DefaultHttpClient(conMan,params);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return new DefaultHttpClient();
			} 
		}
		return httpClient;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader read = null;
		try {
			StringBuffer result = new StringBuffer();
			HttpClient client = HttpsUtils.getHttpClient();
			HttpGet request = new HttpGet();
			request.setURI(new URI("https://172.19.27.135/test/test.html"));
			HttpResponse response = client.execute(request);
			if(response.getStatusLine().getStatusCode() != 200){
				request.abort();
			}
			read = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			String line = "";
			while((line = read.readLine()) != null){
				result.append(line);
				result.append("\n");
			}
			System.out.println(result.toString());
	} catch (Exception e) {
		// TODO: handle exception
	}finally{
		if(read != null){
			read.close();
		}
	}
}
}
