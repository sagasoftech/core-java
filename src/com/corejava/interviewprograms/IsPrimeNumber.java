package com.corejava.interviewprograms;

import java.util.stream.IntStream;

public class IsPrimeNumber {

	public static void main(String[] args) {
		System.out.println("Number is prime: " + isPrime(4));
	}
	
	public static Boolean isPrime(int num) {
		
		return num > 1 && 
				IntStream.range(2, num)
				.noneMatch(index -> num % index == 0);
	}
}
