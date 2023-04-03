package com.corejava.java5.annotation.custom;

//Creating annotation  
import java.lang.annotation.*;
import java.lang.reflect.*;

/*
 * To determine the target elements of a custom annotation, 
 * we need to label it with a @Target annotation.
 * 
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface TargetMethodAnnotation {
	int value();
}

//TargetMethodAnnotation not allowed at class level as Target is Method
//@TargetMethodAnnotation(value = 10)
public class CustomAnnotation_Target_Demo {
	public static void main(String args[]) throws Exception {

		CustomAnnotation_Target_Demo demo = new CustomAnnotation_Target_Demo();
		
		Method m = demo.getClass().getMethod("sayHello");
		System.out.println("Method is: " + m.getName());
		TargetMethodAnnotation manno = m.getAnnotation(TargetMethodAnnotation.class);
		System.out.println("Annotation value is: " + manno.value());
		
		m = demo.getClass().getMethod("sayBye");
		System.out.println("Method is: " + m.getName());
		manno = m.getAnnotation(TargetMethodAnnotation.class);
		System.out.println("Annotaion value is: " + manno.value());
		
	}
	
	//Applying method annotation  
	@TargetMethodAnnotation(value = 10)
	public void sayHello() {
		System.out.println("Hello annotation");
	}
	
	//Applying method annotation  
	@TargetMethodAnnotation(value = 20)
	public void sayBye() {
		System.out.println("Bye annotation");
	}	
}