package com.constructor.Level1;

public class UniversityManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayStudent student = new DisplayStudent(23,"allu",9.4);
		DisplayStudent student2 = new DisplayStudent(23,"allu",9.4);
		
		double cgpa = student.getCGPA();
		System.out.println("get CGPA -> "+cgpa);
		System.out.println("-------------------");
		student.modifyCGPA(5.6);
		
		double newcgpa = student.getCGPA();
		System.out.println("updated CGPA -> "+newcgpa);
		System.out.println("--------------------");
		
		student.displayStudent();
		student2.displayStudent();
		
		 System.out.println("\n--- Postgraduate Student ---");
        PostgraduateStudent pg = new PostgraduateStudent(201, "Rahul Sharma", 8.9, "Machine Learning");
        pg.displayPGDetails(); // accessing protected name
        System.out.println("CGPA (via getter): " + pg.getCGPA());
		
	}
}
