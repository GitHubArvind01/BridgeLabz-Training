package com.searchingalgorithms;

public class ConcatenateStrings {

	public static void main(String[] args) {
		String arr[] = {"Hii",", How are you?","I am doing well.","That's Good.","What is your plan for today?","Nothing Special.","And yours?","I will go to temple.","Great.","Okk. We will meet again.","Okk.","Bye."};
		
		System.out.println("--------------Here the concatinate ouput of strigBuffer-------------");
		System.out.println(solve(arr));
	}
	//concatenate
	public static String solve(String arr[]) {
		StringBuffer str = new StringBuffer();
		
		for(String message:arr) {
			str.append(message);
		}
		return str.toString();
	}
}
