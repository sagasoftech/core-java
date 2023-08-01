package com.corejava.interviewprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateUsingSet {

	public static void main(String[] args) {
		List<Integer> numberList = new ArrayList<>();
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(1);
		
		Set<Integer> distinctNumbers = new HashSet<>(numberList);
		System.out.println("Distinct Numbers: "+ distinctNumbers);
	}
	
}
