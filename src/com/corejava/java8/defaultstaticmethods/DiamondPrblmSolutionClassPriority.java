package com.corejava.java8.defaultstaticmethods;

/**
 * Here, implementation of show() is not required even both ClassA and InterfaceB has show() method
 * Class has more priority, so show will be called from ClassA()
 * @author sagar.dighe
 *
 */
public class DiamondPrblmSolutionClassPriority extends ClassA implements InterfaceB{

	public static void main(String[] args) {
		DiamondPrblmSolutionClassPriority obj = new DiamondPrblmSolutionClassPriority();
		obj.show();
	}
}
