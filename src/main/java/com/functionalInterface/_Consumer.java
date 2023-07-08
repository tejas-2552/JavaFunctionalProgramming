package com.functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

	public static void main(String[] args) {
		// Normal Function
		greetCustomer(new Customer("Maria", "86056862255"));

		// Consumer Functional Interface
		greetCustomerConsumer.accept(new Customer("Hello", "World"));

		// BiConsumer Functional Interface
		greetCustomerBool.accept(new Customer("hello","world"),true);
	}

	// Consumer
	static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println(
			"Hello " + customer.customerName + ", thanks for registering phone no " + customer.customerPhoneNo);

	// BiConsumer
	static BiConsumer<Customer, Boolean> greetCustomerBool = (customer, bool) -> System.out
			.println("Hello " + customer.customerName + ", thanks for registering phone no "
					+ (bool == true ? "**********" : customer.customerPhoneNo));

	static void greetCustomer(Customer customer) {
		System.out.println(
				"Hello " + customer.customerName + ", thanks for registering phone no " + customer.customerPhoneNo);
	}

	public static class Customer {
		private String customerName;
		private String customerPhoneNo;

		Customer(String customerName, String customerPhoneNo) {
			this.customerName = customerName;
			this.customerPhoneNo = customerPhoneNo;
		}
	}
}
