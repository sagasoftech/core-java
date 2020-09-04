package com.corejava.java8.stream;

public class Overview {

	/*
	 * The features of Java stream are –
	 * 
	 * Stream does not store elements. It simply conveys elements from a source such
	 * as a data structure, an array, or an I/O channel, through a pipeline of
	 * computational operations.
	 * 
	 * Stream is functional in nature. Operations performed on a stream does not
	 * modify it's source.
	 * 
	 * Stream is lazy and evaluates code only when required.
	 * 
	 * The elements of a stream are only visited once during the life of a stream.
	 * Like an Iterator, a new stream must be generated to revisit the same elements
	 * of the source.
	 * 
	 * Each intermediate operation is lazily executed and returns a stream as a
	 * result, hence various intermediate operations can be pipelined. Terminal
	 * operations mark the end of the stream and return the result.
	 */

	/*
	 * http://tutorials.jenkov.com/java-functional-programming/streams.html
	 */

	/*
	 * Non-Terminal Operations:
	 * 
	 * The non-terminal stream operations of the Java Stream API are operations that
	 * transform or filter the elements in the stream. When you add a non-terminal
	 * operation to a stream, you get a new stream back as result. The new stream
	 * represents the stream of elements resulting from the original stream with the
	 * non-terminal operation applied. 
	 * It is quite common to chain the calls to non-terminal operations on a Java Stream.
	 * 
	 * filter() map() flatMap() distinct() limit() peek()
	 * 
	 * Terminal Operations:
	 * 
	 * The terminal operations of the Java Stream interface typically return a single
	 * value. Once the terminal operation is invoked on a Stream, the iteration of
	 * the Stream and any of the chained streams will get started. Once the iteration is done, the result of the terminal operation is returned.
	 * 
	 * anyMatch() allMatch() noneMatch() collect() count() findAny() findFirst()
	 * forEach() min() max() reduce() toArray()
	 */
}
