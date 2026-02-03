package com.questions.java8_conversionlogical;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {		
		
		/*
		 *** List → Map Conversions
			
			1.Convert List of strings to Map with string as key and length as value
			
			2.Convert List of integers to Map with number and its square
			
			3.Convert List of employees to Map with id as key and name as value
			
			4.Convert List of words to Map with word and frequency
			
			5.Convert List to Map with index as key and element as value
			
			6.Convert List of objects to Map using custom key field
			
			7.Convert List to Map and handle duplicate keys
			
			8.Convert List to Map keeping only first duplicate
			
			9.Convert List to Map keeping only last duplicate
			
			10.Convert List into Map grouped by string length
		 */
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("List → Map Conversions");
		System.out.println("-------------------------------------------------------------------------");
		
		
		System.out.println("\n1.Convert List of strings to Map with string as key and length as value");
		List<String> stringList = Arrays.asList(
				"Hello",
				"Hii",
				"How",
				"Hello",
				"This",
				"Hii"
			);
	
		Map<String,Integer> mapData = stringList.stream().collect(Collectors.toMap(s-> s, s-> s.length(), (oldVal,newVal)-> oldVal));
		for(var c : mapData.entrySet()) {
			System.out.println(c.getKey()+" - "+c.getValue());
		}
		
		
		System.out.println("\n2.Convert List of integers to Map with number and its square");
		List<Integer> integerList = Arrays.asList(
					10,
					4,
					2,
					2,
					54,
					23
				);
		
		Map<Integer,Integer> integerMap = integerList.stream().collect(Collectors.toMap(s-> s, s-> s*s, (oldVal,newVal)-> oldVal));
		for(var c : integerMap.entrySet()) {
			System.out.println(c.getKey()+" - "+c.getValue());
		}
	}
}