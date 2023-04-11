package com.corejava.constructor;

/*
 * super() should be the first line of the constructor
 * 
 */
class ConstructorChainingBase {

	String name;

	// constructor 1
	ConstructorChainingBase() {
		this("");
		System.out.println("No-argument constructor of" + " base class");
	}

	// constructor 2
	ConstructorChainingBase(String name) {
		this.name = name;
		System.out.println("Calling parameterized constructor" + " of base");
	}
}

public class ConstructorChainingWithSuper extends ConstructorChainingBase {

	// constructor 3
	ConstructorChainingWithSuper() {
		System.out.println("No-argument constructor " + "of derived");
	}

	// parameterized constructor 4
	ConstructorChainingWithSuper(String name) {
		// invokes base class constructor 2
		super(name);
		System.out.println("Calling parameterized " + "constructor of derived");
	}

	public static void main(String args[]) {
		// calls parameterized constructor 4
		ConstructorChainingWithSuper obj = new ConstructorChainingWithSuper("test");

		// Calls No-argument constructor
		ConstructorChainingWithSuper obj2 = new ConstructorChainingWithSuper();
	}
}
