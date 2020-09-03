package com.corejava.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

	/*
	 * https://examples.javacodegeeks.com/core-java/java-8-parallel-streams-example/
	 */
	
	
	/*
	 * The Stream API enables developers to create the parallel streams that can
	 * take advantage of multi-core architectures and enhance the performance of
	 * Java code. In a parallel stream, the operations are executed in parallel and
	 * there are two ways to create a parallel stream.
	 * 
	 * Using the parallelStream() method on a collection 
	 * Using the parallel() method on a stream
	 * 
	 * 
	 */
	
	/*
	 * Do remember, Parallel Streams must be used only with stateless,
	 * non-interfering, and associative operations i.e.
	 * 
	 * A stateless operation is an operation in which the state of one element does
	 * not affect another element 
	 * 
	 * A non-interfering operation is an operation in
	 * which data source is not affected 
	 * 
	 * An associative operation is an operation in
	 * which the result is not affected by the order of operands
	 */
	
	/**
	 * When a stream executes in parallel, the Java runtime partitions the stream
	 * into multiple sub-streams. Aggregate operations iterate over and process
	 * these sub-streams in parallel and then combine the results.
	 * 
	 * @param args
	 */
	    public static void main(String[] args) {
	 
	        long t1, t2;
	        List<Employee> eList = new ArrayList<Employee>();
	        for(int i=0; i<100; i++) {
	            eList.add(new Employee("A", 20000));
	            eList.add(new Employee("B", 3000));
	            eList.add(new Employee("C", 15002));
	            eList.add(new Employee("D", 7856)); 
	            eList.add(new Employee("E", 200)); 
	            eList.add(new Employee("F", 50000));
	        }
	 
	        /***** Here We Are Creating A 'Sequential Stream' & Displaying The Result *****/
	        t1 = System.currentTimeMillis();   
	        System.out.println("Sequential Stream Count?= " + eList.stream().filter(e -> e.getSalary() > 15000).count());
	 
	        t2 = System.currentTimeMillis();
	        System.out.println("Sequential Stream Time Taken?= " + (t2-t1) + "\n");
	 
	        /***** Here We Are Creating A 'Parallel Stream' & Displaying The Result *****/
	        t1 = System.currentTimeMillis();        
	        System.out.println("Parallel Stream Count?= " + eList.parallelStream().filter(e -> e.getSalary() > 15000).count());
	 
	        t2 = System.currentTimeMillis();
	        System.out.println("Parallel Stream Time Taken?= " + (t2-t1));
	    }
}
