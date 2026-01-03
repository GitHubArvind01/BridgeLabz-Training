package com.OopsScenarioBased.homeautomation;

public class Main {
	public static void main(String args[]) {
		UserController home = new UserController();

        home.addDevice(new Light(102,32));
        home.addDevice(new AC(103, 22));

        home.activateAll();

        AC myAc = new AC(104, 24);
        myAc.showStatus();
        
        home.deactivateAll();
	}
}