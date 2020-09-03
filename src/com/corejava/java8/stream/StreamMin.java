package com.corejava.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamMin {

	public static void main(String args[]) {
		List<String> stringList = new ArrayList<String>();

		stringList.add("abc");
		stringList.add("def");
		
		Stream<String> stream = stringList.stream();
		
		Optional<String> optMin = stream.min((val1, val2) -> { return val1.compareTo(val2);});
		
		String minStr = optMin.get();
		
		System.out.println("Min String :"+minStr);
		
	}
}
