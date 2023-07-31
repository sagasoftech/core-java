package com.corejava.interviewprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
 * The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
 * 
 * Consider the number of elements in nums which are not equal to val be k, to get accepted, 
 * you need to do the following things:
 * 
 * Change the array nums such that the first k elements of nums contain the elements 
 * which are not equal to val. The remaining elements of nums are not important as well as the size of nums
 * 
 * Return k.

 */
public class RemoveElementAndShiftArray {

	public static void main(String[] args) {
		
		int[] nums = new int[] {0,1,2,2,3,0,4,2};
		int val = 2;
		
		//Result: Array: [0, 1, 3, 0, 4, -1, -1, -1]
		System.out.println("Length after remove: " + removeElement(nums, val));
		System.out.println("Array: " + Arrays.toString(nums));
		
		int[] nums2 = new int[] {0,1,2,2,3,0,4,2};
		System.out.println("Length after remove: " + removeElementLinearTime(nums2, val));
		System.out.println("Array: " + Arrays.toString(nums2));
	}
	
    public static int removeElement(int[] nums, int val) {
        int counter = 0;
        List<Integer> placeToFill = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
            	placeToFill.add(i);
                
                nums[i] = -1;
                counter++;
            }else if(placeToFill.size() > 0){
                nums[placeToFill.get(0)] = nums[i];
                placeToFill.remove(0);
                nums[i] = -1;
                placeToFill.add(i);
            }
        }
        return nums.length - counter;
    }
    
    public static int removeElementLinearTime(int[] nums, int val) {
        int c = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[c] = nums[i];
                c++;
            }
        }
        
        return c;
    }
}
