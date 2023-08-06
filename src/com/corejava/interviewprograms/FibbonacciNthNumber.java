package com.corejava.interviewprograms;

public class FibbonacciNthNumber {

	public static void main(String[] args) {
		System.out.println(getFibAt(3));
		System.out.println(getFibAt(6));
		System.out.println(getFibAt(7));
		System.out.println(getFibAt(8));
		System.out.println(getFibAt(9));
	}
	
	/*
	 * Time Complexity: O(2^n)
	 * Space Complexity: O(n)
	 */
	public static int getFibAt(int n) {
		
		if(n<=2) return 1;
		return getFibAt(n-1) + getFibAt(n-2);
	}
}
