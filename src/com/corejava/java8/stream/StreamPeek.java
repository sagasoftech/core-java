package com.corejava.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The peek() method returns a new Stream which contains all the elements in the
 * original stream.
 * 
 * @author sagar.dighe
 *
 */
public class StreamPeek {

	public static void main(String[] args) {
		
		/*
		 * This method exist mainly to support debugging,
		 * where we want to see elements as they flow past 
		 * a certain point in a pipeline
		 * 
		 *  Something that ends up being processed inside peek 
		 *  might not be eligible for the terminal operation
		 */
		
		/*
		 * In below example we get to know what was the value 
		 * before passing it to map for operation
		 */
		Stream.of("one", "two", "three","four")
			  .filter(s -> s.length() > 3)
			  .peek(s -> System.out.println("Filtered Value: "+ s))
			  .map(s -> s.toUpperCase())
			  .peek(s -> System.out.println("Mapped Value: "+ s))
			  .collect(Collectors.toList());
		
	}

}
