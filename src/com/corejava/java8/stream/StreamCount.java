package com.corejava.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * The Java Stream count() method is a terminal operation which starts the
 * internal iteration of the elements in the Stream, and counts the elements.
 * 
 * @author sagar.dighe
 *
 */
public class StreamCount {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();

		stringList.add("One flew over the cuckoo's nest");
		stringList.add("To kill a muckingbird");
		stringList.add("Gone with the wind");
		
		long count = stringList.stream().flatMap(s -> Arrays.asList(s.split(" ")).stream())
							   			.count();

		System.out.println("Word count :"+count);
	}

}
