package com.corejava.java5.assertion;

import java.util.Scanner;

/*
 * If you use assertion, It will not run simply because assertion is disabled by default. To enable the assertion, 
 * -ea or -enableassertions switch of java must be used.
 * Compile it by: javac AssertionExample.java
 * Run it by: java -ea AssertionExample
 */
class AssertionExample {
	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter ur age ");

		int value = scanner.nextInt();
		assert value >= 18 : " Not valid";

		System.out.println("value is " + value);

		scanner.close();
	}
}
