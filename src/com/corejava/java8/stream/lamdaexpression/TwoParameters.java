package com.corejava.java8.stream.lamdaexpression;

public class TwoParameters {

	public static void main(String[] args) {
		//With type declaration
		Addable a1 = (int x, int y) -> {
			return x + y;
		};
		System.out.println(a1.add(1, 2));
		
		//Without type declaration
		Addable a2 = (x, y) -> {
			return x + y;
		};
		System.out.println(a2.add(3, 4));
		
		//Without return
		Addable a3 = (x, y) -> (x + y);
		System.out.println(a3.add(5, 6));
		
		//Without return and bracket
		Addable a4 = (x, y) -> x + y;
		System.out.println(a4.add(7, 8));
		
	}

	
	
	
}

@FunctionalInterface
interface Addable{  
    public int add(int a,int b);  
} 