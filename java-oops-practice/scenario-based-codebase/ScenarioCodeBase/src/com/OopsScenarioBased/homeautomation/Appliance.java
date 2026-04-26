package com.OopsScenarioBased.homeautomation;

public class Appliance {
	private double deviceId;
	private boolean isWorking;
	private double powerCunsumption;
	
	public Appliance(double deviceId, double powerConsumption) {
		this.deviceId = deviceId;
		this.powerCunsumption = powerConsumption;
		this.isWorking = false;
	}

	public double getDeviceId() {
		return deviceId;
	}


	public boolean isWorking() {
		return isWorking;
	}

	public void setWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}
	public double getPowerCunsumption() {
		return powerCunsumption;
	}
	
}
