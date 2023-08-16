package com.corejava.java8.lamdaexpression;

public class EffectivelyFinalLocalVariable {

    // Main driver method
    public static void main(String[] args)
    {
  
        // Custom local variable that can be captured
        int number = 10;
  
        MyFunction myLambda = (n) ->
        {
  
            // This use of number is OK It does not modify
            // num
            int value = number + n;
  
            // However, the following is illegal because it
            // attempts to modify the value of number
  
            // number++;
            return value;
        };
  
        // The following line would also cause an error,
        // because it would remove the effectively final
        // status from num. 
        //number = 9;
  
        System.out.println("EffectivelyFinalLocalVariable!");
    }
}

interface MyFunction  {

	 // Method inside the interface
	int func(int n);
}
