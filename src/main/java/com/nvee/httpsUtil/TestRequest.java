package com.nvee.httpsUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;


public class TestRequest {
	public static String getResponse(){
		StringBuffer result = new StringBuffer();
		BufferedReader read = null;
		try {
			InputStream ins = new FileInputStream(new File("F:\\cailing.p12"));
			CertificateFactory cerfac = CertificateFactory.getInstance("x.509");
			Certificate cert = cerfac.generateCertificate(ins);
			KeyStore store = KeyStore.getInstance("pkcs12","bc");
			store.load(null,null);
			store.setCertificateEntry("trust", cert);
			SSLSocketFactory ssf = new SSLSocketFactory(store);
			Scheme scheme = new Scheme("https",ssf,443);
			HttpClient client = new DefaultHttpClient();
			client.getConnectionManager().getSchemeRegistry().register(scheme);
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
			Map map = BeanUtils.createCache();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result.toString();
	}
	public static void main(String[] args) {
		String res = getResponse();
		System.out.println(res);
	}
}
