package com.corejava.java8.methodreference;

interface Talkable {
	void talk();
}

/**
 * In the following example, we are referring non-static methods. You can refer
 * methods by class object and anonymous object.
 * 
 * @author sagar.dighe
 *
 */
public class InstanceMethod {
	public void saySomething() {
		System.out.println("Hello, this is non-static method.");
	}

	public static void main(String[] args) {
		InstanceMethod methodReference = new InstanceMethod(); // Creating object
		// Referring non-static method using reference
		Talkable talkable = methodReference::saySomething;
		// Calling interface method
		talkable.talk();

		// Referring non-static method using anonymous object
		Talkable talkable2 = new InstanceMethod()::saySomething; // You can use anonymous object also
		// Calling interface method
		talkable2.talk();
	}
}