package com.corejava.java8.lamdaexpression;


public class OneParameter{

	public static void main(String[] args) {
		
		//With parenthesis
		Vehicle v = (carName) -> {
			System.out.println(carName);
		};
		v.getCar("Baleno");
		
		//without parenthesis
		Vehicle v2 = carName -> {
			System.out.println(carName);
		};
		v2.getCar("Omni");
		
		//without brackets
		Vehicle v3 = carName -> System.out.println(carName);
		v3.getCar("Sonata");
	}
}

@FunctionalInterface
interface Vehicle{
	public void getCar(String name);
}