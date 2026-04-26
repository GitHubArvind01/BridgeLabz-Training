package com.OopsScenarioBased.homeautomation;

public class Light extends Appliance implements Controllable{
	private double density;
	
	public Light(double deviceId, double density) {
		super(deviceId, 2000.0);
		this.density = density;
	}

	@Override
	public void turnOn() {
		setWorking(true);
		System.out.println("Light [" + getDeviceId() + "] density of " + density);
	}

	@Override
	public void turnOff() {
		setWorking(false);
		System.out.println("Light [" + getDeviceId() + "] Stopped!");
	}
}
