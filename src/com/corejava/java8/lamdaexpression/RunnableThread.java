package com.corejava.java8.lamdaexpression;

public class RunnableThread {

	public static void main(String[] args) {
		
		Runnable r1 = () -> {
			System.out.println("Thread running ...");
		};
		
		//r1.run();
		
		Thread t=new Thread(r1);  
        t.start();  
	}
}
