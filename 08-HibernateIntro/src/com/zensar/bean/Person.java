package com.zensar.bean;

public class Person {
	int id;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	String name;
	double salary;
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
//HERE in person.xml we mapped each field of this class to the field of table.