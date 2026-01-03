package com.OopsScenarioBased.homeautomation;

public class AC extends Appliance implements Controllable{
	private double temperature;

	public AC(double deviceId, double temp) {
		super(deviceId, 30000.0);
		this.temperature = temp;
	}	
	
	@Override
	public void turnOn() {
		setWorking(true);
		System.out.println("AC [" + getDeviceId() + "] cooling to " + temperature + "°C.");
	}

	@Override
	public void turnOff() {
		setWorking(false);
		System.out.println("AC [" + getDeviceId() + "] shutting down.");
	}
	
	public void showStatus() {
        String energyRank = (getPowerCunsumption() > 1000) ? "High Energy" : "Low Energy";
        System.out.println("Device: AC | Rank: " + energyRank);
    }
}
