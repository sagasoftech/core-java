package com.corejava.java8.stream;

import java.util.stream.*;

/**
 * You can use stream to iterate any number of times
 * 
 * @author sagar.dighe
 *
 */
public class StreamIterate {
	public static void main(String[] args) {
		Stream.iterate(1, element -> element + 1)
			  .filter(element -> element % 5 == 0)
			  .limit(5)
			  .forEach(System.out::println);
	}
}