package com.questions.stream_with_string;

import java.util.Arrays;
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
												.mapToObj(c-> (char) c)
												.filter(c-> (c!=' '))
												.collect(Collectors.groupingBy(
															Function.identity(),
															LinkedHashMap::new,
															Collectors.counting()
														));
		
		System.out.println(charfreq);
		
		
		/*
		 	2.Word Frequency Count

			Input: "java is java and java is fast"
			Output: {java=3, is=2, and=1, fast=1}
		 */
		
		System.out.println("\n2.Word Frequency Count");
		String input2 =  "java is java and java is fast";
		Map<String,Long> wordFreq = Arrays.stream(input2.split("\\s+"))
											.collect(Collectors.groupingBy(
														Function.identity(),
														LinkedHashMap::new,
														Collectors.counting()
													));
		
		System.out.println(wordFreq);
	}
}