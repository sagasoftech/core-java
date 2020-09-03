package com.corejava.java8.stream.lamdaexpression;

public class NoParameter {

	public static void main(String[] args) {
		
		Drawer dr = () -> {
			System.out.println("Sagar");
		};
		
		dr.draw();
		
		DrawerReturn drr = () -> "Dighe";
		System.out.println(drr.draw());
		
		DrawerReturn drr2 = () -> {return "Gauri";};
		System.out.println(drr2.draw());
	}
}

@FunctionalInterface
interface Drawer{
	public void draw();
}

@FunctionalInterface
interface DrawerReturn{
	public String draw();
}