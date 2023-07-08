package com.combinatorPattern;

import java.time.LocalDate;

import com.combinatorPattern.CustomerRegistrationValidator.ValidationResult;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer("Alice", "alice@gamil.com", "+918605686225", LocalDate.of(2004, 1, 1));

		CustomerValidatorService customerValidatorService = new CustomerValidatorService();
		System.out.println(customerValidatorService.isCustomerValid(customer));

		// Using Combinator Pattern
		ValidationResult result = CustomerRegistrationValidator.isEmailValid() 
		.and(CustomerRegistrationValidator.isPhoneNoValid())
		.and(CustomerRegistrationValidator.isCustomerAdult())
		.apply(customer);

		System.out.println(result);
	}
}
