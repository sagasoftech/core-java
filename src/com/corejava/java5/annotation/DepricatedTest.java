package com.corejava.java5.annotation;

class Airplane {
	void laungeFood() {
		System.out.println("Use airport launge for food");
	}

	/*
	 * Deprecated annotation tells other developers that 
	 * the marked element should no longer be used.
	 * 
	 */
	
	/**
	 * 
	 * @deprecated
     * This method is no longer acceptable.
     * <p> Use {@link Airplane#laungeFood()} instead.
	 */
	@Deprecated
	void outsideFood() {
		System.out.println("No more outside food");
	}
	
	/*
	 * Java 9 adds some optional attributes to the @Deprecated annotation: since and forRemoval.
	 * since attribute requires a string that lets us define in which version the element was deprecated.
	 * forRemoval is a boolean that allows us to specify if the element will be removed in the next release.
	 * 
	 */
    @Deprecated(since = "4.5", forRemoval = true)
    public void calculateFoodExpenses() {
    	System.out.println("Calculate food expenses");
    }
}

public class DepricatedTest {
	public static void main(String args[]) {
		Airplane a = new Airplane();
		a.outsideFood();
	}
	
}
