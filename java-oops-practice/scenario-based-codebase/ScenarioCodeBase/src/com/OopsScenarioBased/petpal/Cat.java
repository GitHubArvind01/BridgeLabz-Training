package com.OopsScenarioBased.petpal;

public class Cat extends Pet implements IInteractable {

	public Cat(String name, int age) {
		super(name, "Cat", age);
	}

	@Override
	public void feed() {
		System.out.println("Thanks for food. Cat happy");
	}

	@Override
	public void play() {
		System.out.println("Cat is playing.");
	}

	@Override
	public void sleep() {
		System.out.println("Cat is sleeping.");
	}
	
	public void makeSound() {
		System.out.println("Sound-Me ao Me ao");
	}
	
}
