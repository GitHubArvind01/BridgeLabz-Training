package com.Inheritance.AssistedProblems;

public class MainVehicle {

	public static void main(String[] args) {
		Vehicle vehicles[] = new Vehicle[3];
		
		vehicles[0] = new Car(200,"Petrol",4);
		vehicles[1] = new Truck(160,"Diesel",12);
		vehicles[2] = new Motorcycle(240,"Petrol","4-STOCK");
		
		for(Vehicle vh : vehicles) {
			vh.displayInfo();			
		}
	}
}

class Vehicle{
	//attributes
	double maxSpeed;
	String fuelType;
	
	//constructor
	public Vehicle(double maxSpeed, String fuelType) {
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
	}
	
	//method to displayInfo
	public void displayInfo() {
		System.out.println("------------------------------------");
		System.out.println("Vehicle Max Speed: "+maxSpeed);
		System.out.println("Fuel Type: "+fuelType);
	}
}

class Car extends Vehicle{
	//attributes
	int seatCapacity;
	
	//constructor
	public Car(double maxSpeed, String fuelType, int seatCapacity) {
		super(maxSpeed, fuelType);
		this.seatCapacity = seatCapacity;
	}
	
	//displayInfo
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Car Seat Capacity: "+seatCapacity);
		System.out.println("------------------------------------");
	}
}

class Truck extends Vehicle{
	//attributes
	int tiresCount;

	//constructor
	public Truck(double maxSpeed, String fuelType, int tiresCount) {
		super(maxSpeed, fuelType);
		this.tiresCount = tiresCount;
	}
	
	//displayInfo
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Truck Tires Count: "+tiresCount);
		System.out.println("------------------------------------");
	}
}

class Motorcycle extends Vehicle{
	//attributes
	String engineType;
	
	//constructor
	public Motorcycle(double maxSpeed, String fuelType, String engineType) {
		super(maxSpeed, fuelType);
		this.engineType = engineType;
	}
	
	//displayInfo
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Motor Cycle Engine Type: "+engineType);
		System.out.println("------------------------------------");
	}
}
