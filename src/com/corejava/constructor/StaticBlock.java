package com.corejava.constructor;

/*
 * Init block is always executed before any constructor, 
 * whenever a constructor is used for creating a new object.
 * 
 * If there are more than one blocks, they are executed in the order in which 
 * they are defined within the same class. 
 * 
 */
public class StaticBlock {
	
	// block to be executed before any constructor
	// and after static block
    {
        System.out.println("init block");
    }
 
    // no-arg constructor
    StaticBlock()
    {
        System.out.println("default");
    }
 
	// block to be executed before any constructor or block.
    static{
        System.out.println("static block first");
    }
    
    // constructor with one argument.
    StaticBlock(int x)
    {
        System.out.println(x);
    }
 
    static{
        System.out.println("static block second");
    }
    
    public static void main(String[] args)
    {
        // Object creation by calling no-argument
        // constructor.
        new StaticBlock();
 
        // Object creation by calling parameterized
        // constructor with one parameter.
        new StaticBlock(10);
    }
}
