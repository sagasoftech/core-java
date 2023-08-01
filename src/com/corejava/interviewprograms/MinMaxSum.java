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
		
		List<Integer> myList2 = new ArrayList<>();
		myList2.add(256741038);
		myList2.add(623958417);
		myList2.add(467905213);
		myList2.add(938071625);
		myList2.add(714532089);
		

		miniMaxSumConcise(myList2);
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
	
	public static void miniMaxSumConcise(List<Integer> arr) {
	    
        long sum = 0;
        long max = arr.get(0);
        for (int i =0;i<5;i++){
            sum+=arr.get(i);
        } 
        long min = sum;

        for (int i = 0;i<5;i++){
            long temp = sum;
            temp = temp - arr.get(i);
            if (temp < min){
                min = temp;
            }
            if (temp > max){
                max = temp;
            }
        }
        System.out.println(min + " " + max);
	}
}
