package com.corejava.java8.lamdaexpression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertArrayListToHashMap {

	public static void main(String[] args) {
		List<String> arrList = new ArrayList<>();
		arrList.add("One");
		arrList.add("Two");
		arrList.add("Three");
		
		Map<Integer, String> arrMap = new HashMap<>();
		
		arrList.forEach((n) -> arrMap.put(arrMap.size(), n));
		
		System.out.println(arrMap);
	}
	
}
