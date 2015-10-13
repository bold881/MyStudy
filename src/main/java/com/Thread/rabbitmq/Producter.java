package com.Thread.rabbitmq;

import java.util.concurrent.BlockingQueue;

public class Producter implements Runnable{
	private  final BlockingQueue<Integer> queue;
	
	public Producter(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}
	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.println("product:生成第"+i+"个");
			try {
				queue.put(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
