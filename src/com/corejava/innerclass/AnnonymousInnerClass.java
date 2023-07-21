package com.corejava.innerclass;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*
 * It is an inner class without a name and for which only a single object is created.
 * 
 * Use:
 * The main use of it is to override methods of classes or interfaces.
 * 
 */
public class AnnonymousInnerClass {
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		//Prints Tiger
		animal.name();
		
		Animal animal2 = new Animal(){
			@Override
			public void name() {
				System.out.println("Lion");
			}
		};
		//Print Lion
		animal2.name();
	}

}

class Animal{
	
	public void name() {
		System.out.println("Tiger");
	}
}