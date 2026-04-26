package com.timeandspacecomplexity;
import java.util.*;

public class SearchTargetLargeDataset {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		
		int arr1[] = new int[n];
		for(int i=0;i<n;i++) {
			arr1[i] = n-i;
		}
		int arr2[] = new int[n];
		for(int i=0;i<n;i++) {
			arr2[i] = i+1;
		}
		
		
		
		//this method call for linear search
		long start_linear_time = System.nanoTime();
		linearSearch(arr1,1);
		long end_linear_time = System.nanoTime();
		
		System.out.println("Linear Serach time taken: "+(end_linear_time-start_linear_time));
		
		
		//binary search
		long start_binary_time = System.nanoTime();
		binarySearch(arr2,n-1);
		long end_binary_time = System.nanoTime();
		
		System.out.println("Binary Search time taken: "+(end_binary_time-start_binary_time));
	}
	
	//linear search
	public static void linearSearch(int arr[], int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == target) {
				return;
			}
		}
	}
	
	//binary search
	public static void binarySearch(int arr[], int target) {
		int i=0,j=arr.length-1;
		
		while(i<j) {
			int mid = i+(j-i)/2;
			if(arr[mid]==target) {
				return;
			}
			else if(arr[mid]>target) {
				j = mid-1;
			}
			else {
				i = mid+1;
			}
		}
	}
}
