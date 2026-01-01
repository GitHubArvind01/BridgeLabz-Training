package com.Inheritance.SampleProblems.Device;

public class Device {
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
