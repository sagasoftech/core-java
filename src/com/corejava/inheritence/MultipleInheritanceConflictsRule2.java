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
interface R2InterfaceA {
	public default void m1() {
		System.out.println("m1 method of interface A");
	}
}

//Interface 2
interface R2InterfaceB extends R2InterfaceA{
	public default void m1() {
		System.out.println("m1 method of interface B");
	}
}


public class MultipleInheritanceConflictsRule2 implements R2InterfaceB {

	public static void main(String args[]) {
		MultipleInheritanceConflictsRule2 obj = new MultipleInheritanceConflictsRule2();

		/*
		 * Rule 2:
		 * Calling the method over the object created
		 * to illustrate sub-interface has higher precedence
		 */
		obj.m1();
	}
}
