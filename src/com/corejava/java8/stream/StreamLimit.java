package com.corejava.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * The Java Stream limit() method can limit the number of elements in a stream
 * to a number given to the limit() method as parameter. The limit() method
 * returns a new Stream which will at most contain the given number of elements.
 * 
 * @author sagar.dighe
 *
 */
public class StreamLimit {

	public static void main(String args[]) {
		List<String> stringList = new ArrayList<String>();

		stringList.add("one");
		stringList.add("two");
		stringList.add("three");
		stringList.add("one");

		Stream<String> stream = stringList.stream();
		stream.limit(2)
				// stream.limit(5) = will print all elements as limit more than size
				.forEach(System.out::println);
	}
}
