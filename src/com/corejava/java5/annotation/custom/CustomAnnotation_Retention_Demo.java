package com.corejava.java5.annotation.custom;

//Creating annotation  
import java.lang.annotation.*;
import java.lang.reflect.*;

/*
 * We use the @Retention annotation to say where in our program's lifecycle our annotation applies
 * RetentionPolicy.SOURCE – visible by neither the compiler nor the runtime
 * RetentionPolicy.CLASS – visible by the compiler
 * RetentionPolicy.RUNTIME – visible by the compiler and the runtime
 * 
 */

@Retention(RetentionPolicy.CLASS)
@interface RetentionAnnotation {
	int value();
}

//Accessing annotation  
public class CustomAnnotation_Retention_Demo {
	public static void main(String args[]) throws Exception {

		CustomAnnotation_Retention_Demo demo = new CustomAnnotation_Retention_Demo();
		Method m = demo.getClass().getMethod("sayHello");

		RetentionAnnotation manno = m.getAnnotation(RetentionAnnotation.class);
		
		/*
		 * It will fail during runtime as RetentionPolicy=CLASS
		 */
		System.out.println("value is: " + manno.value());
		
	}
	
	@RetentionAnnotation(value = 10)
	public void sayHello() {
		System.out.println("hello annotation");
	}
}