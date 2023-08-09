package com.corejava.dynamicprograming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * Write a function 'bestSum(targetSum, numbers)' that takes in a targetSum and an array of numbers as arguments.
 * 
 * The function should return an array containing shortest combination of numbers that add up to exactly the targetSum. 
 * 
 * If there is a tie for the shortest combination, you me return
 * any on of the shortest.
 * 
 * e.g.
 * howSum(7, [5, 3, 4, 7]) => [7]
 * howSum(8, [2, 3, 5]) => [3, 5]
 * howSum(8, [1, 4, 5]) => [4, 4]
 * howSum(100, [1, 2, 5, 25]) => [25, 25, 25, 25]
 * 
 */
public class BestSumInArray {

	public static void main(String[] args) {
		System.out.println(bestSum(7 , new int[]{5, 3, 4, 7}));
		System.out.println(bestSum(8 , new int[]{2, 3, 5}));
		System.out.println(bestSum(8 , new int[]{1, 4, 5}));
		//System.out.println(bestSum(100 , new int[]{1, 2, 5, 25}));

		hmTargetArr = new HashMap<>();
		System.out.println(bestSumMemo(7 , new int[]{5, 3, 4, 7}));
		hmTargetArr = new HashMap<>();
		System.out.println(bestSumMemo(8 , new int[]{2, 3, 5}));
		hmTargetArr = new HashMap<>();
		System.out.println(bestSumMemo(8 , new int[]{1, 4, 5}));
		hmTargetArr = new HashMap<>();
		System.out.println(bestSumMemo(100 , new int[]{1, 2, 5, 25}));
	}
	
	/*
	 * Time Complexity: O(n^m * m)
	 * Space Complexity: O(m^2)
	 */
	public static List<Integer> bestSum(int targetSum, int[] numbers) {
		
		if(targetSum == 0) return new ArrayList<Integer>();
		if(targetSum < 0) return null;
		
		List<Integer> shortestCombination = null;
		
		for(int num = 0; num < numbers.length; num++) {
			int remainder = targetSum - numbers[num];
			List<Integer> remainderResult = bestSum(remainder, numbers);
			if(remainderResult != null) {
				remainderResult.add(numbers[num]);
				
				if(shortestCombination == null 
						|| remainderResult.size() < shortestCombination.size()) {
					shortestCombination = remainderResult;
				}
			}
		}
		return shortestCombination;
	}
	
	/*
	 * Time Complexity: O(m^2 * n)
	 * Space Complexity: O(m^2)
	 */
	private static Map<Integer, List<Integer>> hmTargetArr = null;
	public static List<Integer> bestSumMemo(int targetSum, int[] numbers) {
		
		if(hmTargetArr.containsKey(targetSum)) return hmTargetArr.get(targetSum);
		
		if(targetSum == 0) return new ArrayList<Integer>();
		if(targetSum < 0) return null;
		
		List<Integer> shortestCombination = null;
		
		for(int num = 0; num < numbers.length; num++) {
			int remainder = targetSum - numbers[num];
			List<Integer> remainderResult = bestSumMemo(remainder, numbers);
			if(remainderResult != null) {
				List<Integer> remainderResultClone = remainderResult.stream().map(i -> i).collect(Collectors.toList());
				remainderResultClone.add(numbers[num]);
				
				if(shortestCombination == null 
						|| remainderResultClone.size() < shortestCombination.size()) {
					shortestCombination = remainderResultClone;
				}
			}
		}
		List<Integer> shortestCombinationClone = null;

		if(shortestCombination != null) {
			shortestCombinationClone = shortestCombination.stream().map(i -> i).collect(Collectors.toList());
		}
		hmTargetArr.put(targetSum, shortestCombinationClone);
		return shortestCombinationClone;
	}
	
}
