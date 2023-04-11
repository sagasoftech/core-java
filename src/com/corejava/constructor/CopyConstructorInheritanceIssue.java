package com.corejava.constructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Copy constructors in Java are not inheritable by subclasses. 
 * Therefore, if we try to initialize a child object from a parent class reference, 
 * we will face a casting issue when cloning it with the copy constructor.
 * 
 * We may get ClassCastException at runtime if the input object is not an instance of Manager class.
 *
 * One way to avoid casting in the copy constructor is to create a new inheritable method 
 * for both classes
 */
class Employee {
	public int id;
	public String name;
	public Date startDate;

    public Employee(Employee employee) {
        this.id = employee.id;
        this.name = employee.name;
        this.startDate = new Date(employee.startDate.getTime());
    }

	public Employee(int id, String name, Date startDate) {
        this.id = id;
        this.name = name;
        this.startDate = new Date(startDate.getTime());
	}
	
    public Employee copy() {
        return new Employee(this);
    }
}

class Manager extends Employee {
	public List<Employee> directReports;

    public Manager(Manager manager) {
        super(manager.id, manager.name, manager.startDate);
        this.directReports = manager.directReports.stream()
          .collect(Collectors.toList());
    }

	public Manager(int id, String name, Date startDate, List<Employee> directReports) {
		super(id, name, startDate);
		this.directReports = directReports.stream()
		          .collect(Collectors.toList());
	}
    
    
}

public class CopyConstructorInheritanceIssue {

	public static void main(String[] args) {
		Date today = new Date();
		List<Employee> directReports = new ArrayList<Employee>();
		
		Employee source = new Manager(1, "Baeldung Manager", today, directReports);
		//Employee clone = new Manager((Manager) source);
		
		Employee clone = source.copy();
	}
}
