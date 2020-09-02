package com.corejava.java5.generics;

public class GenericClass<T> {

	public T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public static void main(String args[]) {

		/************************************/
		GenericClass<String> gtc = new GenericClass<String>();
		// Below will not compile as we set class of type String
		// gtc.setObj(1);
		gtc.setObj("Sagar");
	}
}
