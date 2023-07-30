package com.corejava.interviewprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LongestSubstringWithoutRepeatingChar {

   /*
	* Given a string str, find the length of the longest substring without repeating characters. 
	* 
	* Example:
	* 
	* For “ABDEFGABEF”, the longest substring are “BDEFGA” and “DEFGAB”, with length 6.
	* 
	* For “BBBB” the longest substring is “B”, with length 1.
	* 
	* For “GEEKSFORGEEKS”, there are two longest substrings shown in the below diagrams, with length 7
	* "EKSFORG" and "KSFORGE"
	*/
	
	public static void main(String[] args) {
	    String str = "geeksforgeeks";
	    System.out.println("The input string is " + str);
	 
	    int len = longestUniqueSubstr(str);
	     
	    System.out.println("The length of the longest " +
	                       "non-repeating character " +
	                       "substring is " + len);
	}

	private static int longestUniqueSubstr(String str) {
		long start = System.currentTimeMillis();
		List<String> strRList = new ArrayList<>();
		//“GEEKSFORGEEKS”
		char [] strArray = str.toCharArray();
		
		for(int i = 0; i < strArray.length; i++) {
			strRList.add(i, String.valueOf(strArray[i]));
			for(int j = i+1; j < strArray.length; j++) {
				if(strRList.get(i).indexOf(strArray[j]) != -1) {
					break;
				}else {
					strRList.set(i, strRList.get(i).concat(String.valueOf(strArray[j])));
				}
			}
		}
		
		String maxString = Collections.max(strRList, Comparator.comparing(String::length)); // or s -> s.length()
		System.out.println(maxString);
		long end = System.currentTimeMillis();
		System.out.println("Time taken : "+ (end-start) + "ms");	
		return maxString.length();
	}
}
