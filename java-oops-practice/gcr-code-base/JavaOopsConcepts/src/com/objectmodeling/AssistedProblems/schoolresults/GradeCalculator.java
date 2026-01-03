package com.objectmodeling.AssistedProblems.schoolresults;

public class GradeCalculator {
  public int calculateTotal(Student student) {
        int total = 0;
        for (Subject subject : student.getSubjects()) {
            total += subject.getMarks();
        }
        return total;
    }

    public void calculateGrade(Student student) {
        int total = calculateTotal(student);
        int subjectCount = student.getSubjects().size();
        int average = total / subjectCount;

        System.out.println("Student Name: " + student.getName());
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);

        if (average >= 90) {
            System.out.println("Grade: A");
        } 
        else if (average >= 75) {
            System.out.println("Grade: B");
        }
        else if (average >= 60) {
            System.out.println("Grade: C");
        } 
        else {
            System.out.println("Grade: D");
        }
    }
}
