package com.corejava.java8.miscellaneous;

import java.util.stream.Collectors;  
import java.util.List;  
import java.util.ArrayList;  

/**
 * Collectors is a final class that extends Object class. It provides reduction
 * operations, such as accumulating elements into collections, summarizing
 * elements according to various criteria, etc.
 * 
 * @author sagar.dighe
 *
 */
public class CollectorsExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        List<Float> productPriceList =   
                productsList.stream()  
                            .map(x->x.price)         // fetching price  
                            .collect(Collectors.toList());  // collecting as list  
        System.out.println(productPriceList);  
    }  
}


class Product{  
    int id;  
    String name;  
    float price;  
      
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
} 