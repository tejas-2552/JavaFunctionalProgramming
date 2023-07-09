package com.questionAnswers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamQandA {
	// Java Program to count the characters in a string
	public static void main(String[] args) {
		String str = "ILoveJava,,,,HelloWorldZ";
		char[] charArray = str.toCharArray();
		Map<String, Long> map = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);

		// By Imperative Approch
		int counter[] = new int[256];
	
		for(int i =0;i<str.length();i++)
		{
			counter[(int)str.charAt(i)]++;
		}

		for(int i = 0;i<256;i++)
		{
			if(counter[i]!=0)
			{
				System.out.println((char) i + " --> " + counter[i]);
			}
		}
		
		// By Using hashmap 
		HashMap<Character,Integer> strMap = new HashMap<>();
		for(int i = 0;i<str.length();i++)
		{
			
			if (strMap.containsKey(str.charAt(i))) {
				Integer count = strMap.get(str.charAt(i));
				strMap.put(str.charAt(i),++count);
				
			} else {
				strMap.put(str.charAt(i), 1);
			}
		}
		System.out.println(strMap);
		for(int j = 0 ;j<5;j++)
		{
			System.out.println(j);
		}
	
	
		// Find all duplicate elements in a string
		for(Map.Entry<Character,Integer> e : strMap.entrySet())
		{
			if(e.getValue()>1)
			{
				System.out.println("Printing duplicate element : "+ e.getKey());	
			}else {
				System.out.println("Unique element : "+ e.getKey());	
			}
		}
	
		
		// Find the first not repitative character
		LinkedHashMap<Character,Integer> linkedStrMap = new LinkedHashMap<>();
		for(int i = 0;i<str.length();i++)
		{
			
			if (linkedStrMap.containsKey(str.charAt(i))) {
				Integer count = linkedStrMap.get(str.charAt(i));
				linkedStrMap.put(str.charAt(i),++count);
				
			} else {
				linkedStrMap.put(str.charAt(i), 1);
			}
		}
		for(Map.Entry<Character,Integer> e : linkedStrMap.entrySet())
		{
			if(e.getValue()==1)
			{
				System.out.println("Printing first non duplicate element : "+ e.getKey());	
				break;
			}
		}
		
	}
	
	

}
