package com.corejava.java5.annotation.custom;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * By default, Java doesn't document the usage of annotations in Javadocs.
 * 
 * But, we can use the @Documented annotation to change Java's default behavior.
 */

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface DucumentedAnnocation {
    int value();
}


/*
 * When we now create documentation of the class CustomAnnocation_Documented, 
 * the custom annotation used 'DucumentedAnnocation' to annotate our CustomAnnocation_Documented class 
 * will be shown in the documentation due to the use of @Documented annotation 
 * while creating it.
 * 
 */
@DucumentedAnnocation(10)
public class CustomAnnocation_Documented {

    // Main driver method
    public static void main(String[] args)
    {
 
        // Print and display statement on the console
        System.out.println("This is the main function");
    }
    
}
