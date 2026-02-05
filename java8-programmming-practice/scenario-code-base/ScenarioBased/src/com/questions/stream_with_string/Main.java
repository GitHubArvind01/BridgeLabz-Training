package com.questions.stream_with_string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		/*
		 	1.Character Frequency Count
			
			Input: "banana"
			Output: {b=1, a=3, n=2}
		 */
		
		System.out.println("1.Character Frequency Count");
		String input1 = "banana";
		
		Map<Character, Long> charfreq = input1.chars()
											.mapToObj(s->(char)s)
											.collect(Collectors.groupingBy(s->s,Collectors.counting()));
	
		
		System.out.println(charfreq);
		
		
		/*
		 	2.Word Frequency Count

			Input: "java is java and java is fast"
			Output: {java=3, is=2, and=1, fast=1}
		 */
		
		System.out.println("\n2.Word Frequency Count");
		String input2 =  "Java is java and java is fast";

		Map<String,Long> wordFreq = Arrays.stream(input2.split("\\s+")).map(String::toLowerCase)
				        	    	  	 				.collect(Collectors.groupingBy(s->s,Collectors.counting()));
		
		System.out.println(wordFreq);
		
		
		/*
		 	3.First Non-Repeating Character
			
			Input: "stress"
			Output: t
		 */
		
		System.out.println("\n3.First Non-Repeating Character");
		String input3 = "stress";
		HashSet<Character> set = new HashSet<>();
		System.out.println(
					input3.chars()
							.mapToObj(s-> (char)s)
							.filter(s->!(set.add(s))).distinct().findFirst().get()
				);
	}
}