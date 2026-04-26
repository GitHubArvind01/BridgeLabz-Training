package com.linkedlist.studentrecordmanagement;

public class Main {

	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		l1.addBeginning("allu", 101, 22, 'A');
		l1.addEnd("ramu", 103, 23, 'B');
		l1.addAtPosition("kali", 102, 24, 'C', 2);
		
		l1.searchByRoll(102);
		l1.updateGrade(102, 'D');
		l1.viewStudent();
		
		l1.deleteStduent(102);
		l1.viewStudent();
	}
}