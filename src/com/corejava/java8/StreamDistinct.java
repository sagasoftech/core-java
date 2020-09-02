package com.corejava.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDistinct {

	public static void main(String args[]) {
		List<String> stringList = new ArrayList<String>();

		stringList.add("one");
		stringList.add("two");
		stringList.add("three");
		stringList.add("one");

		Stream<String> stream = stringList.stream();

		List<String> distinctStrings = stream
		        .distinct()
		        .collect(Collectors.toList());

		System.out.println(distinctStrings);
	}
}
