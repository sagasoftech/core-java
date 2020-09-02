package com.corejava.ComparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestMultipleFieldsSorting {

	public static void main(String[] args) {
		List<Laptop> laps = new ArrayList<Laptop>();
		
		laps.add(new Laptop("Dell", 16, 800));
		laps.add(new Laptop("Ascer", 12, 750));
		laps.add(new Laptop("HP", 12, 750));
		laps.add(new Laptop("Apple", 8, 1200));
		laps.add(new Laptop("HP", 12, 700));
		laps.add(new Laptop("Dell", 8, 600));
		
		//Lets sort by name, ram, price
		Comparator<Laptop> comp = new Comparator<Laptop>() {
			public int compare(Laptop l1, Laptop l2) {
				int brandCompare = l1.getBrand().compareTo(l2.getBrand());
				int ramCompare = Integer.valueOf(l1.getRam()).compareTo(l2.getRam());
				int priceCompare = Integer.valueOf(l1.getPrice()).compareTo(l2.getPrice());
				
				if(brandCompare == 0)
					return (ramCompare == 0) ? priceCompare : ramCompare;
				else
					return brandCompare;
			}
		};
		
		//Second parameter is needed in sort method if we want to provide Comparator
		Collections.sort(laps, comp);
		
		for(Laptop l :laps) {
			System.out.println(l);
		}
	}
}
