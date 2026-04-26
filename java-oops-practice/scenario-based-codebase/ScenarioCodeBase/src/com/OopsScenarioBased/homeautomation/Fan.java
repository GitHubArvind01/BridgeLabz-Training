package com.OopsScenarioBased.homeautomation;

public class Fan extends Appliance implements Controllable{
	private double speed;
	
	public Fan(double deviceId, double speed) {
		super(deviceId, 1500.9);
		this.speed = speed;
	}

	@Override
	public void turnOn() {
		setWorking(true);
		System.out.println("Fan [" + getDeviceId() + "] runnig speed " + speed);
	}

	@Override
	public void turnOff() {
		setWorking(false);
		System.out.println("Fan [" + getDeviceId() + "] Stopped!");
	}
	
}
