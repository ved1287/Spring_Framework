package com.zensar.bean;

public class Student {
	int rollNumber;
	String name;
	int rating;
	
	
	
	public Student(int rollNumber, String name, int rating) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.rating = rating;
	}
	
	
	
	public Student() {
		super();
	}



	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}



	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", rating=" + rating + "]";
	}
	
	

}
