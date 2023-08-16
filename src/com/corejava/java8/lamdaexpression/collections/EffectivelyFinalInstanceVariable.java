package com.corejava.java8.lamdaexpression.collections;

public class EffectivelyFinalInstanceVariable {

    // Custom initialization
    int data = 170;
  
    // Main driver method
    public static void main(String[] args)
    {
  
        // Creating object of this class
        // inside the main() method
    	EffectivelyFinalInstanceVariable gfg = new EffectivelyFinalInstanceVariable();
  
        // Creating object of interface
        // inside the main() method
        MyInterface intFace = () ->
        {
            System.out.println("Data : " + gfg.data);
            gfg.data += 500;
  
            System.out.println("Data : " + gfg.data);
        };
  
        intFace.myFunction();
        gfg.data += 200;
  
        System.out.println("Data : " + gfg.data);
    }
}

//Interface
interface MyInterface {

 // Method inside the interface
 void myFunction();
}
