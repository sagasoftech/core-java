package com.corejava.ComparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestMultipleFieldsSorting_Java8 {

	public static void main(String[] args) {
		List<Laptop> laps = new ArrayList<Laptop>();
		
		laps.add(new Laptop("Dell", 16, 800));
		laps.add(new Laptop("Ascer", 12, 750));
		laps.add(new Laptop("HP", 12, 750));
		laps.add(new Laptop("Apple", 8, 1200));
		laps.add(new Laptop("HP", 12, 700));
		laps.add(new Laptop("Dell", 8, 600));
		
		//Lets sort by name, ram, price using Java 8
		Comparator<Laptop> comp = Comparator.comparing(Laptop::getBrand)
        .thenComparing(Laptop::getRam)
        .thenComparingInt(Laptop::getPrice);
		
		//If we don't have accessor methods
		/*Comparator.comparing((Laptop l)->l.brand)
        .thenComparing(l->l.ram)
        .thenComparingInt(l->l.price);*/
		
		//Second parameter is needed in sort method if we want to provide Comparator
		Collections.sort(laps, comp);
		
		for(Laptop l :laps) {
			System.out.println(l);
		}
	}
}
