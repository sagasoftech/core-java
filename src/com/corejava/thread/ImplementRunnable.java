package com.corejava.thread;

/*
 * With Runnable advantage is 
 * implement another interfaces
 * extend another classes
 */
public class ImplementRunnable implements Runnable{

	private int threadName = 0;
	
	ImplementRunnable(int threadName){
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(i + " from thread " + threadName);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
