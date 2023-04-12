package com.corejava.inheritence;

/*
 * Conflict Resolution Rules for inherited default methods in order of precedence are as follows
 *
 * Rule 1: Classes take higher precedence than interfaces
 * Rule 2: Derived interfaces or sub-interfaces take higher precedence than the interfaces 
 * higher-up in the inheritance hierarchy
 * Rule 3:  In case of Rule 1 and Rule 2 are not able to resolve the conflict then 
 * the implementing class has to specifically override and provide a method with the same method definition.
 */

//Interface 1
interface R3InterfaceA {
	public default void m1() {
		System.out.println("m1 method of interface A");
	}
}

//Interface 2
interface R3InterfaceB {
	public default void m1() {
		System.out.println("m1 method of interface B");
	}
}


public class MultipleInheritanceConflictsRule3 implements R3InterfaceA, R3InterfaceB {

	/*
	 * Rule 3:
	 * 
	 * Overriding method to resolve conflicts
	 */
	@Override
	public void m1() {

		System.out.println("m1 method of class MultipleInheritanceConflictsRule3");
		
		/*
		 * Super keyword called over m1() method for R3InterfaceA
		 */
		R3InterfaceA.super.m1();
		
		/*
		 * Super keyword called over m1() method for R3InterfaceB
		 */
		R3InterfaceB.super.m1();
	}

	public static void main(String args[]) {
		MultipleInheritanceConflictsRule3 obj = new MultipleInheritanceConflictsRule3();

		/*
		 * Rule 3:
		 * Calling the method 'm1()' over the class object
         * in the main method()
		 */
		obj.m1();
	}
}
