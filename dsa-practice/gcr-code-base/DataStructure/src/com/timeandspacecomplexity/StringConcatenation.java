package com.timeandspacecomplexity;

public class StringConcatenation {

	public static void main(String[] args) {
		
		int n = 1000;
		
		String s1 = "Hello";
		
		long start_manuallyConcatenation_time = System.nanoTime();
		manuallyConcatenation(s1,n);
		long end_manuallyConcatenation_time = System.nanoTime();
		System.out.println("Manullay String time taken: "+(end_manuallyConcatenation_time-start_manuallyConcatenation_time));
		
		
		long start_stringbuilderConcatenation_time = System.nanoTime();
		stringbuilderConcatenation(s1,n);
		long end_stringbuilderConcatenation_time = System.nanoTime();
		System.out.println("String Builder time taken	: "+(end_stringbuilderConcatenation_time-start_stringbuilderConcatenation_time));
		
		long start_stringbufferConcatenation_time = System.nanoTime();
		stringbufferConcatenation(s1,n);
		long end_stringbufferConcatenation_time = System.nanoTime();
		System.out.println("String Buffer Time taken: "+(end_stringbufferConcatenation_time-start_stringbufferConcatenation_time));
	}
	
	public static void manuallyConcatenation(String s1, int n) {
		String newStr = "";
		while(n>0) {
			newStr+=s1;
			n-=1;
		}		
	}
	
	public static void stringbuilderConcatenation(String s1, int n) {
		StringBuilder str = new StringBuilder();
		while(n>0) {
			str.append(s1);
			n-=1;
		}		
	}
	
	public static void stringbufferConcatenation(String s1, int n) {
		StringBuffer str = new StringBuffer();
		while(n>0) {
			str.append(s1);
			n-=1;
		}		
	}
}
