package com.corejava.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamNoneMatch {

	/*
	 * The Java Stream noneMatch() method is a terminal operation that will iterate
	 * the elements in the stream and return true or false, depending on whether no
	 * elements in the stream matches the Predicate passed to noneMatch() as
	 * parameter. The noneMatch() method will return true if no elements are matched
	 * by the Predicate, and false if one or more elements are matched.
	 */
	public static void main(String args[]) {
		List<String> stringList = new ArrayList<String>();

		stringList.add("One flew over the cuckoo's nest");
		stringList.add("To kill a muckingbird");
		stringList.add("Gone with the wind");

		Stream<String> strStream = stringList.stream();

		boolean noneMatch = strStream.noneMatch(s -> s.startsWith("One"));

		System.out.println("Strem none match :" + noneMatch);
	}

}
