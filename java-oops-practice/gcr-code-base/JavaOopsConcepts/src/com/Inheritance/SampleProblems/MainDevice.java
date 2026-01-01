package com.Inheritance.SampleProblems;

public class MainDevice {

	public static void main(String[] args) {
		Thermostat t = new Thermostat("123asdf","ON","24 degree");
		t.displayStatus();
	}
}


class Device {
	//attributes
	String deviceId;
	String status;
	
	//constructor
	public Device(String deviceId, String status) {
		this.deviceId = deviceId;
		this.status = status;
	}	
	
	//method displayStatus
	public void displayStatus() {
		System.out.println("------------Display Status--------------");
		System.out.println("Device Id: "+deviceId);
		System.out.println("Status: "+status);
	}
}

class Thermostat extends Device{
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