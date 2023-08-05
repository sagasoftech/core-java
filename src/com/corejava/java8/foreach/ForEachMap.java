package com.corejava.java8.foreach;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ForEachMap {


	public static void main(String[] args) {
		Map<Integer, String> student = new HashMap<>();
		student.put(1, "Jack");
		student.put(2, "Nick");
		student.put(3, "Mike");
		
		System.out.println("forEach:");
		student.forEach((key, value) -> System.out.println(key + ":" + value));
		
		System.out.println("Stream API KeySet:");
		student.keySet().stream().forEach(k -> System.out.println(k + ":" + student.get(k)));
		System.out.println("Stream API Vlues:");
		student.values().stream().forEach(System.out::println);
		
		System.out.println("MapEntry:");
	    for(Entry<Integer, String> entry: student.entrySet()) {
	    	System.out.println(entry.getKey() + ":" + entry.getValue());
	    }
	    
	    System.out.println("keySet:");
	    for(Integer key: student.keySet()) {
	    	System.out.println(key + ":" + student.get(key));
	    }
	    
		System.out.println("Using values: ");
	    for(String value: student.values()) {
	    	System.out.println("Value :" + value);
	    }
	    
	    System.out.println("Iterator EntrySet: ");
	    Iterator<Entry<Integer,String>> itr = student.entrySet().iterator();
	    while(itr.hasNext()){
	    	Entry<Integer,String> entry = itr.next();
	    	System.out.println(entry.getKey() + ":" + entry.getValue());
	    }
	    
	    System.out.println("Iterator KeySet: ");
	    Iterator<Integer> itr2 = student.keySet().iterator();
	    while(itr2.hasNext()){
	    	Integer key = itr2.next();
	    	System.out.println(key + ":" + student.get(key));
	    }	    
	}
}
