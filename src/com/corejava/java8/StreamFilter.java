package com.corejava.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilter {
	public static void main(String args[]) {
		List<String> lst = new ArrayList<String>();
		lst.add("Sagar");
		lst.add("Gauri");
		lst.add("Yogita");
		
		Stream<String> strm = lst.stream().filter(s -> s.contains("r"));
		System.out.println(strm.collect(Collectors.toList()));
		
	}
}
