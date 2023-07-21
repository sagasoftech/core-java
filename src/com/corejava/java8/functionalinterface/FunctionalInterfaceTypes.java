package com.corejava.java8.functionalinterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceTypes {
	
	/*
	 * Types:
	 * 
	 * 1. Predicate - boolean Result
	 * 2. Consumer - no result, used to modify data
	 * 3. Function - input and output
	 * 4. Supplier - no input only supply
	 */
	
	public static void main(String[] args) {
		
		/*
		 * By using the Consumer interface the lambda expression provides optimized code. 
		 * In Java 8, Streams have filter that expects a Predicate as input 
		 */
		Predicate<String> checkLength = str -> str.length() > 5;
		System.out.println(checkLength.test("abcdefg"));
		
		
		/*
		 * By using the Consumer interface the lambda expression provides optimized code. 
		 * You can perform any operation on the object without returning the values. 
		 * In Java 8, Streams have forEach loop that expects a Consumer as input 
		 * so that it can perform the operation on it.
		 */
		Person p = new Person();
		Consumer<Person> setName = n -> n.setName("Play Java");
		setName.accept(p);
		System.out.println(p.getName());
		
		
		/*
		 * By using the Function interface the lambda expression provides optimized code. 
		 * In Java 8, Streams have map that expects a Function as input 
		 */
		Function<Integer, String> getInt = t -> t*10 +" data multiplied by 10";
		System.out.println(getInt.apply(2));
		
		
		/*
		 * By using the Function interface the lambda expression provides optimized code. 
		 * In Java 8, Streams have collect that expects a Supplier as input 
		 */		
		Supplier<Double> getRandomDouble = () -> Math.random();
		System.out.println(getRandomDouble.get());
		
		
	}

}

class Person{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

