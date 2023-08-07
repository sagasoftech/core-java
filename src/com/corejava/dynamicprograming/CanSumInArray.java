package com.corejava.dynamicprograming;

import java.util.HashMap;
import java.util.Map;

/*
 * Write a function 'canSum(targetSum, numbers)' that takes in a targetSum and an array of numbers as arguments.
 * 
 * The function should return a boolean indicating whether or not it is possible to generate the targetSum using number from the array.
 * 
 * You may use an element of the array as many times as needed.
 * 
 * You may assume that all input numbers are nonnegative.
 * 
 */
public class CanSumInArray {

	public static void main(String[] args) {
		System.out.println(canSum(7 , new int[]{5, 3, 4, 7}));
		System.out.println(canSumLinear(800 , new int[]{5, 3, 4, 7}));
	}
	
	/*
	 * Time Complexity: O(n^m)
	 * Space Complexity: O(m)
	 */
	public static boolean canSum(int targetSum, int[] numbers) {
		
		if(targetSum == 0) return true;
		if(targetSum < 0) return false;
		
		for(int num = 0; num < numbers.length; num++) {
			int remainder = targetSum - numbers[num];
			if(canSum(remainder, numbers)) {
				return true;
			}
		}
	
		return false;
	}
	
	/*
	 * Time Complexity: O(n*m)
	 * Space Complexity: O(m)
	 */
	private static Map<Integer, Boolean> hmTargetSum = new HashMap<>();
	public static boolean canSumLinear(int targetSum, int[] numbers) {
		if(hmTargetSum.containsKey(targetSum)) return hmTargetSum.get(targetSum);
		if(targetSum == 0) return true;
		if(targetSum < 0) return false;
		
		for(int num = 0; num < numbers.length; num++) {
			int remainder = targetSum - numbers[num];
			if(canSumLinear(remainder, numbers)) {
				hmTargetSum.put(remainder, true);
				return true;
			}
		}
	
		return false;
	}
}
