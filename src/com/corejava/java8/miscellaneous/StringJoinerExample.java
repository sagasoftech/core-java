package com.corejava.java8.miscellaneous;

import java.util.StringJoiner; 

/**
 * Java added a new final class StringJoiner in java.util package. It is used to
 * construct a sequence of characters separated by a delimiter. Now, you can
 * create string by passing delimiters like comma(,), hyphen(-) etc. You can
 * also pass prefix and suffix to the char sequence.
 * 
 * @author sagar.dighe
 *
 */
public class StringJoinerExample {  
 public static void main(String[] args) {  
     StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter   
       
     // Adding values to StringJoiner  
     joinNames.add("Rahul");  
     joinNames.add("Raju");  
     joinNames.add("Peter");  
     joinNames.add("Raheem");  
               
     System.out.println(joinNames); 
     
     StringJoiner joinNamesDelimiter = new StringJoiner(",", "[", "]"); // passing comma(,) and square-brackets as delimiter   
     
     // Adding values to StringJoiner  
     joinNamesDelimiter.add("Rahul");  
     joinNamesDelimiter.add("Raju");  
     joinNamesDelimiter.add("Peter");  
     joinNamesDelimiter.add("Raheem");  
               
     System.out.println(joinNamesDelimiter);  
 }  
} 
