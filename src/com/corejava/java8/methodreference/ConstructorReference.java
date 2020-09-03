package com.corejava.java8.methodreference;

interface Messageable {
	Message getMessage(String msg);
}

class Message {
	Message(String msg) {
		System.out.print(msg);
	}
	
	Message(){
		System.out.println("Default constructor");
	}
}

/**
 * You can refer a constructor by using the new keyword. Here, we are referring
 * constructor with the help of functional interface.
 * 
 * @author sagar.dighe
 *
 */
public class ConstructorReference {
	public static void main(String[] args) {
		
		Messageable hello = Message::new;
		hello.getMessage("Hello");
	}
}