package com.functionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DeclarativeApproch {

	static class Person{
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
	enum Gender{
		MALE,FEMALE
	}
	
	
	public static void main(String[] args)
	{
		List<Person> people = List.of(
				new Person("Tejas",Gender.MALE),
				new Person("Vinay",Gender.MALE),
				new Person("Rohit",Gender.MALE),
				new Person("Shubham",Gender.FEMALE),
				new Person("Ritika",Gender.FEMALE)
				);
		
		// Imperative Approach 
		List<Person> females = new ArrayList<>();
		for(Person person : people)
		{
			if(person.gender.equals(Gender.FEMALE))
			{
				females.add(person);
			}
		}
		
		System.out.println(females);
		
		
		
		// Declarative Approach
		people.stream()
			.filter(person -> Gender.FEMALE.equals(person.gender))
			.collect(Collectors.toList())
			.forEach(System.out::println);
		
		System.out.println();

		females = people.stream()
			.filter(person -> null == person.gender)
			.collect(Collectors.toList());
		
		people.stream()
		.filter(person -> Gender.FEMALE.equals(person.gender) && person!=null)
		.forEach(e -> System.out.println(e.name));
		
		// Perdicate 
		Predicate<Person> perdicate = person -> Gender.MALE.equals(person.gender);
		Predicate<Person> perdicateNullCheck = person -> person!=null;
		people.stream()
		.filter(perdicate.and(perdicateNullCheck))
		.forEach(e -> System.out.println(e.name));
	}
}
