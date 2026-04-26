package com.OopsScenarioBased.courseenrollment;

public class Undergraduate extends Student{
	

	public Undergraduate(String id, String name) {
        super(name,id);
        this.studentType = "UG";
    }

	@Override
	public void displayRole() {
		 System.out.println("[Undergraduate] " + getName());
		
	}

    
}