package com.corejava.interviewprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorVsArrayList {

	public static void main(String[] args) throws InterruptedException {
		
		int size = 10000000;
		
		/*
		 * Both ArryaList and Vector uses array as underlying data structure  
		 */
		
		//Execution Time
		System.out.println("Performance Test ::");
		
		List<Integer> arrList = new ArrayList<Integer>();
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < size; i++) {
			arrList.add(i);
		}
		long endTime = System.currentTimeMillis();
		System.out.println("Added " + arrList.size() + " elements to ArrayList in : " + (endTime - startTime) + " ms");

		List<Integer> vector = new Vector<Integer>();
		startTime = System.currentTimeMillis();
		for(int i = 0; i < size; i++) {
			vector.add(i);
		}
		endTime = System.currentTimeMillis();
		System.out.println("Added " + vector.size() + " elements to Vector : " + (endTime - startTime) + " ms");
		
		/*
		 * Vector runs longer than ArrayList
		 * Therefore, poor performance  
		 */
		
		//Multithreading
		System.out.println("Multithreading Test ::");
		
		List<Integer> multithreadedArrList = Collections.synchronizedList(new ArrayList<Integer>());
		startTime = System.currentTimeMillis();
		Thread t1 = new Thread(() -> {
			for(int i = 0; i < size; i++) {
				multithreadedArrList.add(i);
			}
		});
		Thread t2 = new Thread(() -> {
			for(int i = 0; i < size; i++) {
				multithreadedArrList.add(i);
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		endTime = System.currentTimeMillis();
		System.out.println("Added " + multithreadedArrList.size() + " elements to ArrayList in : " + (endTime - startTime) + " ms");

		List<Integer> multithreadedVector = new Vector<Integer>();
		startTime = System.currentTimeMillis();
		t1 = new Thread(() -> {
			for(int i = 0; i < size; i++) {
				multithreadedVector.add(i);
			}
		});
		t2 = new Thread(() -> {
			for(int i = 0; i < size; i++) {
				multithreadedVector.add(i);
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		endTime = System.currentTimeMillis();
		System.out.println("Added " + multithreadedVector.size() + " elements to Vector in : " + (endTime - startTime) + " ms");
		
		/*
		 * With multithreaded environment, ArrayList is loosing some element while adding
		 * Bcz, ArrayList is not threadsafe
		 * 
		 * However, vector runs longer but holds all the elements, bcz, it's threadsafe
		 * 
		 */
		
		/*
		 * By adding wrapper around ArralyList, we can make it threadsafe
		 * Here, performance will be degraded compare to Vector
		 * 
		 * List<Integer> multithreadedArrList = Collections.synchronizedList(new ArrayList<Integer>());
		 */
	}
}
