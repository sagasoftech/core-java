package com.corejava.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamNonTerminalChaining {

	public static void main(String args[]) {
		List<String> lst = new ArrayList<String>();
		lst.add("Sagar");
		lst.add("Gauri");
		lst.add("Yogita");
		
		Stream<String> strm = lst.stream().map((s) -> {return s.toUpperCase();}).map(s -> s.substring(0, 2));
		System.out.println(strm.collect(Collectors.toList()));
		
	}
}
