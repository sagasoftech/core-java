package com.corejava.java8.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSorted {

	public static void main(String[] args) {
		List<Integer> sortedInt = Stream.of(5, 3, 8, 7, 1)
			  .sorted()
			  .collect(Collectors.toList());
		System.out.println(sortedInt);
	}
}