package com.corejava.interviewprograms;

import java.util.List;
import java.util.Optional;

public class DoubleOfFirstEvenNumberGreaterThan {

	//Find the double of first even number greater than 3
	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 5, 4, 6, 7, 8);
		
		Optional<Integer> output = null;
		
		//Declarative style
		output = list.stream()
					 .filter(DoubleOfFirstEvenNumberGreaterThan::isGreaterThan3)
					 .filter(DoubleOfFirstEvenNumberGreaterThan::isEven)
					 .findFirst()
					 .map(num -> num * 2);
		
		System.out.println(output.get());
	}
	
	public static boolean isGreaterThan3(int num) {
		return num > 3;
	}
	
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}
}
