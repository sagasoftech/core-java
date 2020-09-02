package com.corejava.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCount {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();

		stringList.add("One flew over the cuckoo's nest");
		stringList.add("To kill a muckingbird");
		stringList.add("Gone with the wind");
		
		long count = stringList.stream().flatMap((s) -> {
			String[] arrStr = s.split(" ");
			return (Stream<String>) Arrays.asList(arrStr).stream();
		}).count();

		System.out.println("Word count :"+count);
	}

}
