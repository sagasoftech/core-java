package com.corejava.java8.methodreference;

public class StaticMethodOfRunnableInterface {

	public static void ThreadStatus() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		
		/*
		Runnable r1 = () -> {
			System.out.println("Thread is running...");
		};
		
		//replacement for above
		Runnable r1 = StaticMethodOfRunnableInterface::ThreadStatus;
		
		Thread t2 = new Thread(r1);
		*/
		
		//So the final version
		Thread t2 = new Thread(StaticMethodOfRunnableInterface::ThreadStatus);
		t2.start();
	}
}
