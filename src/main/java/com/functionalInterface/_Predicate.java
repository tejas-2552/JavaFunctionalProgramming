package com.functionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {

	public static void main(String[] args) {
		System.out.println("Without Predicate : ");
		System.out.println(isNumberValid("9234567890"));
		System.out.println(isNumberValid("9232123123"));

		System.out.println("With Predicate : ");
		System.out.println(isNumberValidPredicate.test("1898298981"));
		System.out.println(isNumberValidPredicate.test("98982989811"));
		System.out.println(isNumberValidPredicate.and(numContainsThree).test("9398298981"));

		System.out.println("Is Number valid : " + isNumberValidPredicate.test("1898298981"));
		System.out.println("Is Number valid 9398298981 and contains number 3 : "
				+ isNumberValidPredicate.and(numContainsThree).test("9398298981"));
		
		
		System.out.println("Is Number valid, starts with 9 and contains number 1 : " + isNumValidAndContainNum.test("9876543220","1"));
	}

	static Predicate<String> isNumberValidPredicate = number -> number.length() == 10 && number.startsWith("9");
	static Predicate<String> numContainsThree = number -> number.contains("3");

	static BiPredicate<String, String> isNumValidAndContainNum = (phNumber, num) -> phNumber.length() == 10
			&& phNumber.startsWith("9") && phNumber.contains(num);

	static boolean isNumberValid(String number) {
		return number.length() == 10 && number.startsWith("9") ? true : false;
	}
}
