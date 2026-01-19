package com.question.eduresults;
import java.util.Map;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		//score
		Score madhayPerdesh[] = {new Score("ravi",620), new Score("suriya",220), new Score("sunny",320), new Score("suriya",520)};
		Score bihar[] = {new Score("alice",520), new Score("zack",270), new Score("noait",270), new Score("kali",420)};
		Score UP[] = {new Score("stuan",120), new Score("aprox",570), new Score("lucky",650), new Score("apirt",370)};

		Map<String,Score[]> map = new HashMap<>();
		map.put("madhayPerdesh", madhayPerdesh);
		map.put("bihar", bihar);
		map.put("UP", UP);
		
		//call method for sorting
		for(var list : map.entrySet()) {
			merge(list.getValue(),0,list.getValue().length-1);
		}
		
		//display
		for(var c : map.entrySet()) {
			System.out.println("\n-------------------------"+c.getKey()+ " Result Score---------------------------");
			displayScore(c.getValue());
			System.out.println("----------------------------------------------------------------");
		}
	}
	public static void displayScore(Score score[]) {
		int i= 1;
		for(Score s : score) {
			System.out.println("\n-------------Student "+(i)+"------------");
			System.out.println("Name: "+s.name);
			System.out.println("Student Id: "+s.stuId);
			System.out.println("Score: "+s.score);
			System.out.println("-----------------------------");
			i+=1;
		}
	}
	public static void merge(Score state[], int l, int r) {
		if(l<r) {
			int mid = (l+r)/2;
			
			//left
			merge(state,l,mid);
			
			//right
			merge(state,mid+1,r);
			
			//call mergeSort
			mergeSort(state,l,r,mid);
		}
	}
	
	public static void mergeSort(Score score[], int l, int r, int m) {
		int n1 = m-l+1;
		int n2 = r-m;
		
		Score left[] = new Score[n1];
		Score right[] = new Score[n2];
		
		System.arraycopy(score, l, left, 0, n1);
		System.arraycopy(score, m+1, right, 0, n2);
		
		int i=0,j=0,k=l;
		
		while(i<n1 && j<n2) {
			if(left[i].score<right[j].score) {
				score[k++] = left[i++];
			}else {
				score[k++] = right[j++];
			}
		}
		
		while(i<n1) {
			score[k++] = left[i++];
		}
		
		while(j<n2) {
			score[k++] = right[j++];
		}
	}
}