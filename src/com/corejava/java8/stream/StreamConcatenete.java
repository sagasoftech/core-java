package com.corejava.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The Java Stream interface contains a static method called concat() which can
 * concatenate two streams into one.
 * 
 * @author sagar.dighe
 *
 */
public class StreamConcatenete {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();

		stringList.add("One flew over the cuckoo's nest");
		stringList.add("To kill a muckingbird");
		stringList.add("Gone with the wind");

		Stream<String> stream1 = stringList.stream();

		List<String> stringList2 = new ArrayList<>();
		stringList2.add("Lord of the Rings");
		stringList2.add("Planet of the Rats");
		stringList2.add("Phantom Menace");

		Stream<String> stream2 = stringList2.stream();

		Stream.concat(stream1, stream2)
			  .collect(Collectors.toList())
			  .stream()
			  .forEach(System.out::print);

	}

}
