package com.corejava.java5.annotation;

import java.lang.annotation.Inherited;

/*
 * By default, annotations are not inherited to subclasses. The @Inherited annotation marks the annotation to be inherited to subclasses.
 * 
 */
public class CustomAnnotation_Inherited_Demo {

	public static void main(String args[]) {
		Subclass sc = new Subclass();
	}
}

@Inherited
@interface ForEveryone {
}// Now it will be available to subclass also

class Superclass {
}

class Subclass extends Superclass {
}