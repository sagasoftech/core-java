package com.corejava.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamPeek {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();

		stringList.add("abc");
		stringList.add("def");

		Stream<String> stream = stringList.stream();

		/*
		 * peek method does not start the internal iteration of the elements in the
		 * stream. You need to call a terminal operation for that.
		 */

		Stream<String> streamPeeked = stream.peek((value) -> {
			System.out.println("value");
		});

		/*
		 * stream.peek((value) -> { System.out.println("value"); }).forEach(s ->
		 * System.out.println("For each"));
		 */
	}

}
