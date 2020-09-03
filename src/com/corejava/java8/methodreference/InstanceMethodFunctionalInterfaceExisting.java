package com.corejava.java8.methodreference;

import java.util.function.BiFunction;

/**
 * In the following example, we are using BiFunction interface. It is a
 * predefined interface and contains a functional method apply(). Here, we are
 * referring add method to apply method.
 * 
 * @author sagar.dighe
 *
 */
public class InstanceMethodFunctionalInterfaceExisting {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder = new Multiplication()::multiply;
		int result = adder.apply(10, 20);
		System.out.println(result);
	}
}

class Multiplication {
	public int multiply(int a, int b) {
		return a * b;
	}
}