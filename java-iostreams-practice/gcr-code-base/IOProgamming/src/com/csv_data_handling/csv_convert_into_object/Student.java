package com.csv_data_handling.csv_convert_into_object;

public class Student {
	int id;
	String name;
	int age;
	double score;
	
	public Student(int id, String name, int age, double score) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", score=" + score + "]";
	}
}
