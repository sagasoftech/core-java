package com.corejava.java8;

public class Employee {

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	String name = "";
	int salary = 0;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
