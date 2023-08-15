package com.corejava.java8.lamdaexpression.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * 
 * returns negative value(-1), if and only if obj1 has to come before obj2.
 * returns positive value(+1), if and only if obj1 has to come after obj2.
 * returns zero(0), if and only if obj1 and obj2 are equal.
 * 
 */
public class ArrayListSort {

	public static void main(String[] args) {

		//Integer
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(205);
        al.add(102);
        al.add(98);
        al.add(275);
        al.add(203);
        System.out.println("Elements of the ArrayList " + "before sorting : " + al);

        // using lambda expression in place of comparator object
        Collections.sort(al, (o1, o2) -> (o1 < o2) ? -1 :
                                       (o1 > o2) ? 1 : 0);
        System.out.println("Elements of the ArrayList after" + " sorting ascending : " + al);        

        
        // using lambda expression in place of comparator object
        Collections.sort(al, (o1, o2) -> (o1 > o2) ? -1 :
                                       (o1 < o2) ? 1 : 0);
        System.out.println("Elements of the ArrayList after" + " sorting descending: " + al);
		
        
        
        
        
        
        //String
		List<String> strArr = new ArrayList<>();
		strArr.add("Mike");
		strArr.add("John");
		strArr.add("Rickey");
		strArr.add("Mickey");
		strArr.add("Spike");
		strArr.add("Bone");
		
		System.out.println("Before Sorting" +strArr);
		
		Collections.sort(strArr, (o1, o2) -> (o1.compareTo(o2)));
		System.out.println("After Sorting Ascending" +strArr);
		
		Collections.sort(strArr, (o1, o2) -> (o2.compareTo(o1)));
		System.out.println("After Sorting Descending" +strArr);
	}
}
