package com.question.foodfest;

public class Main {

	public static void main(String[] args) {
		 Stall stall[] = {new Stall("Food",43), new Stall("General",400), new Stall("Music",13), new Stall("Electronics",143), new Stall("Skin Care",1243)};
		 
		 merge(stall,0,stall.length-1);
		 
		 //display
		 for(Stall s: stall) {
			 System.out.println("\nStall Name: "+s.stallName);
			 System.out.println("Footfall Count: "+s.countSold);
		 }
	}
	
	public static void merge(Stall[] stall, int l, int r) {
		if(l<r) {
			int mid = (l+r)/2;
			merge(stall,l,mid);
			merge(stall,mid+1,r);
			
			mergeSort(stall,l,r,mid);
		}
	}
	
	public static void mergeSort(Stall stall[], int l, int r, int mid) {
		int n1 = mid-l+1;
		int n2 = r-mid;
		
		Stall[] left = new Stall[n1];
		Stall[] right = new Stall[n2];
		
		System.arraycopy(stall, l, left, 0, n1);
		System.arraycopy(stall, mid+1, right, 0, n2);
		
		int i=0,j=0,k=l;
		
		while(i<n1 && j<n2) {
			if(left[i].countSold>right[j].countSold) {
				stall[k++] = left[i++];
			}else {
				stall[k++] = right[j++];
			}
		}
		
		while(i<n1) {
			stall[k++] = left[i++];
		}
		
		while(j<n2) {
			stall[k++] = right[j++];
		}
	}
}