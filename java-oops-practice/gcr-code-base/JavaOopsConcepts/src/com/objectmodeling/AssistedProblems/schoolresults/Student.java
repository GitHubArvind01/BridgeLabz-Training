package com.objectmodeling.AssistedProblems.schoolresults;
import java.util.ArrayList;
import java.util.List;

public class Student {
	private int studentId;
    private String name;
    
    private List<Subject> subjects;   // Aggregation

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void requestGrade(GradeCalculator calculator) {
        calculator.calculateGrade(this);
    }

    public String getName() {
        return name;
    }
}
