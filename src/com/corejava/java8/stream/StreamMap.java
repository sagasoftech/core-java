package com.corejava.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The Java Stream map() method converts (maps) an element to another object.
 * For instance, if you had a list of strings it could convert each string to
 * lowercase, uppercase, or to a substring of the original string, or something
 * completely else.
 * 
 * @author sagar.dighe
 *
 */
public class StreamMap {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sagar", "Gauri", "Yogita");
		
		Stream<String> lowerNames = names.stream().map(s -> s.toLowerCase());
		
		System.out.println(lowerNames.collect(Collectors.toList()));
	}

}
