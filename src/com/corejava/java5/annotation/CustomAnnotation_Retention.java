package com.corejava.java5.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * used to specify to what level annotation will be available
 */
@Retention(RetentionPolicy.RUNTIME)  
@Target({ElementType.TYPE})  
@interface CustomAnnotation_Retention {
	int value1();

	String value2();
}


/*
RetentionPolicy	Availability
RetentionPolicy.SOURCE	refers to the source code, discarded during compilation. It will not be available in the compiled class.
RetentionPolicy.CLASS	refers to the .class file, available to java compiler but not to JVM . It is included in the class file.
RetentionPolicy.RUNTIME	refers to the runtime, available to java compiler and JVM .
*/