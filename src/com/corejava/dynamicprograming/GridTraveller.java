package com.corejava.dynamicprograming;

import java.util.HashMap;
import java.util.Map;

public class GridTraveller {

	public static void main(String[] args) {
		System.out.println("No of ways to travel: " + gridTraveler(2, 4));
		System.out.println("No of ways to travel (Fast): " + gridTravelerFast(18, 18));
	}
	
	/*
	 * Evaluate number of ways to travel from left top corner to right bottom corner 
	 * in grid consist of (x, y)
	 * condition: can traverse to right and bottom only
	 * 
	 * e.g. In below case x1y1 to x3y4
	 *  
	 * x1y1 x2y1 x3y1
	 * x1y2 x2y2 x3y2
	 * x1y3 x2y3 x3y3
	 * x1y4 x2y4 x3y4
	 * 
	 * 
	 * Time Complexity: O(2^x+y)
	 * Space Complexity: O(x+y)
	 */
	public static int gridTraveler(int gridX, int gridY) {
		
		if(gridX == 1 && gridY == 1) return 1;
		if(gridX == 0 || gridY == 0) return 0;
		return gridTraveler(gridX-1, gridY) + gridTraveler(gridX, gridY-1);
	}
	
	/*
	 * Time Complexity: O(x*y)
	 * Space Complexity: O(x+y)
	 */
	private static Map<String, Integer> hmGridValue = new HashMap<>();
	public static int gridTravelerFast(int gridX, int gridY) {
		String key = gridX+"-"+gridY;
		if(hmGridValue.containsKey(key)) return hmGridValue.get(key);
		
		if(gridX == 1 && gridY == 1) return 1;
		if(gridX == 0 || gridY == 0) return 0;
		
		hmGridValue.put(key, gridTravelerFast(gridX-1, gridY) + gridTravelerFast(gridX, gridY-1));
		return hmGridValue.get(key);
	}
}
