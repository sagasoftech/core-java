package com.corejava.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * The Java Stream toArray() method is a terminal operation that starts the
 * internal iteration of the elements in the stream, and returns an array of
 * Object containing all the elements.
 * 
 * @author sagar.dighe
 *
 */
public class StreamToArray {

	public static void main(String args[]) {
		List<String> stringList = new ArrayList<String>();

		stringList.add("One flew over the cuckoo's nest");
		stringList.add("To kill a muckingbird");
		stringList.add("Gone with the wind");

		Stream<String> stream = stringList.stream();

		Object[] objects = stream.toArray();
		for (Object obj : objects) {
			System.out.println("Array :" + obj);
		}

	}
}
