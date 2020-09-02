package com.corejava.miscellaneous;

/*
 * Many a times for logging purpose we require the name of current execution method. This can be achieved in following ways
 * 
 * Java.lang.Class.getEnclosingMethod()- The java.lang.Class.getEnclosingMethod() returns a Method object representing the immediately enclosing method of the underlying class.
 * StackTraceElement.getMethodName()-The java.lang.StackTraceElement.getMethodName() method returns the name of the method containing the execution point represented by this stack trace element.
 * Thread.currentThread().getStackTrace()- Call Thread.currentThread().getStackTrace(). The second element, [1], is the your method call getStackTrace(); [0] is getStackTrace(). Then call its getMethodName() method to get the name of your method.
 */
public class TestGetMethodName {

	public static void main(String args[]) {
		getMethodNameUsingClassInstance();
		getMethodNameUsingStackTraceElement();
		getMethodNameUsingCurrentThread();
	}

//Get method name using Java.lang.Class.getEnclosingMethod()
	public static void getMethodNameUsingClassInstance() {
		String methodNameUsingClassInstance = new TestGetMethodName() {
		}.getClass().getEnclosingMethod().getName();
		System.out.println("Current Method Execution Name Using Class Instance - " + methodNameUsingClassInstance);
	}

//Get method name using StackTraceElement.getMethodName()
	public static void getMethodNameUsingStackTraceElement() {
		StackTraceElement stackTraceElements[] = (new Throwable()).getStackTrace();
		System.out.println(
				"Current Method Execution Name Using StackTraceElement - " + stackTraceElements[0].getMethodName());
	}

//Get method name using Thread.currentThread().getStackTrace()
	public static void getMethodNameUsingCurrentThread() {
		System.out.println("Current Method Execution Name using Current Thread - "
				+ Thread.currentThread().getStackTrace()[1].getMethodName());
	}
}
