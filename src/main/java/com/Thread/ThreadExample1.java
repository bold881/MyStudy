package com.Thread;

public class ThreadExample1 extends Thread{
	boolean stop = false;
	public static void main(String[] args) throws Exception {
		ThreadExample1 thread = new ThreadExample1();
		System.out.println("Starting thread......");
		thread.start();
		Thread.sleep(3000);
		System.out.println("Interrupting thread....");
		thread.interrupt();
		Thread.sleep(3000);
		System.out.println("Stopping thread....");
	}
	@Override
	public void run() {
		while(!stop){
			System.out.println("Thread is running....");
			long time = System.currentTimeMillis();
			while((System.currentTimeMillis() - time) < 1000){
			}
		}
		System.out.println("Thread exiting under request....");
	}
}
