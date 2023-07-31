package com.corejava.interviewprograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElementInArray {
	
	public static void main(String[] args) {
		int [] nums = new int[] {2,2,1,1,1,2,2,3,5,5,1};
		
		//Result: 2
		System.out.println("Majority Element: " + majorityElement(nums));
	}
	
	public static int majorityElement(int[] nums) {
		Map<Integer, Integer> resultMap = new HashMap<>();
		int maxCount = 0;
		int element = -1;
		for(int num: nums) {
			if(resultMap.containsKey(num)) {
				resultMap.put(num, resultMap.get(num)+1);
			}else {
				resultMap.put(num, 1);
			}
			if(maxCount < resultMap.get(num)){
				element = num;
			}
		}
		return element;
    }
}
