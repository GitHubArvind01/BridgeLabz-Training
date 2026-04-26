package com.question.fitnesstracker;

public class Main {

	public static void main(String[] args) {
		Track track[] = {new Track("allu",3000), new Track("ravi",100), new Track("kali",700), new Track("alice",1500)};
		bubbleSort(track, track.length);
		
		//display
		for(Track t : track) {
			System.out.println("\nName: "+t.name);
			System.out.println("Steps: "+t.steps);
		}
	}
	
	//sort
	public static void bubbleSort(Track track[], int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(track[j].steps<=track[j+1].steps) {
					Track temp = track[j];
					track[j] = track[j+1];
					track[j+1] = temp;
				}
			}
		}
	}
}