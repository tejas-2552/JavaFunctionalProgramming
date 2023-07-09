package com.combinatorPattern;

import java.time.LocalDate;
import java.util.function.Consumer;

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
		
		// Consumner interface callback method impl
		checkForNameWithConsumerInterface("tejas",null,value -> System.out.println("Only fName provided : " + value));
		
		// Runnable interface callback method 
		checkForName("tejas",null,() -> {System.out.println("Last Name is missing");});
	}
	
	static void checkForNameWithConsumerInterface(String fName,String lName,Consumer<String> callback)
	{
		System.out.println(fName + " " +lName);
		if(lName == null)
		{
			callback.accept(fName);
		}
	}
	
	
	static void checkForName(String fName,String lName,Runnable callback)
	{
		System.out.println(fName + " " +lName);
		if(lName == null)
		{
			callback.run();
		}
	}
}
