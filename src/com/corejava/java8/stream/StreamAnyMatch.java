package com.corejava.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAnyMatch {

	/*
	 * The Java Stream anyMatch() method is a terminal operation that takes a single
	 * Predicate as parameter, starts the internal iteration of the Stream, and
	 * applies the Predicate parameter to each element.
	 * 
	 * If the Predicate returns true for any of the elements, the anyMatch() method
	 * returns true. If no elements match the Predicate, anyMatch() will return
	 * false.
	 */
	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();

		stringList.add("One flew over the cuckoo's nest");
		stringList.add("To kill a muckingbird");
		stringList.add("Gone with the wind");

		Stream<String> stream = stringList.stream();

		boolean anyMatch = stream.peek(System.out::println)
								 .anyMatch(value -> value.startsWith("To"));
		System.out.println(anyMatch);

	}

}
