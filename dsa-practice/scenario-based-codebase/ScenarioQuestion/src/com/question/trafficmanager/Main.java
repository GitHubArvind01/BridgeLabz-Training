package com.question.trafficmanager;

public class Main {
	public static void main(String args[]) {
		Trafic t = new Trafic();
		t.addVehicle(new Vehicle("BR1299KD"));
		t.addVehicle(new Vehicle("KL1299KD"));
		t.addVehicle(new Vehicle("UP5445KD"));
		t.addVehicle(new Vehicle("HR3322KD"));
		t.addVehicle(new Vehicle("KL1299KD"));
		t.addVehicle(new Vehicle("UP5445KD"));
		t.addVehicle(new Vehicle("HR3322KD"));
		t.addVehicle(new Vehicle("MP0000KD"));
		t.addVehicle(new Vehicle("KL1299KD"));
		t.addVehicle(new Vehicle("UP5445KD"));
		t.addVehicle(new Vehicle("UP5445KD"));
		t.addVehicle(new Vehicle("HR3322KD"));
		
		t.viewVehicle();
		
		t.removeVehicle("UP5445KD");
		
		t.viewVehicle();
	}
}
