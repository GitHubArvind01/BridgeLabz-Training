package com.OopsScenarioBased.homeautomation;
import java.util.*;

public class UserController {
	private List<Controllable> devices = new ArrayList<>();

    public void addDevice(Controllable device) {
        devices.add(device);
    }

    public void activateAll() {
        System.out.println("\n---'Arrive Home' Routine ---");
        for (Controllable device : devices) {
            device.turnOn(); 
        }
    }

    public void deactivateAll() {
        System.out.println("\n--'Leave Home' Routine ---");
        for (Controllable device : devices) {
            device.turnOff();
        }
    }
}
