package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Stream {

	static class Person {
		private String name;
		private Gender gender;

		public Person(String name, Gender gender) {
			super();
			this.name = name;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}

	}

	enum Gender {
		MALE, FEMALE, NOT_VALID_GENDER
	}

	public static void main(String[] args) {

		List<Person> people = List.of(new Person("Tejas", Gender.MALE), new Person("Shubham", Gender.MALE),
				new Person("Ritika", Gender.FEMALE), new Person("Rajas", Gender.MALE),
				new Person("Alice", Gender.FEMALE), new Person("Alive", Gender.FEMALE),
				new Person("Alice", Gender.FEMALE), new Person("Alive", Gender.FEMALE),
				new Person("Shubham", Gender.MALE));

		List<Integer> number = List.of(2, 3, 4, 6, 9, 14, 7, 8);

		people.stream().map(person -> person.gender).collect(Collectors.toSet()).forEach(System.out::println);

		System.out.println();
		people.stream().map(person -> person.name).collect(Collectors.toList()).forEach(System.out::println);

		people.stream().map(person -> person.name).mapToInt(String::length).forEach(System.out::println);

		boolean gender = people.stream().allMatch(person -> person.gender == Gender.MALE);
		System.out.println(gender);

		java.util.stream.Stream<Integer> data = number.stream();
		System.out.println("Stream Example : ");
		number.stream().sorted().map(m -> m * 2).forEach(e -> System.out.println(e));

		System.out.println("Stream Odd number Example : ");
		// Even odd program using stream
		number.stream().filter(n -> n % 2 == 1).sorted().forEach(n -> System.out.println(n));

		System.out.println(number.stream().filter(n -> n % 2 == 1).reduce(0, (c, e) -> c + e));

		System.out.println();
		number.parallelStream().filter(n -> n % 2 == 1).forEach(n -> System.out.println(n));

		
//		data.map(m -> m * 2).forEach(e -> System.out.println(e));
		/*
		 * data.forEach(e -> { System.out.println(e); });
		 */

	}
}
