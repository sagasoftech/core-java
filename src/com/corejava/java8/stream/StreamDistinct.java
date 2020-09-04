package com.corejava.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The Java Stream distinct() method is a non-terminal operation that returns a
 * new Stream which will only contain the distinct elements from the original
 * stream. Any duplicates will be eliminated.
 * 
 * @author sagar.dighe
 *
 */
public class StreamDistinct {

	public static void main(String args[]) {
		List<String> stringList = new ArrayList<String>();

		stringList.add("one");
		stringList.add("two");
		stringList.add("three");
		stringList.add("one");

		Stream<String> stream = stringList.stream();

		stream.distinct().collect(Collectors.toList()).forEach(s -> System.out.println(s));

	}
}
