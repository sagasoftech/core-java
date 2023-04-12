package com.corejava.basics;

/*
 * Unreachable statements in Java refers to those sets of statements 
 * that won’t get executed during the execution of the program are called Unreachable Statements.
 * 
 * 
 * Reasons:
 * Have a return statement before them
 * Have an infinite loop before them
 * Execution forcibly terminated before them
 * 
 */
public class UnreachableStatements {

	// Declaring and initializing final variable
	final int a = 14, b = 16;
	
	int c = 14, d = 16;

	void compareFinal() {

		while (a < b) {

			// First print statement
			System.out.println("Hello i am in infinite loop");
		}
		
		/*
		 * Unrechable: Compile Time
		 * 
		 * Since a & b are declared as final, JVM can’t reach that statement during the program life cycle. 
		 * So, it is giving an “unreachable statement” error.
		 * 
		 */
		//System.out.println("Unreachable statement");
	}

	
	void compareNonFinal() {

		while (c < d) {

			// First print statement
			System.out.println("Hello i am in infinite loop");
		}
		/*
		 * Unrechable: Run Time
		 * 
		 * Since c & d are declared as non final, JVM thinks that at any point in time 
		 * there is a chance that the change the value of c and d, and the last statement may be executed
		 *  
		 * So, it is not giving an “unreachable statement” error at compile time
		 * However, it can be unreachable in runtime
		 */
		System.out.println("Unreachable statement");
	}
	
	// Main driver method
	public static void main(String args[]) {

		UnreachableStatements us = new UnreachableStatements();

		us.compareFinal();
		
		us.compareNonFinal();
	}
}
