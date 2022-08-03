package com.zensar.bean.pack1;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@Entity
@Table(name="doctors")
@NamedQueries({
	@NamedQuery(name="findAll",query="select d from Doctor d"),
	@NamedQuery(name="findById",query="select d from Doctor d where d.id=:did"),
	@NamedQuery(name="findByfees",query="select d from Doctor d where d.fees between :a and :b")
})

@NamedNativeQueries({
	@NamedNativeQuery(name="readAll",query="select*from doctors",resultClass=Doctor.class),
	@NamedNativeQuery(name="readById",query="select*from doctors where id=?",resultClass=Doctor.class),
	@NamedNativeQuery(name="readByfees",query="select*from doctors where fees between ? and ?",resultClass=Doctor.class)
})

public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	double fees;
	String gender;
	LocalDate practicingSince;
	public Doctor(int id, String name, double fees, String gender, LocalDate practicingSince) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
		this.gender = gender;
		this.practicingSince = practicingSince;
	}
	public Doctor(String name, double fees, String gender, LocalDate practicingSince) {
		super();
		this.name = name;
		this.fees = fees;
		this.gender = gender;
		this.practicingSince = practicingSince;
	}
	
	public Doctor(int id) {
		super();
		this.id = id;
	}
	public Doctor() {
		super();
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
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public LocalDate getPracticingSince() {
		return practicingSince;
	}
	public void setPracticingSince(LocalDate practicingSince) {
		this.practicingSince = practicingSince;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", fees=" + fees + ", gender=" + gender + ", practicingSince="
				+ practicingSince + "]";
	}
	

}
