package com.searchingalgorithms;
import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name dude: ");
		String name = sc.nextLine();
		
		System.out.println("Orignal String: "+name);
		System.out.println("Reverse String: "+solve(name));
		
		sc.close();
	}
	
	//reverse
	public static String solve(String str) {
		StringBuilder st = new StringBuilder();
		st.append(str);
		return st.reverse().toString();
	}
}
