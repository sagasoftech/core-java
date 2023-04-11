package com.corejava.constructor;

public class SingletonMain {
	public static void main(String[] args) {
		SingletonClass enumSingleton1 = SingletonClass.getInstance();

		System.out.println(enumSingleton1.getInfo()); //Initial enum info

		SingletonClass enumSingleton2 = SingletonClass.getInstance();
		enumSingleton2.setInfo("New enum info");

		System.out.println(enumSingleton1.getInfo()); // New enum info
		System.out.println(enumSingleton2.getInfo()); // New enum info
	}
}
