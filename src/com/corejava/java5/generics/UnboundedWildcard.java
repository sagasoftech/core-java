package com.corejava.java5.generics;

import java.util.ArrayList;

/**
 * @author sagar.dighe
 *
 */
public class UnboundedWildcard {

	// Without any restriction on type variables

	ArrayList<?> list1 = new ArrayList<Long>();
	// or
	ArrayList<?> list2 = new ArrayList<String>();
	// or
	ArrayList<?> list3 = new ArrayList<Object>();
}
