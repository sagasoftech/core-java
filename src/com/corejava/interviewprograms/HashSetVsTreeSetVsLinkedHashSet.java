package com.corejava.interviewprograms;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetVsTreeSetVsLinkedHashSet {

	public static void main(String[] args) {
		
		/*
		 * HashSet use case:
		 * 
		 * HashMap as underlying data structure  
		 * 
		 * 1. When we don't want duplicate items
		 * 2. Doesn't maintain any ordering
		 * 3. Get, add, remove all operation will be way more faster
		 */		
		Set<String> namesHS = new HashSet<>();
		namesHS.add("Walter");
		namesHS.add("Jasse");
		namesHS.add("Mike");
		System.out.println("HashSet: ");
		namesHS.forEach(System.out::println);

		/*
		 * TreeSet use case:
		 * 
		 * TreeMap as underlying data structure  
		 * 
		 * 1. When we don't want duplicate items
		 * 2. Natural ordering
		 * 3. Slower than HashSet because of ordering
		 */
		Set<String> namesTS = new TreeSet<>();
		namesTS.add("Walter");
		namesTS.add("Jasse");
		namesTS.add("Mike");
		System.out.println("TreeSet: ");
		namesTS.forEach(System.out::println);

		/*
		 * LinkedHashSet use case:
		 * 
		 * LinkedHashMap as underlying data structure  
		 * 
		 * 1. When we don't want duplicate items
		 * 2. Doesn't maintain natural ordering but maintains insertion order
		 * 3. Slower than HashSet but faster than TreeSet
		 */
		Set<String> namesLHS = new LinkedHashSet<>();
		namesLHS.add("Walter");
		namesLHS.add("Jasse");
		namesLHS.add("Mike");
		System.out.println("LinkedHashSet: ");
		namesLHS.forEach(System.out::println);
		
	}
}
