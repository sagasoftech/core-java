package com.corejava.inheritence;

/*
 * JDK 9:
 * 
 * Private methods: will improve code re-usability inside interfaces and will provide 
 * choice to expose only our intended methods implementations.
 * These methods are only accessible within that interface only.
 * 
 * Private Static methods: 
 * 
 */
interface Interface9 {

	public abstract void mul(int a, int b);

	public default void add(int a, int b) {
		
		/*
		 * private method inside default method
		 */
		sub(a, b);

		/*
		 * static method inside other non-static method
		 */
		div(a, b);
		
		System.out.print("Answer by Default method = ");
		System.out.println(a + b);
	}

	public static void mod(int a, int b) {
		/*
		 * static method inside other static method
		 */
		div(a, b);
		System.out.print("Answer by Static method = ");
		System.out.println(a % b);
	}

	private void sub(int a, int b) {
		System.out.print("Answer by Private method = ");
		System.out.println(a - b);
	}

	private static void div(int a, int b) {
		System.out.print("Answer by Private static method = ");
		System.out.println(a / b);
	}
}

public class InterfaceJava9Class implements Interface9 {

	@Override
	public void mul(int a, int b) {
		System.out.print("Answer by Abstract method = ");
		System.out.println(a * b);
	}

	public static void main(String[] args) {
		InterfaceJava9Class in = new InterfaceJava9Class();
		in.mul(2, 3);
		in.add(6, 2);
		
		/*
		 * Private static method access using interface itself
		 */
		Interface9.mod(5, 3);
		
		/*
		 * Below will not work as private method
		 */
		//InterfaceJava9Class.mod(5, 3);
	}
}
