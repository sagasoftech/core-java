package com.corejava.interviewprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MinMaxSum {

	/*
	 * Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
	 * 
	 * Example
	 * arr=[1,3,5,7,9]
	 * The minimum sum is 1+3+5+7=16 and the maximum sum is 3+5+7+9=24. 
	 * The function prints
	 * 16 24
	 */
	
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		myList.add(256741038);
		myList.add(623958417);
		myList.add(467905213);
		myList.add(938071625);
		myList.add(714532089);
		

		miniMaxSum(myList);
		//traversing using Iterator
		Iterator<Integer> it = myList.iterator();
	}
	
	public static void miniMaxSum(List<Integer> arr) {
	    
	    Collections.sort(arr);
	    long min = arr.stream()
	            .mapToLong(Integer::intValue)
	            .boxed()
	    			 .limit(4)
	    			 //.reduce(0, (a, b) -> a + b);
	    			 .reduce(0L, Long::sum);
	    Collections.reverse(arr);
	    long max = arr.stream()
	            .mapToLong(Integer::intValue)
	            .boxed()
				 .limit(4)
				 //.reduce(0, (a, b) -> a + b);
				 .reduce(0L, Long::sum);
	    System.out.println(min + " "+ max);
	}
}
