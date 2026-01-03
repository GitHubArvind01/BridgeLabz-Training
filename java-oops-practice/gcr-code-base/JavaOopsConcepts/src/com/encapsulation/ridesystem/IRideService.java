package com.encapsulation.ridesystem;

public interface IRideService {
	void bookRide(Driver driver, Vehicle vehicle, double distance);
	void endRide();
}
