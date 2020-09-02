package com.corejava.java5.generics;

public class GenericArray<T> {
	// this one is fine
	public T[] notYetInstantiatedArray;

	// causes compiler error; Cannot create a generic array of T
	// public T[] array = new T[5];
}