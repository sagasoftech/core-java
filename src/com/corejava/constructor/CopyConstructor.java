package com.corejava.constructor;

import java.util.Date;

/*
 * A copy constructor in a Java class is a constructor that creates an object 
 * using another object of the same Java class.
 * 
 * Steps:
 * 1. Declare a constructor that takes an object of the same type as a parameter
 * 2. Copy each field of the input object into the new instance
 * 
 * Copy Constructor vs. Clone:
 * 1. The copy constructor is much easier to implement. We do not need to implement the Cloneable interface and handle CloneNotSupportedException.
 * 2. The clone method returns a general Object reference. Therefore, we need to typecast it to the appropriate type.
 * 3. We can not assign a value to a final field in the clone method. However, we can do so in the copy constructor.
 */
public class CopyConstructor {

    private int id;
    private String name;
    private Date startDate;
    
    //Declare a constructor that takes an object of the same type as a parameter
    public CopyConstructor(CopyConstructor employee) {
    	
    	//copy each field of the input object into the new instance
        this.id = employee.id;
        this.name = employee.name;
        this.startDate = new Date(employee.startDate.getTime());
    	
    }
}
