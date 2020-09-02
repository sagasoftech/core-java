package com.corejava.java5.generics;

public class GenericConstructor<T> {

	private T length;
	private T width;
	private T height;

	// Generic constructor
	public GenericConstructor(T length, T width, T height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public static void main(String args[]) {

		/************************************/
		// All attributes of a single type only allowed
		// GenericConstructor<Integer> gc = new GenericConstructor<Integer>(10, 20,
		// "30");
		GenericConstructor<Integer> gc = new GenericConstructor<Integer>(10, 20, 30);
	}
}
