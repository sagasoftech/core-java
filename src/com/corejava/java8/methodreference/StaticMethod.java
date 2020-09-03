package com.corejava.java8.methodreference;

public class StaticMethod {

	public static void staticSay() {
		System.out.println("From Static method");
	}
	public static void main(String[] args) {
		
		Sayable say = StaticMethod::staticSay;
		
		say.say();
	}
}


@FunctionalInterface
interface Sayable {
	void say();
}