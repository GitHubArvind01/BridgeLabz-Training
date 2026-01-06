package com.searchingalgorithms.comparetimetaken;

import java.io.*;

public class Main {

	static int countWord = 0;
	static String target = "bro";
	
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
		
		System.out.println("--------------Here Time Taken During File reader-------------");
		long filereadernano_startTime = System.nanoTime();
		solveFileReader();
		long filereadernano_endTime = System.nanoTime();
		System.out.println("Time taken: "+(filereadernano_endTime-filereadernano_startTime));
		
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
	
	//file reader
	public static void solveFileReader() {
		try {
			FileReader file = new FileReader("hello.txt");
			
			//wrap file to buffer reader
			BufferedReader reader = new BufferedReader(file);
			
			System.out.println("We are going to read file 'hello.txt' line by line\n");
			String line;
			
			while((line=reader.readLine())!=null) {
				String words[] = line.split("\\s+");
				for(String word: words) {
					if(word.equals(target)) {
						countWord+=1;
					}
				}
				System.out.println(line);
			}
			
			reader.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	
		System.out.println("Count of target word: " + countWord);
	}
}
