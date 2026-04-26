package com.OopsScenarioBased.petpal;

public class Bird extends Pet implements IInteractable {

	public Bird(String name, int age) {
		super(name, "Bird", age);
	}

	@Override
	public void feed() {
		System.out.println("Thanks for food. Bird is happy");
	}

	@Override
	public void play() {
		System.out.println("Bird is playing.");
	}

	@Override
	public void sleep() {
		System.out.println("Bird is sleeping.");
	}
	
	public void makeSound() {
		System.out.println("chi chi chi..");
	}
}
