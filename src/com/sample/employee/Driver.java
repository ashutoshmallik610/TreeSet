package com.sample.employee;

import java.util.TreeSet;

public class Driver {

	public static void main(String[] args) {


		GetEmployees employees = new GetEmployees();
		
		TreeSet<Employee> emps = employees.getEmployees();
		
		for(Employee e : emps)
		{
			e.display();
		}

	}

}
