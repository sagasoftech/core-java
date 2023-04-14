package com.corejava.exceptions;

/*
 * In order to create a custom exception, we need to extend the Exception class 
 * that belongs to java.lang package
 * 
 */
@SuppressWarnings("serial")
class MyException extends Exception {
    public MyException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}
 
// A Class that uses above MyException
public class MyExceptionMain {
    // Driver Program
    public static void main(String args[])
    {
        try {
            // Throw an object of user defined exception
            throw new MyException("GeeksGeeks");
        }
        catch (MyException ex) {
            System.out.println("Caught");
 
            // Print the message from MyException object
            System.out.println(ex.getMessage());
        }
    }
}
