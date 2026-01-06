package com.searchingalgorithms;

import java.util.Scanner;


public class SearchFirstNegativeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the "+size+" elements: ");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		//call the method
		int firstNumber = solve(arr);
		
		if(firstNumber!=-1) {
			System.out.println("Negative number not found!");
		}
		else {
			System.out.println("First negative numnber is: "+firstNumber);
		}
		
		sc.close();
	}
	
	//method to find first negative number
	public static int solve(int arr[]) {
		for(int num:arr) {
			if(num<0) {
				return num;
			}
		}
		return -1;
	}
}
