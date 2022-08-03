package com.zensar.bean;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Accounts")
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int accountId;
	@Column(name="A_name")
	String name;
	@Column(name="A_balance")
	double balance;
	@Column(name="A_dop")
	LocalDate dateOfOpening;
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public LocalDate getDateOfOpening() {
		return dateOfOpening;
	}
	public void setDateOfOpening(LocalDate dateOfOpening) {
		this.dateOfOpening = dateOfOpening;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", name=" + name + ", balance=" + balance + ", dateOfOpening="
				+ dateOfOpening + "]";
	}

}
