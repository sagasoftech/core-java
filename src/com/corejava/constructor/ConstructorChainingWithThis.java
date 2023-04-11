package com.corejava.constructor;

/*
 * Constructor chaining is the process of calling one constructor from 
 * another constructor with respect to current object. 
 * 
 * Why:
 * This process is used when we want to perform multiple tasks in a single constructor 
 * rather than creating a code for each task in a single constructor we create a separate constructor for each task
 * 
 * Can be done in two ways: 
 * Within same class: It can be done using this() keyword for constructors in the same class
 * From base class: by using super() keyword to call the constructor from the base class.
 */
public class ConstructorChainingWithThis {
    // default constructor 1
    // default constructor will call another constructor
    // using this keyword from same class
	ConstructorChainingWithThis()
    {
        // calls constructor 2
        this(5);
        System.out.println("The Default constructor");
    }
 
    // parameterized constructor 2
	ConstructorChainingWithThis(int x)
    {
        // calls constructor 3
        this(5, 15);
        System.out.println(x);
    }
 
    // parameterized constructor 3
	ConstructorChainingWithThis(int x, int y)
    {
		/*
		 * There should be at-least be one constructor without the this() keyword
		 * so that object will be returned by breaking chain
		 * 
		 */
        System.out.println(x * y);
    }
 
    public static void main(String args[])
    {
        // invokes default constructor first
        new ConstructorChainingWithThis();
    }
}
