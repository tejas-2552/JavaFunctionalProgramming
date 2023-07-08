package com.combinatorPattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

	private boolean isValidEmail(String email)
	{
		return email.contains("@");
	}
	
	private boolean isValidPhNumber(String phNumber)
	{
		return phNumber.startsWith("+91");
	}
	
	private boolean isAdult(LocalDate date)
	{
		return Period.between(date, LocalDate.now()).getYears() > 18;
	}
	
	public boolean isCustomerValid(Customer customer)
	{
		return isValidEmail(customer.getEmail()) && isValidPhNumber(customer.getPhoneNumber())
				&& isAdult(customer.getDobDate());
	}
}
