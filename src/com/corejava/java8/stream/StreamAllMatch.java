package com.corejava.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAllMatch {

	/*
	 * The Java Stream allMatch() method is a terminal operation that takes a single
	 * Predicate as parameter, starts the internal iteration of elements in the
	 * Stream, and applies the Predicate parameter to each element. If the Predicate
	 * returns true for all elements in the Stream, the allMatch() will return true.
	 * If not all elements match the Predicate, the allMatch() method returns false.
	 */
	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();

		stringList.add("One flew over the cuckoo's nest");
		stringList.add("To kill a muckingbird");
		stringList.add("Gone with the wind");

		Stream<String> strStream = stringList.stream();

		boolean allmatch = strStream.allMatch(s -> {
			return s.startsWith("One");
		});

		System.out.println("All match :" + allmatch);
	}
}
