package com.sample.employee;

public class Employee implements Comparable<Employee>
{
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void display()
	{
		System.out.println("Id : "+id+" Name : "+name);
	}
	
	@Override
	public int compareTo(Employee o) {

		//return this.name.compareTo(o.name);
		return Integer.compare(this.id, o.id);
	}
}
