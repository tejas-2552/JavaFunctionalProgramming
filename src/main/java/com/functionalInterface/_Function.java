package com.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

	public static void main(String[] args) {
		// Function
		System.out.println(incrementNumber(1));
		System.out.println(incrementByOne.apply(9));
		Function<Integer, Integer> addByOneMultiplyByTen = incrementByOne.andThen(multiplyByTen);
		System.out.println(addByOneMultiplyByTen.apply(1));

		// BiFunction
		System.out.println(incrementByOneAndMultiplyBy.apply(1, 50));
	}

	public static int incrementNumber(int number) {
		return number + 1;
	}

	// Functional Interface
	static Function<Integer, Integer> incrementByOne = number -> number + 1;

	static Function<Integer, Integer> multiplyByTen = number -> number * 10;

	public static int incrementByOneAndMultiply(int number, int multiplyBy) {
		return (number + 1) * multiplyBy;
	}

	// BiFunction Interface
	static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBy = (number, numberMulBy) -> (number + 1)
			* (numberMulBy);

}
