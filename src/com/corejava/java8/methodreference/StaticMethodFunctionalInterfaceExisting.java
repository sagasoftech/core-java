package com.corejava.java8.methodreference;

import java.util.function.BiFunction;

class Addition {
	public static int add(int a, int b) {
		return a + b;
	}
}

/**
 * You can also use predefined functional interface to refer methods. In the
 * following example, we are using BiFunction interface and using it's apply()
 * method.
 * 
 * @author sagar.dighe
 *
 */
public class StaticMethodFunctionalInterfaceExisting {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder = Addition::add;
		int result = adder.apply(10, 20);
		System.out.println(result);
	}
}