package com.corejava.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * The Java Stream max() method is a terminal operation that returns the largest
 * element in the Stream. Which element is the largest is determined by the
 * Comparator implementation you pass to the max() method.
 * 
 * @author sagar.dighe
 *
 */
public class StreamMax {

	public static void main(String args[]) {
		List<String> stringList = new ArrayList<String>();

		stringList.add("abc");
		stringList.add("def");

		Stream<String> stream = stringList.stream();

		Optional<String> optMax = stream.max((val1, val2) -> val1.compareTo(val2));

		String maxStr = optMax.get();

		System.out.println("Max string :" + maxStr);
	}
}
