package com.corejava.java8.defaultstaticmethods;

/*
 * We can define static methods inside interface
 * 
 * However, we cannot define methods of java.lang.Object class
 */
public class StaticMethods {
	public static void main(String[] args) {
		InterfaceStatic.show();
	}
	
}

interface InterfaceStatic{
	static void show() {
		System.out.println("InterfaceStatic");
	}
	
	/*
	 * This is not allowed as it resembles Object method
	 * 
	default boolean equals(Object obj) {
		return true;
	}
	*/
}