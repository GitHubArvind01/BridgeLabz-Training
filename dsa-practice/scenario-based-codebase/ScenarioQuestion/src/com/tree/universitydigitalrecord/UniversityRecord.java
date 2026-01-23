package com.tree.universitydigitalrecord;

public class UniversityRecord {
	Student root;
	
	//add student
	public void addStudent(int roll, String name, double per) {
		root = insert(root, roll, name, per);
		System.out.println("Student added");
	}
	
	private Student insert(Student root, int roll, String name, double per) {
		if(root==null) {
			return new Student(roll,name,per);
		}
		
		if(root.getPercentage()>per) {
			root.setLeft(insert(root.getLeft(),roll,name,per));
		}
		else if(root.getPercentage()<per) {
			root.setRight(insert(root.getRight(),roll,name,per));
		}
		
		return root;
	}
	
	
	//display
	public void viewStudent() {
		Student temp = root;
		view(temp);
	}
	public void view(Student curr) {
		if(curr==null) {
			return;
		}
		view(curr.getLeft());
		System.out.println(curr.toString());
		view(curr.getRight());
	}
	
	//search student by id
	public void searchStudentByRollNumber(int roll) {
		Student temp = root;
		if(!search(temp, roll)) {
			System.out.println("not found!");
		}
	}
	
	public boolean search(Student curr, int roll) {
		if(curr==null) {
			return false;
		}
		
		if(curr.getRollNumber()==roll) {
			System.out.println("found");
			System.out.println(curr.toString());
			return true;
		}
		return search(curr.getLeft(), roll) || 		search(curr.getRight(),roll);
	}
}