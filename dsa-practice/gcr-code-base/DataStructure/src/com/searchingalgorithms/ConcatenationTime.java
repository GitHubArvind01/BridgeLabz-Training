package com.searchingalgorithms;

public class ConcatenationTime {

	public static void main(String[] args) {
		String arr[] = {"Hii",", How are you?","I am doing well.","That's Good.","What is your plan for today?","Nothing Special.","And yours?","I will go to temple.","Great.","Okk. We will meet again.","Okk.","Bye."};
		
		System.out.println("--------------Here Time Taken During Concatenation of StringBuffer-------------");
		long buffernano_startTime = System.nanoTime();
		solveBuffer(arr);
		long buffernano_endTime = System.nanoTime();
		System.out.println("Time taken: "+(buffernano_endTime-buffernano_startTime));
		
		
		System.out.println("--------------Here Time Taken During Concatenation of StringBuilder-------------");
		long buildernano_startTime = System.nanoTime();
		solveBuilder(arr);
		long buildernano_endTime = System.nanoTime();
		System.out.println("Time taken: "+(buildernano_endTime-buildernano_startTime));
	}
	
	//string buffer
	public static void solveBuffer(String  arr[]) {
		StringBuffer str = new StringBuffer();
		
		for(String message:arr) {
			str.append(message);
		}
		return;
	}
	
	//string builder
	public static void solveBuilder(String arr[]) {
		StringBuilder str = new StringBuilder();
		
		for(String message:arr) {
			str.append(message);
		}
		return;
	}
}
