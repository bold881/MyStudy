package com.Thread.rabbitmq;

import java.util.concurrent.BlockingQueue;

public class  Customer implements Runnable{
	private  final BlockingQueue<Integer> queue;
	
	public Customer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}
	@Override
	public void run() {
		while (true) {
			try {
				System.out.println("customer:消费第"+queue.take()+"个");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
