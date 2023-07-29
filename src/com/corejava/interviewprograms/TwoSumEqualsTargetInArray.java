package com.corejava.interviewprograms;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumEqualsTargetInArray {

   /*
	* Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	*
	* Example:
	*
	* Given nums = [3, 2, 4, 1], target = 6,
	*
	* Because nums[1] + nums[2] = 2 + 4 = 6
	*
	* return [1, 2].
	* 
	*/
	
	public static void main(String[] args) {
		
		int[] nums = {3, 2, 1, 0, 8, 4, 1};
		int target = 6;
		
		System.out.println("Result :" + Arrays.toString(twoSum(nums, target)));
		
		System.out.println("Result Fast :" + Arrays.toString(twoSumFastPerformance(nums, target)));
	}

	private static int[] twoSum(int[] nums, int target) {
		
		int[] result = new int[2];
				
		long start = System.currentTimeMillis();
		for(int i = 0; i < nums.length; i++) {
			for(int j = i+1; j < nums.length; j++) {
				if(nums[i]+nums[j] == target) {
					result[0] = i;
					result[1] = j;
					break;
				}
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken : "+ (end-start) + "ms");	
		
		return result;
	}
	
	private static int[] twoSumFastPerformance(int[] nums, int target) {
		
		int[] result = new int[2];
		
		HashMap<Integer, Integer> holder = new HashMap<>();
		
		/*{3, 2, 4, 1}
		 * Hold index of value in map and with required value to sum up
		 * HashMap[value_required_to_add, current_index]
		 */
		long start = System.currentTimeMillis();
		for(int i = 0; i < nums.length; i++) {
			if(holder.containsKey(target - nums[i])) {
				result[0] = i;
				result[1] = holder.get(target - nums[i]);
				break;
			}else {
				holder.put(nums[i], i);
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken : "+ (end-start) + "ms");	
		
		return result;
	}
}
