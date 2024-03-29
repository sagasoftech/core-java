package com.corejava.interviewprograms;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Write a Java program to print the duplicate words from a given statement
 * 
 * Read more:
 * https://javarevisited.blogspot.com/2015/07/how-to-find-duplicate-words-in-string-java.html#ixzz5vLdGBVRT
 * 
 * @author sagar.dighe
 *
 */
public class DuplicateWordsInString {
	public static void main(String[] args) {
		String test = "This sentence contains two words, one and two";
		Set<String> duplicates = duplicateWords(test);
		System.out.println("input : " + test);
		System.out.println("output : " + duplicates);
	}

	/**
	 * Method to find duplicate words in a Sentence or String 
	 * 
	 * @param input String
	 * @return Set of duplicate words
	 */
	public static Set<String> duplicateWords(String input) {
		if (input == null || input.isEmpty()) {
			return Collections.emptySet();
		}
		Set<String> duplicates = new HashSet<>();
		String[] words = input.split("\\s+");
		Set<String> set = new HashSet<>();
		for (String word : words) {
			if (!set.add(word)) {
				duplicates.add(word);
			}
		}
		return duplicates;
	}

}
