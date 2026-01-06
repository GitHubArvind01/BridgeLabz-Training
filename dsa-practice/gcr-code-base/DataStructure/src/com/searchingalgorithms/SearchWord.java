package com.searchingalgorithms;

import java.util.*;

public class SearchWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of list to store the sentence: ");
		int size = sc.nextInt();
		sc.nextLine();
		
		ArrayList<String> list = new ArrayList<>();
		
		System.out.println("Enter the "+size+" sentence: ");
		for(int i=1;i<=size;i++) {
			String word = sc.nextLine();
			list.add(word);
		}
		
		System.out.println("Please Enter the word to find in sentence: ");
		String target = sc.next();
		
		//call the method
		solve(list,target);
		
		sc.close();
	}
	
	//method to find and print
	public static void solve(ArrayList<String> list, String target) {
		for(int i=0;i<list.size();i++) {
			String words[] = list.get(i).split("\\s+");
			boolean check = false;
			for(String word : words) {
				if(word.equals(target)) {
					check = true;
					break;
				}
			}
			if(check) {
				System.out.println("\n---Word found into sentence---");
				System.out.println("Here the sentence: " + list.get(i));
			}else {
				System.out.println("\n------word not found--------");
			}
		}
	}
}
