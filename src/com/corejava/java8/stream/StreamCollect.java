package com.corejava.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The Java Stream collect() method is a terminal operation that starts the
 * internal iteration of elements, and collects the elements in the stream in a
 * collection or object of some kind.
 * 
 * @author sagar.dighe
 *
 */
public class StreamCollect {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();

		stringList.add("One flew over the cuckoo's nest");
		stringList.add("To kill a muckingbird");
		stringList.add("Gone with the wind");
		
		List<String> uprStr = stringList.stream().map(p -> p.toUpperCase())
									.collect(Collectors.toList());
		System.out.println(uprStr);
	}

}
