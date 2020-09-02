package com.corejava.ComparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {
		List<Laptop> laps = new ArrayList<Laptop>();
		
		laps.add(new Laptop("Dell", 16, 800));
		laps.add(new Laptop("Apple", 8, 1200));
		laps.add(new Laptop("HP", 12, 700));
		
		//Comparator is used when Class we want to sort is not implementing Comparable
		//Or
		//We want to change change the sorting logic for Class
		//e.g.
		//Laptop list is getting sorted by default using Laptop RAM. However, we have sorted
		//using Price as below
		Comparator<Laptop> comp = new Comparator<Laptop>() {
			public int compare(Laptop l1, Laptop l2) {
				if(l1.getPrice() > l2.getPrice())
					return 1;
				else if(l1.getPrice() < l2.getPrice())
					return -1;
				else
					return 0;
			}
		};
		
		//Second parameter is needed in sort method if we want to provide Comparator
		Collections.sort(laps, comp);
		
		for(Laptop l :laps) {
			System.out.println(l);
		}
	}
}
