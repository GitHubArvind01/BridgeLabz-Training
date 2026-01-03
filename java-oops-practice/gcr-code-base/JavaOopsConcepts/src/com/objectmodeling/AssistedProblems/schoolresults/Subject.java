package com.objectmodeling.AssistedProblems.schoolresults;

public class Subject {
	private String subjectName;
    private int marks;

    public Subject(String subjectName, int marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public String getSubjectName() {
        return subjectName; 
    }
}
