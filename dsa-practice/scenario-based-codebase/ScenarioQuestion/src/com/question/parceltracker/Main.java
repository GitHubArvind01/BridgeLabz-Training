package com.question.parceltracker;

public class Main {

	public static void main(String[] args) {
		Track track = new Track();
		track.addStatus("Packed");
		track.addStatus("Shipped");
		track.addStatus("In Transit");
		track.addStatus("Delivered");
		
		track.viewStatus();
	}
}
