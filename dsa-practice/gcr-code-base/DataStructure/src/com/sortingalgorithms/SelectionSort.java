package com.sortingalgorithms;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {33,223,4,32,23,4,32,2,4,32,3422,2};
		int n = arr.length;
		
		//call method
		selection(arr,n);
		//display
		for(int i:arr) {
			System.out.print(i + " ");
		}
	}
	public static void selection(int arr[], int n) {
		for(int i=0;i<n;i++) {
			int minIdx = i;
			
			//find the minimum element index
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[minIdx]) {
					minIdx = j;
				}
			}
			
			//swap
			int temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;
		}
	}
}
