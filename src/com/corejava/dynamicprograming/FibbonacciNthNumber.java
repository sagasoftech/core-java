package com.corejava.dynamicprograming;

import java.util.HashMap;
import java.util.Map;

public class FibbonacciNthNumber {

	public static void main(String[] args) {
		System.out.println(getFibAt(3));
		System.out.println(getFibAt(6));
		System.out.println(getFibAt(7));
		System.out.println(getFibAt(8));
		System.out.println(getFibAt(9));
		//System.out.println(getFibAt(50));
		System.out.println(getFibAtDynamic(50));
	}
	
	/*
	 * Recursive Programming
	 * 
	 * Time Complexity: O(2^n)
	 * Space Complexity: O(n)
	 */
	public static int getFibAt(int n) {
		
		if(n<=2) return 1;
		return getFibAt(n-1) + getFibAt(n-2);
	}
	
	/*
	 * Dynamic Programming
	 * 
	 * Time Complexity: O(2n) = O(n)
	 * Space Complexity: O(n)
	 */
	
	private static Map<Integer, Integer> hmFib = new HashMap<>();
	public static int getFibAtDynamic(int n) {
		if(hmFib.containsKey(n)) return hmFib.get(n);
		if(n<=2) return 1;
		hmFib.put(n, getFibAtDynamic(n-1) + getFibAtDynamic(n-2));
		
		return hmFib.get(n);
	}
}
