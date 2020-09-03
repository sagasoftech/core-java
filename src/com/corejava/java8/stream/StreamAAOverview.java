package com.corejava.java8.stream;

public class StreamAAOverview {

	/*
	 * The features of Java stream are –
	 * 
	 * A stream is not a data structure instead it takes input from the Collections,
	 * Arrays or I/O channels.
	 * 
	 * Streams don’t change the original data structure, they only provide the
	 * result as per the pipelined methods.
	 * 
	 * Each intermediate operation is lazily executed and returns a stream as a
	 * result, hence various intermediate operations can be pipelined. Terminal
	 * operations mark the end of the stream and return the result.
	 */
	
	
	/*
	 * http://tutorials.jenkov.com/java-functional-programming/streams.html
	 */
	
	/*
	 * Non-Terminal Operations
			filter()
			map()
			flatMap()
			distinct()
			limit()
			peek()
	   Terminal Operations
			anyMatch()
			allMatch()
			noneMatch()
			collect()
			count()
			findAny()
			findFirst()
			forEach()
			min()
			max()
			reduce()
			toArray()
	 */
}
