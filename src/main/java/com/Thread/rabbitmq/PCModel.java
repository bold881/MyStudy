package com.Thread.rabbitmq;

import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class PCModel {
	public static void main(String[] args) {
		BlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>();
		Producter per = new Producter(queue);
		Customer cer = new Customer(queue);
		Thread pthread = new Thread(per);
		Thread cthread = new Thread(cer);
		cthread.start();
		pthread.start();
		try {
		Process p = 	Runtime.getRuntime().exec("ls");
		System.out.println(p.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
