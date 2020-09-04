package com.corejava.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * The Java Stream min() method is a terminal operation that returns the
 * smallest element in the Stream. Which element is the smallest is determined
 * by the Comparator implementation you pass to the min() method.
 * 
 * @author sagar.dighe
 *
 */
public class StreamMin {

	public static void main(String args[]) {
		List<String> stringList = new ArrayList<String>();

		stringList.add("abc");
		stringList.add("def");

		Stream<String> stream = stringList.stream();

		//Comparator has been passed to min method
		Optional<String> optMin = stream.min((val1, val2) -> val1.compareTo(val2));

		String minStr = optMin.get();

		System.out.println("Min String :" + minStr);

	}
}
