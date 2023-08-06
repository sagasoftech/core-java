package com.corejava.java8.miscellaneous;

public class TimeComplexity {

	public static void main(String[] args) {
		
		System.out.println("complexity_1");
		complexity_1(5);
		System.out.println("complexity_2");
		complexity_2(5);
		System.out.println("complexity_3");
		complexity_3(5);
	}
	
	/*
	 * Time Complexity: O(n)
	 * Space Complexity: O(n)
	 */
	public static void complexity_1(int n) {
		System.out.println(n);
		if(n <= 1) return;
		complexity_1(n-1);
	}
	
	/*
	 * Time Complexity: O(n/2) = O(n)
	 * Space Complexity: O(n)
	 */
	public static void complexity_2(int n) {
		System.out.println(n);
		if(n <= 1) return;
		complexity_1(n-2);
	}
	
	/*
	 * Time Complexity: O(2^n)
	 * Space Complexity: O(n)
	 */
	public static void complexity_3(int n) {
		System.out.println(n);
		if(n <= 1) return;
		complexity_1(n-1);
		complexity_1(n-1);
	}
}
