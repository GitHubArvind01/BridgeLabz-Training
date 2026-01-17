package com.question.examcell;

public class Main {
	public static void main(String args[]) {
		Exam exam[] = {new Exam("Allu",1,655), new Exam("Ravi",4,535), new Exam("kali",56,411), new Exam("suriya",14,545), new Exam("sonu",41,455)};
		
		Exam result[] = merge(exam,0,exam.length-1);
		
		System.out.println("Rank\t\tName\t\tScore");
		for(Exam exams : result) {
			System.out.print(exams.rank+"\t\t"+(exams.studentName)+"\t\t"+(exams.score));
			System.out.println();
		}
	}
	
	//merge sort
	public static Exam[] merge(Exam exam[], int l, int r) {
		if(l>=r) {
			return new Exam[]{exam[r]};
		}
		int mid = (l+r)/2;
		
		Exam left[] = merge(exam,l,mid);
		Exam right[] = merge(exam,mid+1,r);
		
		return mergeSort(left,right);
	}
	
	public static Exam[] mergeSort(Exam left[], Exam right[]) {
		Exam result[] = new Exam[left.length+right.length];
		
		int i=0, j=0,k=0;
		
		while(i<left.length && j<right.length) {
			if(left[i].rank<right[j].rank) {
				result[k++] = left[i++];
			}else {
				result[k++] = right[j++];
			}
		}
		
		while(i<left.length) {
			result[k++] = left[i++];
		}
		
		while(j<right.length) {
			result[k++] = right[j++];
		}
		
		return result;
	}
}