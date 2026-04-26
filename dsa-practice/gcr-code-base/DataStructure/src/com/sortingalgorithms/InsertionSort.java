package com.sortingalgorithms;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = {33,223,4,32,23,4,32,2,4,32,3422,2};
		int n = arr.length;
		
		//call method
		insertion(arr,n);
		//display
		for(int i:arr) {
			System.out.print(i + " ");
		}
	}
	
	//method
	public static void insertion(int arr[], int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
