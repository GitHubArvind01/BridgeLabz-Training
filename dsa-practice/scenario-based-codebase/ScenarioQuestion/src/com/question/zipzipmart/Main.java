package com.question.zipzipmart;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Sale[] sales = {new Sale(LocalDate.of(2022, 3, 12),12000),new Sale(LocalDate.of(2021,7 , 23),1400),new Sale(LocalDate.of(2012, 9, 7),34100),new Sale(LocalDate.of(2017, 12, 2),130043),new Sale(LocalDate.of(2022, 8, 5),750000),new Sale(LocalDate.of(2017, 11, 3),14000)};
		
	
		Sale reslut[] = merge(sales,0,sales.length-1);
		
		//display
		for(Sale s : reslut) {
			System.out.println("\nTime: "+s.date);
			System.out.println("Amount: "+s.amount);
		}
	}
	
	//merge
	public static Sale[] merge(Sale sale[], int l, int r) {
		if(l>=r) {
			return new Sale[] {sale[r]};
		}
		int mid = (l+r)/2;
		Sale left[] = merge(sale,l,mid);
		Sale right[] = merge(sale,mid+1,r);
		
		return mergeSort(left,right);
	}
	
	//merge array
	public static Sale[] mergeSort(Sale left[],Sale right[]) {
		int n1 = left.length;
		int n2 = right.length;
		
		Sale result[] = new Sale[n1+n2];

		int i=0,j=0,k=0;
		
		while(i<n1 && j<n2) {
			if(left[i].amount<=right[j].amount) {
				result[k++] = left[i++];
			}else {
				result[k++] = right[j++];
			}
		}
		
		while(i<n1) {
			result[k++] = left[i++];
		}
		
		while(j<n2) {
			result[k++] = right[j++];
		}
		return result;
	}
}