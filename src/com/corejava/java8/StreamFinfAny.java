package com.corejava.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamFinfAny {

	/*
	 * The Java Stream findAny() method can find a single element from the Stream.
	 * The element found can be from anywhere in the Stream. There is no guarantee
	 * about from where in the stream the element is taken. Notice how the findAny()
	 * method returns an Optional. 
	 * 
	 * The Stream could be empty - so no element could
	 * be returned. You can check if an element was found via the Optional
	 * isPresent() method.
	 */
	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();

		stringList.add("one");
		stringList.add("two");
		stringList.add("three");
		stringList.add("one");

		Stream<String> stream = stringList.stream();

		Optional<String> anyElement = stream.findAny();

		System.out.println(anyElement.get());

	}

}
