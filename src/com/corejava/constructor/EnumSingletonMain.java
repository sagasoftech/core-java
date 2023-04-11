package com.corejava.constructor;

class EnumSingletonMain{
	
	public static void main(String[] args) {
		EnumSingletonClass enumSingleton1 = EnumSingletonClass.INSTANCE.getInstance();

		System.out.println(enumSingleton1.getInfo()); //Initial enum info

		EnumSingletonClass enumSingleton2 = EnumSingletonClass.INSTANCE.getInstance();
		enumSingleton2.setInfo("New enum info");

		System.out.println(enumSingleton1.getInfo()); // New enum info
		System.out.println(enumSingleton2.getInfo()); // New enum info
	}
}