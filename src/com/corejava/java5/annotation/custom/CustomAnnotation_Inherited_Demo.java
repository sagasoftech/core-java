package com.corejava.java5.annotation.custom;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * We can use the @Inherited annotation to make our annotation propagate 
 * from an annotated class to its subclasses.
 * 
 */

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface InheritedAnnotation {
}

@InheritedAnnotation
class ParentClass {
}

class ClildClass extends ParentClass {
}

public class CustomAnnotation_Inherited_Demo {

	public static void main(String args[]) {

		CustomAnnotation_Inherited_Demo demo = new CustomAnnotation_Inherited_Demo();
		demo.whenAnnotationInherited_thenShouldExist();
	}
	
	/*
	 * Without the @Inherited annotation to InheritedAnnotation, 
	 * below will fail with NullPointerException
	 * 
	 * After extending the BaseClass, we should see that ChildClass appears to have 
	 * the parent annotation @InheritedAnnotation at runtime
	 * 
	 */
	public void whenAnnotationInherited_thenShouldExist() {
		
		CustomAnnotation_Target_Demo demo = new CustomAnnotation_Target_Demo();
		
		ClildClass childClass = new ClildClass();
	    InheritedAnnotation annotation = childClass.getClass()
	      .getAnnotation(InheritedAnnotation.class);
	 
	    System.out.println(annotation.annotationType());
	}	
}
