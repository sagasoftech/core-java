package com.corejava.basics;


/*
 * Declaring them as static final will help you to create a CONSTANT
 * 
 * Important points;
 * 1. Initialization of variable Mandatory
 * 2. We can initialize a final static variable at the time of declaration OR
 * 3. Initialize inside a static block
 */
public class FinalStaticVariable {

    final static int x;
    final static int y = 20;
    
    static {
    	x = 10;
    }
    public static void main(String[] args)
    {
    	
    }
    
}
