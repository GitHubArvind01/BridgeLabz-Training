package com.Inheritance.SampleProblems.Device;

public class Thermostat extends Device{
	//attributes
	String temperatureSetting;
	
	//constructor
	public Thermostat(String deviceId, String status, String temperatureSetting) {
		super(deviceId, status);
		this.temperatureSetting = temperatureSetting;
	}
	
	//method
	public void displayStatus() {
		super.displayStatus();
		System.out.println("Temperature Setting: "+temperatureSetting);
		System.out.println("----------------------------------------");
	}
}