package com.question.zipzipmart;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Sale[] sales = {new Sale(LocalDate.of(2022, 3, 12),120000),new Sale(LocalDate.of(2021,7 , 23),120000),new Sale(LocalDate.of(2012, 9, 7),34120000),new Sale(LocalDate.of(2017, 12, 2),120043),new Sale(LocalDate.of(2022, 8, 5),7250000),new Sale(LocalDate.of(2017, 11, 3),1540000)};
		merge(sales,0,sales.length-1);
		
		//display
		for(Sale s : sales) {
			System.out.println("\nTime: "+s.date);
			System.out.println("Amount: "+s.amount);
		}
	}
	
	//merge
	public static void merge(Sale sale[], int l, int r) {
		if(l<r) {
			int mid = (l+r)/2;
			merge(sale,l,mid);
			merge(sale,mid+1,r);
			
			mergeSort(sale,l,r,mid);
		}
	}
	
	//merge array
	public static void mergeSort(Sale sale[], int l, int r, int mid) {
		int n1 = mid-l+1;
		int n2 = r-mid;
		
		Sale left[] = new Sale[n1];
		Sale right[] = new Sale[n2];
		
		System.arraycopy(sale, l, left, 0, n1);
		System.arraycopy(sale, mid, right, 0, n2);
		
		int i=0,j=0,k=l;
		
		while(i<n1 && j<n2) {
			if(left[i].amount<right[j].amount) {
				sale[k++].amount = left[i++].amount;
			}else {
				sale[k++].amount = right[j++].amount;
			}
		}
		
		while(i<n1) {
			sale[k++].amount = left[i++].amount;
		}
		
		while(j<n2) {
			sale[k++].amount = right[j++].amount;
		}
	}
}