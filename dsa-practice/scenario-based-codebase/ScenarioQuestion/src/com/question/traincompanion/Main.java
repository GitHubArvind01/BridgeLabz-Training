package com.question.traincompanion;

public class Main {

	public static void main(String[] args) {
		
		TrainManagement m = new TrainManagement();
		
		m.addCompartment(new Train("S1",1));
		m.addCompartment(new Train("S2",2));
		m.addCompartment(new Train("pantry",3));
		m.addCompartment(new Train("S3",4));
		m.addCompartment(new Train("pantry",5));
		
		m.searchForwardPentry();
		
		m.addCompartment(new Train("S4",6));
		m.addCompartment(new Train("S5",7));
		
		m.searchPreviousePentry();
		
		m.addCompartment(new Train("S6",8));
		m.addCompartment(new Train("S7",9));
		
		
		m.viewCompartment();
	}
}
