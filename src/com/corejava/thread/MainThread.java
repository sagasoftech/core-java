package com.corejava.thread;

public class MainThread {

	public static void main(String[] args) {
		/*
		for(int i = 0; i <=3; i++) {
			ExtendThread thread = new ExtendThread(i);
			thread.start();
		}
		*/
		for(int i = 0; i <=3; i++) {
			ImplementRunnable runnable = new ImplementRunnable(i);
			Thread thread = new Thread(runnable);
			thread.start();
			try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
