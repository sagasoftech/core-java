package com.corejava.java5.generics;

public class GenericInterfaceDemo implements GenericInterface<String, Integer> {

	/**
	 * This method is bounded to input parameter of type String and return Integer
	 */
	@Override
	public Integer doSomeOperation(String t) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * This method is bounded to input parameter of type Integer and return String
	 */
	@Override
	public String doReverseOperation(Integer t) {
		// TODO Auto-generated method stub
		return null;
	}

}
