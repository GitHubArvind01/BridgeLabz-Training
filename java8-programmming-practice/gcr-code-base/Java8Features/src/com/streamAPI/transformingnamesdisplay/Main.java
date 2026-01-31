package com.streamAPI.transformingnamesdisplay;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		
		studentList.add(new Student(101,"kali"));
		studentList.add(new Student(102,"manoj"));
		studentList.add(new Student(103,"allu"));
		studentList.add(new Student(104,"ravi"));
		
		studentList.stream()
					.sorted(Comparator.comparing(Student::getName))
					.forEach(x -> System.out.println(x.getName().toUpperCase()));
	}
}