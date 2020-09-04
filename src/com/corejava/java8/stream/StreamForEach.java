package com.corejava.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * The Java Stream forEach() method is a terminal operation which starts the
 * internal iteration of the elements in the Stream
 * 
 * @author sagar.dighe
 *
 */
public class StreamForEach {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();

		stringList.add("one");
		stringList.add("two");
		stringList.add("three");
		stringList.add("one");

		Stream<String> stream = stringList.stream();

		stream.forEach(action -> System.out.println(action));
	}
}
