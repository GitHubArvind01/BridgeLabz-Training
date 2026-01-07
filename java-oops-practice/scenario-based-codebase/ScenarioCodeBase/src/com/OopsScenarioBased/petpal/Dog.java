package com.OopsScenarioBased.petpal;

public class Dog extends Pet implements IInteractable {

	public Dog(String name, int age) {
		super(name, "Dog", age);
	}

	@Override
	public void feed() {
		System.out.println("Thanks for food. Dod is happy");
	}

	@Override
	public void play() {
		System.out.println("Dog is playing.");
	}

	@Override
	public void sleep() {
		System.out.println("Dog is sleeping.");
	}
	
	public void makeSound() {
		System.out.println("Ba hu Bha hu");
	}
	
}
