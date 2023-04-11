package com.corejava.java5.annotation;

import java.util.ArrayList;

import com.corejava.java5.annotation.custom.CustomAnnocation_Documented;


public class SupressWarningsTest extends CustomAnnocation_Documented{

	// The list of warning option support by @SuppressWarnings is unchecked, deprecation, 
	//  serial, overrides, cast, divzero, empty, fallthrough, path, finally, and all.
	/**
	 * Main method
	 * 
	 * @param args Command line argument
	 */
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		ArrayList list = new ArrayList();
		list.add("sonoo");
		list.add("vimal");
		list.add("ratan");


		/*
		 * If you remove the @SuppressWarnings("unchecked") annotation, it will show
		 * warning at compile time at line 20, 21, 22 because we are using non-generic collection.
		 */
		for (Object obj : list)
			System.out.println(obj);
		
		SupressWarningsTest abc = new SupressWarningsTest();
	
	}
	
	
}


