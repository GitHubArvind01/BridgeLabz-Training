package com.question.cinemahouse;
import java.time.*;
public class Main {

	public static void main(String[] args) {
		Movie movie[] = {new Movie("RRR",LocalTime.of(12, 11)), new Movie("Pushpa The Rule",LocalTime.of(02, 40)), new Movie("Entertaintment",LocalTime.of(22, 30)), new Movie("King",LocalTime.of(16, 45)), new Movie("Salaar",LocalTime.of(14, 45))};
		
		//call method to sort
		bubbleSort(movie,movie.length);
		
		//display
		System.out.printf("%-30s %-10s\n","Moive", "time");
		for(Movie m : movie) {
			System.out.printf("%-30s %-10s\n",m.moiveName,m.time);
		}
	}
	
	public static void bubbleSort(Movie movie[], int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				LocalTime time1 = movie[j].time;
				LocalTime time2 = movie[j+1].time;
				if(time1.isAfter(time2)) {
					Movie temp = movie[j];
					movie[j] = movie[j+1];
					movie[j+1] = temp;
				}
			}
		}
	}
}