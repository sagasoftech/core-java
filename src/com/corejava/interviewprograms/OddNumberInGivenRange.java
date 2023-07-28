package com.corejava.interviewprograms;

import java.util.List;
import java.util.stream.IntStream;

public class OddNumberInGivenRange {

	public static void main(String[] args) {
		
		int fromInt = 5;
		int toInt = 16;
		
		List<Integer> oddNumbers = findOddNumbers(fromInt, toInt);
		System.out.println("Odd numbers from " + fromInt + " to " + toInt + " : " + oddNumbers);
	}

	private static List<Integer> findOddNumbers(int fromInt, int toInt) {
		
		return IntStream.range(fromInt, toInt)
					.filter(num -> num % 2 != 0)
					.boxed()
					.toList();
	}
}
