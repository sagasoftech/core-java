package com.corejava.java5.generics;

import java.util.ArrayList;
import java.util.List;

public class ThingsNotAllowedInGenerics {

	/*
	 * 1. You can’t have static field of type
	 * 
	 * Reason: Cannot make a static reference to the non-static type T
	 */
	public class GenericsExample1<T> {
		// private static T member; // This is not allowed
	}

	/*
	 * 2. You can not create an instance of T
	 * 
	 * Reason: Cannot instantiate the type T
	 */
	public class GenericsExample2<T> {
		public GenericsExample2() {
			// new T();
		}
	}

	/*
	 * 3. Generics are not compatible with primitives in declarations
	 * 
	 * You can use the wrapper classes in place of primitives
	 */
	// final List<int> ids = new ArrayList<>(); //Not allowed

	final List<Integer> ids = new ArrayList<>(); // Allowed

	/*
	 * 4. You can’t create Generic exception class
	 * 
	 */
	// causes compiler error
	// The generic class GenericException may not subclass java.lang.Throwable

	// public class GenericException<T> extends Exception {}
}
