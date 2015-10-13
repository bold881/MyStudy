package com.nvee.httpsUtil;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.X509Certificate;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.http.conn.ssl.SSLSocketFactory;



@SuppressWarnings("deprecation")
public class SSLSocketFactoryEx extends SSLSocketFactory{
	SSLContext sslContext = SSLContext.getInstance("TLS");
	public SSLSocketFactoryEx(KeyStore truststore)
			throws NoSuchAlgorithmException, KeyManagementException,
			KeyStoreException, UnrecoverableKeyException {
		super(truststore);
		TrustManager tm = new X509TrustManager() {
			
			@Override
			public java.security.cert.X509Certificate [] getAcceptedIssuers() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType)
					throws java.security.cert.CertificateException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void checkClientTrusted(X509Certificate[] chain, String authType)
					throws java.security.cert.CertificateException {
				// TODO Auto-generated method stub
				
			}
		};
		sslContext.init(null, new TrustManager[] { tm }, null);
	}
	@Override
	public Socket createSocket() throws IOException {
		// TODO Auto-generated method stub
		return sslContext.getSocketFactory().createSocket();
	}
	@Override
	public Socket createSocket(Socket socket, String host, int port,
			boolean autoClose) throws IOException, UnknownHostException {
		// TODO Auto-generated method stub
		return sslContext.getSocketFactory().createSocket(socket, host, port, autoClose);
	}
	

	}

