package com.corejava.java5.annotation;

import java.util.ArrayList;

public class SupressWarningsAnnotation {

	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		ArrayList list = new ArrayList();
		list.add("sonoo");
		list.add("vimal");
		list.add("ratan");

		// If you remove the @SuppressWarnings("unchecked") annotation, it will show
		// warning at compile time at line 10, 11, 12 because we are using non-generic collection.
		
		for (Object obj : list)
			System.out.println(obj);
	}
}
