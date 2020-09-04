package com.corejava.java8.miscellaneous;

import java.util.Arrays;

/**
 * Java provides a new additional feature in Array class which is used to sort
 * array elements parallel. The methods are called parallelSort() and are
 * overloaded for all the primitive data types and Comparable objects.
 * 
 * @author sagar.dighe
 *
 */
public class ParallelArraySorting {
	public static void main(String[] args) {
		// Creating an integer array
		int[] arr = { 5, 8, 1, 0, 6, 9 };
		// Iterating array elements
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
		// Sorting array elements parallel
		Arrays.parallelSort(arr);
		System.out.println("\nArray elements after sorting");
		// Iterating array elements
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
