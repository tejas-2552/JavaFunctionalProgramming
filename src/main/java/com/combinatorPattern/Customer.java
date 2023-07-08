package com.combinatorPattern;

import java.time.LocalDate;

public class Customer {

	private String name;
	private String email;
	private String phoneNumber;
	private LocalDate dobDate;
	
	
	
	public Customer(String name, String email, String phoneNumber, LocalDate dobDate) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.dobDate = dobDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public LocalDate getDobDate() {
		return dobDate;
	}
	public void setDobDate(LocalDate dobDate) {
		this.dobDate = dobDate;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + ", dobDate=" + dobDate
				+ "]";
	}
}
