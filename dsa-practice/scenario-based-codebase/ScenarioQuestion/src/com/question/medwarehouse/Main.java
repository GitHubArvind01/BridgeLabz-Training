package com.question.medwarehouse;
import java.time.*;

public class Main {

	public static void main(String[] args) {
		Store store[] = {new Store("Dolo-650",LocalDate.of(2022, 11, 9)), new Store("Paracitamol",LocalDate.of(2026, 10, 19)), new Store("Pantop",LocalDate.of(2027, 1, 29)), new Store("Ornoflox",LocalDate.of(2026, 5, 13))};
		
		merge(store,0,store.length-1);
		
		//display
		for(Store s : store) {
			System.out.println("\nMedicine Name: "+s.mediName);
			System.out.println("Expiry Date: "+s.date);
		}
	}
	
	//sort
	public static void merge(Store store[], int l, int r) {
		if(l<r) {
			int mid = (l+r)/2;
			
			merge(store,l,mid);
			merge(store,mid+1,r);
			
			mergeSort(store,l,r,mid);
		}
	}
	
	public static void mergeSort(Store store[], int l, int r, int mid) {
		int n1 = mid-l+1;
		int n2 = r-mid;
		
		Store[]  left = new Store[n1];
		Store[] right = new Store[n2];
		
		System.arraycopy(store, l, left, 0, n1);
		System.arraycopy(store, mid+1, right, 0, n2);
		
		int i=0,j=0,k=l;
		
		while(i<n1 && j<n2) {
			if(right[j].date.isAfter(left[i].date)) {
				store[k++] = left[i++];
			}else {
				store[k++] = right[j++];
			}
		}
		
		while(i<n1) {
			store[k++] = left[i++];
		}
		while(j<n2) {
			store[k++] = right[j++];
		}
	}
}