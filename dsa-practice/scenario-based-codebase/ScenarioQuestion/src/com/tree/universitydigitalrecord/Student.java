package com.tree.universitydigitalrecord;

public class Student {
	private int rollNumber;
	private String name;
	private double percentage;
	private Student left, right;
	
	public Student(int rollNumber, String name, double percentage) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.percentage = percentage;
		left = right = null;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public String getName() {
		return name;
	}

	public Student getLeft() {
		return left;
	}

	public Student getRight() {
		return right;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLeft(Student left) {
		this.left = left;
	}

	public void setRight(Student right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", percentage=" + percentage + "]";
	}
}
