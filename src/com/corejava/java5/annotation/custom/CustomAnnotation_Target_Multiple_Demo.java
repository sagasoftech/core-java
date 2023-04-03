package com.corejava.java5.annotation.custom;

//Creating annotation  
import java.lang.annotation.*;
import java.lang.reflect.*;

/*
 * To determine the target elements of a custom annotation, 
 * we need to label it with a @Target annotation.
 * 
 */

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@interface TargetMultipleAnnotation {
	int value();
}

/*
 * TargetMultipleAnnotation allowed at class & method level
 */
@TargetMultipleAnnotation(value = 30)
public class CustomAnnotation_Target_Multiple_Demo {
	
	//TargetMultipleAnnotation not allowed at Constructor level
	//@TargetMultipleAnnotation(value = 30)
	CustomAnnotation_Target_Multiple_Demo(){
		
	}
	
	public static void main(String args[]) throws Exception {

		CustomAnnotation_Target_Multiple_Demo demo = new CustomAnnotation_Target_Multiple_Demo();
		
		Method m = demo.getClass().getMethod("sayHello");
		System.out.println("Method is: " + m.getName());
		TargetMultipleAnnotation manno = m.getAnnotation(TargetMultipleAnnotation.class);
		System.out.println("Annotation value is: " + manno.value());
		
		m = demo.getClass().getMethod("sayBye");
		System.out.println("Method is: " + m.getName());
		manno = m.getAnnotation(TargetMultipleAnnotation.class);
		System.out.println("Annotaion value is: " + manno.value());
		
	}
	
	//Applying method annotation  
	@TargetMultipleAnnotation(value = 10)
	public void sayHello() {
		System.out.println("Hello annotation");
	}
	
	//Applying method annotation  
	@TargetMultipleAnnotation(value = 20)
	public void sayBye() {
		System.out.println("Bye annotation");
	}	
}