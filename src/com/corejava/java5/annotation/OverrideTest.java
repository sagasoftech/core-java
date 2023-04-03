package com.corejava.java5.annotation;

class Animal {
	void eatSomething() {
		System.out.println("eating something");
	}
}

/**
 * 
 * @author sagar
 *
 */
class Dog extends Animal {
	
	/*
	 * We can use the @Override annotation on inherited methods 
	 * to protect us from this mistake.
	 */
	
	@Override
	//void eatsomething(){System.out.println("eating foods");}//should be eatSomething
	void eatSomething() {
		System.out.println("eating foods");
	}
}

public class OverrideTest {

	public static void main(String args[]) {
		Animal a = new Dog();
		a.eatSomething();
	}
}
