package com.corejava.basics;

/*
 * We can have private constructor in Abstract class
 * to prevent subclasses from having access.
 * 
 * Note: If no constructor added in abstract class, compiler will add default constructor
 * so that class extending will initialize it using that constructor
 * 
 * If we add constructor explicitly in abstract class, it should be visible to subclass or
 * should have other overloaded constructor visible and called from subclass constructor  otherwise
 * compiler will show below message
 * 
 * Implicit super constructor CounterAbstract() is not visible for default constructor. 
 * Must define an explicit constructor
 * 
 */
abstract class CounterAbstract {

    int value;

    private CounterAbstract() {
        this.value = 0;
        System.out.println("Counter No-Arguments constructor");
    }
    
    public CounterAbstract(int value) {
        this.value = value;
        System.out.println("Parametrized Counter constructor");
    }

}

public class PrivateConstructorInAbstractClass extends CounterAbstract{
	
	public PrivateConstructorInAbstractClass() {
		/*
		 * If we do not add constructor call, class will not compile
		 */
		super(10);
	}

}
