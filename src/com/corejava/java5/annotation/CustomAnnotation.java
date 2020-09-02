package com.corejava.java5.annotation;

@interface CustomAnnotation {

}

/*
 * The @interface element is used to declare an annotation.
 */

/*
 * Points to remember for java custom annotation signature
 * 
 * 1. Method should not have any throws clauses
 * 2. Method should return one of the following: primitive data types, String, Class, enum or array of these data types.
 * 3. Method should not have any parameter.
 * 4. We should attach @ just before interface keyword to define annotation.
 * 5. It may assign a default value to the method.
 */

/*
 * Types of Annotation
 * 1. Marker Annotation
 * 2. Single-Value Annotation
 * 3. Multi-Value Annotation
*/

/*
 * Marker Annotation
 * 
 * An annotation that has no method
 * 
 */
@interface MarkerAnnotation{}  


/*
 * Single-Value Annotation
 * 
 * Annotation that has one method
 */
@interface SingleValueAnnotation{  
int value();  
} 

/*
 * Single-Value Annotation with default value
 */
@interface SingleValueAnnotationWithDefaultValue{  
int value() default 0;  
}  

/*
 * apply Single-Value Annotation
 */
//@MyAnnotation(value=10)  


/*
 * Multi-Value Annotation
 * 
 * An annotation that has more than one method
 */
@interface MultiValueAnnotation {
	int value1();

	String value2();

	String value3();
} 

/*
 * Multi-Value Annotation with default value
 */
@interface MultiValueAnnotationWithDefaultValue {
	int value1() default 1;

	String value2() default "";

	String value3() default "xyz";
}

/*
 * apply Multi-Value Annotation
 */
//@MyAnnotation(value1=10,value2="Arun Kumar",value3="Ghaziabad") 