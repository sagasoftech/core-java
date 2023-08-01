package com.corejava.java8.foreach;

import java.util.Arrays;
import java.util.List;

/**
 * Java provides a new method forEach() to iterate the elements. It is defined
 * in Iterable and Stream interface. It is a default method defined in the
 * Iterable interface. Collection classes which extends Iterable interface can
 * use forEach loop to iterate elements.
 * 
 * @author sagar.dighe
 *
 */
public class ForEachLoop {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);

		//values.forEach(i -> System.out.println(i));
		values.forEach(System.out::println);
	}
}
