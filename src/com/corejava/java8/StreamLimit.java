package com.corejava.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamLimit {

	public static void main(String args[]) {
		List<String> stringList = new ArrayList<String>();

		stringList.add("one");
		stringList.add("two");
		stringList.add("three");
		stringList.add("one");

		/*
		 * The limit() method returns a new Stream which will at most contain the given
		 * number of elements.
		 */
		Stream<String> stream = stringList.stream();
		stream.limit(2)
				// stream.limit(5) = will print all elements as limit more than size
				.forEach(s -> System.out.println(s));
	}
}
