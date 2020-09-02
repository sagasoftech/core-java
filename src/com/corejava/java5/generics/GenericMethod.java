package com.corejava.java5.generics;

public class GenericMethod {

	public <T> int countAllOccurrences(T[] list, T item) {
		int count = 0;
		if (item == null) {
			for (T listItem : list)
				if (listItem == null)
					count++;
		} else {
			for (T listItem : list)
				if (item.equals(listItem))
					count++;
		}
		return count;
	}

	public static void main(String args[]) {

		/************************************/
		GenericMethod gm = new GenericMethod();
		// It will allow only same type for both parameter. Below will not work
		// int result = gm.countAllOccurrences(new String[]{"sagar", "gauri", "yogita"},
		// 1);
		int result = gm.countAllOccurrences(new String[] { "sagar", "gauri", "yogita" }, "gauri");
		System.out.println("Occurance: " + result);
	}
}
