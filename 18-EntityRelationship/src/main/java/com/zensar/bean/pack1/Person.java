package com.zensar.bean.pack1;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {
	@Id
	int personId;
	
	String personNmae;
	LocalDate dateOfBirth;
	char gender;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="contact_Id", referencedColumnName="contactId")
	ContactInfo contactinfo;
	public Person(String personNmae, LocalDate dateOfBirth, char gender, ContactInfo contactinfo) {
		super();
		this.personNmae = personNmae;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.contactinfo = contactinfo;
	}
	
	public Person(int personId, String personNmae, LocalDate dateOfBirth, char gender, ContactInfo contactinfo) {
		super();
		this.personId = personId;
		this.personNmae = personNmae;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.contactinfo = contactinfo;
	}

	public Person() {
		super();
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonNmae() {
		return personNmae;
	}
	public void setPersonNmae(String personNmae) {
		this.personNmae = personNmae;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public ContactInfo getContactinfo() {
		return contactinfo;
	}
	public void setContactinfo(ContactInfo contactinfo) {
		this.contactinfo = contactinfo;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personNmae=" + personNmae + ", dateOfBirth=" + dateOfBirth
				+ ", gender=" + gender + ", contactinfo=" + contactinfo + "]";
	}
	

}
