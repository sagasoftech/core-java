package com.corejava.basics;

import java.util.HashMap;
import java.util.Map;

/*
 * Immutable class in java means that once an object is created, we cannot change its content. 
 * 
 * In Java, all the wrapper classes (like Integer, Boolean, Byte, Short) and String class is immutable.
 * 
 * Requirements:
 * 
 * 1. class must be declared as final
 * 2. Data members in the class must be declared private
 * 3. Data members in the class must be declared as final
 * 4. A parameterized constructor should initialize all the fields performing a deep copy
 * 5. Deep Copy of objects should be performed in the getter methods to return a copy rather than returning the actual object reference
 * 
 */

/*
 * 1. class must be declared as final
 */
final class CreateImmutableClass {
	
    /*
     * 2. Data members in the class must be declared private
     * 3. Data members in the class must be declared as final
     */
    private final String name;
    private final int regNo;
    private final Map<String, String> metadata;
 
    /*
     * 4. A parameterized constructor should initialize all the fields performing a deep copy
     */
    public CreateImmutableClass(String name, int regNo,
                   Map<String, String> metadata)
    {
 
        // This keyword refers to current instance itself
        this.name = name;
        this.regNo = regNo;
 
        // Creating Map object with reference to HashMap
        // Declaring object of string type
        Map<String, String> tempMap = new HashMap<>();
 
        // Iterating using for-each loop
        for (Map.Entry<String, String> entry :
             metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
 
        this.metadata = tempMap;
    }
 
    public String getName() { return name; }
 
    public int getRegNo() { return regNo; }
   
    /*
     * Note that there should not be any setters
     */
 
    /*
     * 5. Deep Copy of objects should be performed in the getter methods to return a copy rather than returning the actual object reference
     */
    public Map<String, String> getMetadata()
    {
 
        // Creating Map with HashMap reference
        Map<String, String> tempMap = new HashMap<>();
 
        for (Map.Entry<String, String> entry :
             this.metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }
}
