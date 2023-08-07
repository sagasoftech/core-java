package com.corejava.dynamicprograming;

import java.util.ArrayList;
import java.util.List;

/*
 * Write a function 'howSum(targetSum, numbers)' that takes in a targetSum and an array of numbers as arguments.
 * 
 * The function should return an array containing any combination of elements that add up to exactly the targetSum. 
 * If there is no combination adds up to the targetSum, then return null.
 * 
 * If there are multiple combinations possible, you may return any single one;
 * 
 * e.g.
 * howSum(7, [5, 3, 4, 7]) => [3, 4] or [7]
 * howSum(8, [2, 3, 5]) => [2, 2, 2, 2] or [3, 5]
 * howSum(7, [2, 4]) => null
 * howSum(0, [1, 3, 2]) => []
 * 
 */
public class HowSumInArray {

	public static void main(String[] args) {
		System.out.println(howSum(7 , new int[]{5, 3, 4, 7}));
		System.out.println(howSum(8 , new int[]{2, 3, 4}));
		System.out.println(howSum(7 , new int[]{2, 4}));
		System.out.println(howSum(0 , new int[]{1, 3, 2}));
	}
	
	/*
	 * Time Complexity: O(n^m * m)
	 * Space Complexity: O(m)
	 */
	public static List<Integer> howSum(int targetSum, int[] numbers) {
		
		if(targetSum == 0) return new ArrayList<Integer>();
		if(targetSum < 0) return null;
		
		for(int num = 0; num < numbers.length; num++) {
			int remainder = targetSum - numbers[num];
			List<Integer> remainderResult = howSum(remainder, numbers);
			if(remainderResult != null) {
				remainderResult.add(numbers[num]);
				return remainderResult;
			}
		}
	
		return null;
	}
}
