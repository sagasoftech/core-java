package com.corejava.basics;

/*
 * 
 * Encapsulation - is data hiding(information hiding) 
 * Abstraction - is detailed hiding(implementation hiding)
 * 
 * Encapsulation is achieved by declaring the instance variables of a class as private, 
 * which means they can only be accessed within the class. 
 * To allow outside access to the instance variables, public methods called 
 * getters and setters are defined
 * 
 * 
 */

class Encapsulation{
    private String name;
    private int age;
 
    public String getName() { return name; }
 
    public void setName(String name) { this.name = name; }
 
    public int getAge() { return age; }
 
    public void setAge(int age) { this.age = age; }
}

public class EncapsulationDemo {
    public static void main(String[] args)
    {
    	Encapsulation obj = new Encapsulation();
        obj.setName("John");
        obj.setAge(30);
 
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}
