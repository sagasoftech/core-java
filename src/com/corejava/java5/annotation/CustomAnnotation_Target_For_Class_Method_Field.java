package com.corejava.java5.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/*
 * used to specify at which type, the annotation is used
 */
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})  
@interface CustomAnnotation_Target_For_Class_Method_Field {
	int value1();

	String value2();
}


/*
Element Types	Where the annotation can be applied
TYPE	class, interface or enumeration
FIELD	fields
METHOD	methods
CONSTRUCTOR	constructors
LOCAL_VARIABLE	local variables
ANNOTATION_TYPE	annotation type
PARAMETER	parameter
*/