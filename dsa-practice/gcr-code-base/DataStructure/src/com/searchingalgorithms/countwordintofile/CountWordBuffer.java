package com.searchingalgorithms.countwordintofile;
import java.io.*;

public class CountWordBuffer {
	static int countWord = 0;
	static String target = "bro";
	public static void main(String[] args){
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
