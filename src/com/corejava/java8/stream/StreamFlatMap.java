package com.corejava.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * The Java Stream flatMap() methods maps a single element into multiple
 * elements. The idea is that you "flatten" each element from a complex
 * structure consisting of multiple internal elements, to a "flat" stream
 * consisting only of these internal elements.
 * 
 * @author sagar.dighe
 *
 */
public class StreamFlatMap {

	public static void main(String args[]) {
		List<String> stringList = new ArrayList<String>();

		stringList.add("One flew over the cuckoo's nest");
		stringList.add("To kill a muckingbird");
		stringList.add("Gone with the wind");

		Stream<String> stream = stringList.stream();
		/*
		 * This example finishes with a call to forEach() which is a terminal operation.
		 * This call is only there to trigger the internal iteration, and thus flat map
		 * operation. 
		 * 
		 * If no terminal operation was called on the Stream chain, nothing
		 * would have happened. No flat mapping would actually have taken place.
		 */
		stream.flatMap(value -> Arrays.asList(value.split(" ")).stream())
			  .forEach(s -> System.out.println(s));

	}
}
