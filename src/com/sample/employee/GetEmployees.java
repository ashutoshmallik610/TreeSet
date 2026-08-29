package com.sample.employee;

import java.util.TreeSet;

public class GetEmployees 
{
	public TreeSet<Employee> getEmployees()
	{
		TreeSet<Employee> set = new TreeSet<Employee>();
		
		set.add(new Employee(101, "Rahul"));
		set.add(new Employee(102, "Bibek"));
		set.add(new Employee(103, "Ayush"));
		set.add(new Employee(103, "Ayush"));
		
		return set;
	}
}
