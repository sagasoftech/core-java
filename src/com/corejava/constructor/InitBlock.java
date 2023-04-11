package com.corejava.constructor;

/*
 * Init block is always executed before any constructor, 
 * whenever a constructor is used for creating a new object.
 * 
 * If there are more than one blocks, they are executed in the order in which 
 * they are defined within the same class. 
 * 
 */
public class InitBlock {
	
	// block to be executed before any constructor.
	// block to be executed first
    {
        System.out.println("init block");
    }
 
    // no-arg constructor
    InitBlock()
    {
        System.out.println("default");
    }
 
    // constructor with one argument.
    InitBlock(int x)
    {
        System.out.println(x);
    }
 
    // block to be executed after the first block
    // which has been defined above.
    {
        System.out.println("second block");
    }
    
    public static void main(String[] args)
    {
        // Object creation by calling no-argument
        // constructor.
        new InitBlock();
 
        // Object creation by calling parameterized
        // constructor with one parameter.
        new InitBlock(10);
    }
}
