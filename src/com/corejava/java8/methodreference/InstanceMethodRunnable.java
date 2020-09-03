package com.corejava.java8.methodreference;

/**
 * In the following example, we are referring instance (non-static) method.
 * Runnable interface contains only one abstract method. So, we can use it as
 * functional interface.
 * 
 * @author sagar.dighe
 *
 */
public class InstanceMethodRunnable {
	public void printnMsg() {
		System.out.println("Hello, this is instance method");
	}

	public static void main(String[] args) {
		Thread t2 = new Thread(new InstanceMethodRunnable()::printnMsg);
		t2.start();
	}
}