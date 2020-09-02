package com.corejava.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFlatMap {

	public static void main(String args[]) {
		List<String> stringList = new ArrayList<String>();

		stringList.add("One flew over the cuckoo's nest");
		stringList.add("To kill a muckingbird");
		stringList.add("Gone with the wind");

		Stream<String> stream = stringList.stream();
		/*
		 * this example finishes with a call to forEach() which is a terminal operation.
		 * This call is only there to trigger the internal iteration, and thus flat map
		 * operation. If no terminal operation was called on the Stream chain, nothing
		 * would have happened. No flat mapping would actually have taken place.
		 */
		stream.flatMap((value) -> {
			String[] arrStr = value.split(" ");
			return (Stream<String>) Arrays.asList(arrStr).stream();
		}).forEach(s -> System.out.println(s));

	}
}
