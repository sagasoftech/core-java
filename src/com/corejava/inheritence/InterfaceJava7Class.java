package com.corejava.inheritence;

/*
 * 
 * Interface used to achieve multiple inheritances.
 * An interface can extend to another interface or interface (more than one interface)
 * 
 * Till JDK 7:
 * 
 * All the methods in an interface are public, abstract (declared with an empty body)
 * All the methods in an interface are public (declared with not empty body)
 * All fields are public, static, and final by default
 * 
 * 
 */
interface Interface7 {

	/*
	 * public, static and final
	 */
	int a = 10;

	/*
	 * public and abstract
	 */
	void display();
	
}

/*
 * Interface can extend another interface (not implement)
 */
interface Interface7Child extends Interface7 {
	
}
public class InterfaceJava7Class implements Interface7{

	@Override
	public void display() {
		System.out.println("Geek");
	}

	public static void main(String[] args) {
		InterfaceJava7Class t = new InterfaceJava7Class();
		t.display();
		System.out.println(a);
	}
}
