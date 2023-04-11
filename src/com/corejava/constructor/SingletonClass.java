package com.corejava.constructor;

/*
 * Singleton class is a class that can have only one object (an instance of the class) at a time.
 * 
 * Example of singleton classes is Runtime class, Action Servlet, and Service Locator
 * 
 * Steps:
 * 1. A private constructor
 * 2. A static field containing its only instance
 * 3. A static factory method for obtaining the instance
 * 4. Make factory method synchronized or add synchronize block
 */
public class SingletonClass {

	static SingletonClass instance = null;
    private String info = "Initial class info";
    
	// private constructor can't be accessed outside the class
	private SingletonClass() {
		
	}
	
	// Factory method to provide the users with instances
	// Make factory method synchronized or add synchronize block
    public synchronized static SingletonClass getInstance()
    {
        if (instance == null)        
             instance = new SingletonClass();
   
        return instance;
    } 
    
    public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
}
