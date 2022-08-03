package com.zensar.bean;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	int id=148;
	String name="ved";
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	

}
