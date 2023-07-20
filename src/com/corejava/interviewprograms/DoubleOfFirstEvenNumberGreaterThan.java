package com.corejava.interviewprograms;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class DoubleOfFirstEvenNumberGreaterThan {

	//Find the double of first even number greater than 3
	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 5, 4, 6, 7, 8);
		
		Optional<Integer> output = null;
		
		//Predicate<Integer> isGreaterThan3 = num -> num > 3;
		
		Function<Integer, Predicate<Integer>> isGreaterThan = pivote -> num -> num > pivote;
		
		Predicate<Integer> isEven = num -> num % 2 == 0;
		
		//Declarative style
		output = list.stream()
					 .filter(isGreaterThan.apply(3))
					 .filter(isEven)
					 .map(num -> num * 2)
					 .findFirst();
		
		System.out.println(output.get());
	}
	
}
