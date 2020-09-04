package com.corejava.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The Java Stream filter() can be used to filter out elements from a Java
 * Stream. The filter method takes a Predicate which is called for each element
 * in the stream.
 * 
 * @author sagar.dighe
 *
 */
public class StreamFilter {
	public static void main(String args[]) {
		List<String> lst = new ArrayList<String>();
		lst.add("Sagar");
		lst.add("Gauri");
		lst.add("Yogita");

		List<String> str =
				lst.stream().filter(s -> s.contains("r"))
						    .collect(Collectors.toList());
		System.out.println(str);
	}
}
