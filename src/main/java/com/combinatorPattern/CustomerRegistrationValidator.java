package com.combinatorPattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;
import com.combinatorPattern.CustomerRegistrationValidator.*;

public interface CustomerRegistrationValidator extends Function<Customer, ValidationResult> {

	static CustomerRegistrationValidator isEmailValid() {
		return customer -> customer.getEmail().contains("@") ? ValidationResult.SUCCESS
				: ValidationResult.EMAIL_INVALID;
	}

	static CustomerRegistrationValidator isPhoneNoValid() {
		return customer -> customer.getPhoneNumber().contains("+91") ? ValidationResult.SUCCESS
				: ValidationResult.PHONE_NO_INVALID;
	}

	static CustomerRegistrationValidator isCustomerAdult() {
		return customer -> Period.between(customer.getDobDate(), LocalDate.now()).getYears() > 18
				? ValidationResult.SUCCESS
				: ValidationResult.IS_NOT_ADULT;
	}

	default CustomerRegistrationValidator and(CustomerRegistrationValidator other) {
		return customer -> {
			ValidationResult result = this.apply(customer);
			return result.equals(ValidationResult.SUCCESS) ? other.apply(customer) : result;
		};
	}

	enum ValidationResult {
		SUCCESS, FAILED, PHONE_NO_INVALID, EMAIL_INVALID, IS_NOT_ADULT
	}

}
