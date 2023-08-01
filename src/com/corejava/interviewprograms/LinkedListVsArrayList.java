package com.corejava.interviewprograms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListVsArrayList {
	
	public static void main(String[] args) {
		
		/*
		 * LinkedList uses element(node) as underlying data structure which has previous and next reference
		 */
		List<String> namesLinkedList =  new LinkedList<>();
		namesLinkedList.add("John");
		namesLinkedList.add("Paul");
		namesLinkedList.add("George");
		namesLinkedList.add("Ringo");
		
		/*
		 * Get 3rd element
		 * 
		 * Start looking from begining/end of the elements until desire record
		 * This process is way slower than ArrayList
		 * 
		 */
		System.out.println(namesLinkedList.get(2));
		
		/*
		 * Add/Remove
		 * 
		 * Start at begining of the list until get to the spot where we want to insert
		 * Add element and adjust next and previous reference
		 */
		namesLinkedList.add(1, "Jerry");
		
		/*
		 * ArryaList uses array as underlying data structure  
		 */
		List<String> namesArrayList =  new ArrayList<>();
		namesArrayList.add("John");
		namesArrayList.add("Paul");
		namesArrayList.add("George");
		namesArrayList.add("Ringo");
		
		/*
		 * Get 3rd element
		 * 
		 * Underlying Array has random access using which ArrayList can get the record very fast
		 * No matters where the element is at the first, middle or end
		 * it retrieves in constant amount of time
		 * 
		 */
		System.out.println(namesArrayList.get(2));
		
		/*
		 * Add/Remove
		 * 
		 * Create whole new Array that can hold new Array start with empty
		 * Copy all the old elements to the right place leaving required space for new element
		 * Copy new element to the correct spot
		 */
		namesArrayList.add(1, "Jerry");
		
		
		/*
		 * Nutshell: when to use
		 * 
		 * For tiny list, it does not matter - not a mesurable performance
		 * 
		 * For big list
		 * 
		 * Use LinkedList for adding and removing elements is way faster than ArrayList 
		 * 
		 * Use ArrayList for getting elements is way faster thank LinkedList
		 */
		
	}

}
