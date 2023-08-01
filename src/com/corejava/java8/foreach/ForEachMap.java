package com.corejava.java8.foreach;

import java.util.HashMap;
import java.util.Map;

public class ForEachMap {


	public static void main(String[] args) {
		Map<Integer, String> student = new HashMap<>();
		student.put(1, "Jack");
		student.put(2, "Nick");
		student.put(3, "Mike");
		
		student.forEach((key, value) -> System.out.println(key + ":" + value));
	}
}
