package com.Inheritance.AssistedProblems;

public class MainAnimal {

	public static void main(String[] args) {
		Dog d = new Dog("Tommy",12);
		d.makeSound();
		
		Animal c = new Cat("James",2);
		c.makeSound();
		
		Animal b = new Bird("romy",4);
		b.makeSound();
	}
}


class Animal{
	String name;
	int age;
	
	Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void makeSound() {}
}

class Dog extends Animal{
	Dog(String name, int age){
		super(name,age);
	}
	public void makeSound() {
		System.out.println("Name: "+name+"\n"+"age: "+age);
		System.out.println("Dog sound!");
	}
}
class Cat extends Animal{
	Cat(String name, int age){
		super(name,age);
	}
	public void makeSound() {
		System.out.println("Name: "+name+"\n"+"age: "+age);
		System.out.println("Cat sound!");
	}
}

class Bird extends Animal{
	Bird(String name, int age){
		super(name,age);
	}
	public void makeSound() {
		System.out.println("Name: "+name+"\n"+"age: "+age);
		System.out.println("Bird sound!");
	}
}