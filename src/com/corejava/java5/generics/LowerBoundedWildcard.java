package com.corejava.java5.generics;

import java.util.ArrayList;
import java.util.List;

class SuperClass {

}

class ChildClass extends SuperClass {

}

class GrandChildClass extends ChildClass {

}

/**
 * If you want a generic expression to accept all types which are “super” type
 * of a particular type OR parent class of a particular class then you will use
 * a lower bound wildcard for this purpose, using ‘super’ keyword.
 * 
 * @author sagar.dighe
 *
 */
public class LowerBoundedWildcard {

	public static void addGrandChildren(List<? super GrandChildClass> grandChildren) {
		grandChildren.add(new GrandChildClass());
		System.out.println(grandChildren);
	}

	public static void main(String[] args) {
		// List of grand children
		List<GrandChildClass> grandChildren = new ArrayList<GrandChildClass>();
		grandChildren.add(new GrandChildClass());
		addGrandChildren(grandChildren);

		// List of grand childs
		List<ChildClass> childs = new ArrayList<ChildClass>();
		childs.add(new GrandChildClass());
		addGrandChildren(childs);

		// List of grand supers
		List<SuperClass> supers = new ArrayList<SuperClass>();
		supers.add(new GrandChildClass());
		addGrandChildren(supers);
	}
}
