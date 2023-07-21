package com.corejava.thread;

public class ExtendThread extends Thread{

	private int threadName = 0;
	
	ExtendThread(int threadName){
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
