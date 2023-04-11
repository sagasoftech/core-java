package com.corejava.constructor;

/*
 * This approach has serialization and thread-safety guaranteed by 
 * the enum implementation itself, which ensures internally that 
 * only the single instance is available
 * 
 * 
 * There are a few reasons why we can use an enum as a singleton in Java
 * 1. Guaranteed one instance (Cannot instantiate more than one enum even through reflection).
 * 2. Thread-safe.
 * 3. Serialization.
 */
public enum EnumSingletonClass {
    
	/*
	 * INSTANCE is a public static final field that represents the enum instance.
	 */
    INSTANCE("Initial class info"); 
 
    private String info;
 
    private EnumSingletonClass(String info) {
        this.info = info;
    }
 
    public EnumSingletonClass getInstance() {
        return INSTANCE;
    }

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
    
}


