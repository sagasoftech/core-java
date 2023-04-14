package com.corejava.exceptions;

//A Class that represents use-defined exception

@SuppressWarnings("serial")
class MyExceptionWithParameter extends Exception {
 public MyExceptionWithParameter(String s)
 {
     // Call constructor of parent Exception
     super(s);
 }
}

//A Class that uses above MyExceptionWithParameter
public class MyExceptionWithParameterMain {
 // Driver Program
 public static void main(String args[])
 {
     try {
         // Throw an object of user defined exception
         throw new MyExceptionWithParameter("GeeksGeeks");
     }
     catch (MyExceptionWithParameter ex) {
         System.out.println("Caught");

         // Print the message from MyException object
         System.out.println(ex.getMessage());
     }
 }
}

