package com.combinatorPattern;

import java.time.LocalDate;

public class User {

	private String name;
	private String email;
	private String phoneNumber;
	private LocalDate dobDate;

	public User(String name, String email, String phoneNumber, LocalDate dobDate) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.dobDate = dobDate;
	}
}
