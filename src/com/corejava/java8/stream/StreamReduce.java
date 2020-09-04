package com.corejava.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * The Java Stream reduce() method is a terminal operation that can reduce all
 * elements in the stream to a single element.
 * 
 * @author sagar.dighe
 *
 */
public class StreamReduce {

	public static void main(String args[]) {
		List<String> stringList = new ArrayList<String>();

		stringList.add("One flew over the cuckoo's nest");
		stringList.add("To kill a muckingbird");
		stringList.add("Gone with the wind");

		Stream<String> stream = stringList.stream();

		Optional<String> optReduce = stream.reduce((value, combinedList) -> combinedList + " " + value);

		System.out.println("Reduce List :" + optReduce.get());
	}
}
