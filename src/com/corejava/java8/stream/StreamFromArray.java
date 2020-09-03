package com.corejava.java8.stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFromArray {

	public static void main(String[] args) {
		Stream<String> streamOf = Stream.of("one", "two", "three");
		
		System.out.println(streamOf.collect(Collectors.toList()));
	}

}
