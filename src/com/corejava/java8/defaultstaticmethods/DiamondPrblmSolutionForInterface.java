package com.corejava.java8.defaultstaticmethods;

/**
 * Here, implementation of show() is required as both InterfaceA and InterfaceB has show() method
 * 
 * @author sagar.dighe
 *
 */
public class DiamondPrblmSolutionForInterface implements InterfaceA, InterfaceB {

	public void show() {
		System.out.println("DiamondPrblmSolutionForInterface");
	}
	
	public static void main(String[] args) {
		DiamondPrblmSolutionForInterface obj = new DiamondPrblmSolutionForInterface();
		obj.show();
	}
}
