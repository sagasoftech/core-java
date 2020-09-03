package com.corejava.java8.stream.lamdaexpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product {
	Integer id;
	String name;
	Float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class ComparableDemo {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();

		// Adding Products
		list.add(new Product(2, "HP Laptop", 25000f));
		list.add(new Product(3, "Keyboard", 300f));
		list.add(new Product(4, "Dell Mouse", 150f));
		list.add(new Product(2, "Dell Mouse", 153f));

		System.out.println("Sorting on the basis of name...");

		// implementing lambda expression
		Collections.sort(list, (p1, p2) -> {
			int compareId = p1.id.compareTo(p2.id);
			int compareName = p1.name.compareTo(p2.name);
			int comparePrice = p1.price.compareTo(p2.price);
			
			//Sort by id, name, price 
			if(compareId == 0) {
				return (compareName == 0) ? comparePrice : compareName; 
			}else {
				return compareId;
			}
		});
		for (Product p : list) {
			System.out.println(p.id + " " + p.name + " " + p.price);
		}

	}
}