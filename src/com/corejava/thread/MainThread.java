package com.corejava.thread;

public class MainThread {

	public static void main(String[] args) {
		
		for(int i = 0; i <=3; i++) {
			ExtendThread thread = new ExtendThread(i);
			thread.start();
		}
	}
}
