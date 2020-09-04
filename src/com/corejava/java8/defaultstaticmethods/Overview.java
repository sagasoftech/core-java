package com.corejava.java8.defaultstaticmethods;

public class Overview {

	/*
	 * In java 1.8, we can define static methods inside interface
	 */
	
	/*
	 * In java 1.8, we can define methods in Interface using default keyword
	 * 
	 * This is to allow method addition in existing interface without asking class 
	 * to define that method which implement that interface
	 * 
	 */
	
	/*
	 * Earlier, java was not allowing multiple inheritance
	 * 
	 * Why multiple inheritance was not allowed in Java?
	 * Reason: It creates diamond problem
	 * 
	 * What is diamond problem?
	 * Ans: In case of multiple inheritance, if implemented classes have same method then 
	 * there will be confusion on which method to call 
	 * e.g Both InterfaceA & InterfaceB has show() method and class Demo implements both 
	 * then with the instance of Demo class, it is difficult to find which show() method to call 
	 * 
	 * 
	 * Then why 1.8 supports multiple inheritance?
	 * Ans: Because in above case, it forces to Demo class to implement show()
	 * 
	 * In case when Demo class implements ClassA and InterfaceB. Both has same show() method implemented
	 * Java will not force to implement show() in Demo because class will have more power than interface
	 * In this case ClassA's show() method will be used
	 * 
	 *    
	 */
}
