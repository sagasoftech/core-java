package com.corejava.java5.annotation;

import java.util.ArrayList;
import java.util.List;

/*
 * we can add the @SafeVarargs annotation on final or static methods and constructors.
 * 
 */

public class SafeVarargsTest {

	public static void main(String args) {
	    List<Integer> list = new ArrayList<>();
	    list.add(100);
	    list.add(200);
	    
	    SafeVarargsTest svt = new SafeVarargsTest();
	    svt.loopThrough();
		
	}

	/*
	 * @SafeVarargs is like @SupressWarnings in that it allows us to declare that 
	 * a particular compiler warning is a false positive. Once we ensure our actions are safe, 
	 * we can add this annotation.
	 * 
	 */
	
	private void loopThrough(List<Integer> ...lists) {
		for(List<Integer> list2: lists) {
			for(Integer data: list2) {
				System.out.println(data);
			}
		}
	}
    
    
}
