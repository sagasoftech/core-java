package com.corejava.inheritence;

/*
 * 
 * JDK 8:
 * 
 * We can now add default implementation for interface methods
 * We can define static methods in interfaces
 * 
 */
interface Interface8 {

	/*
	 * public default method since JDK 8
	 */
    default void defaultMethod()
    {
        System.out.println("Default Method");
    }
    
    /*
     * public static method since JDK 8
     */
    static void staticMethod()
    {
        System.out.println("Static Method");
    }
}

public class InterfaceJava8Class implements Interface8{


	public static void main(String[] args) {
		InterfaceJava8Class t = new InterfaceJava8Class();
		
		/*
		 * Call default method
		 */
		t.defaultMethod();
		
		/*
		 * Can call without instance
		 */
		Interface8.staticMethod();
		
	}
}
