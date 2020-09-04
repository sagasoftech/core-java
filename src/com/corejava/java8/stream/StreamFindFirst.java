package com.corejava.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * The Java Stream findFirst() method finds the first element in the Stream, if
 * any elements are present in the Stream. The findFirst() method returns an
 * Optional from which you can obtain the element, if present.
 * 
 * @author sagar.dighe
 *
 */
public class StreamFindFirst {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();

		stringList.add("one");
		stringList.add("two");
		stringList.add("three");
		stringList.add("one");

		Stream<String> stream = stringList.stream();

		Optional<String> result = stream.findFirst();

		System.out.println(result.get());
	}
}
