package com.corejava.java5.annotation;

@FunctionalInterface
interface FunctionalInterfaceTest {
	int add(int a, int b);
	
	/*
	 * If we uncomment below method, compiler complains that 
	 * the interface is not a not a functional interface 
	 */
    //int div(int a, int b);
}
