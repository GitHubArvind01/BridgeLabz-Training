package com.collections.groupobjectsproperty;

public class Department {
	String depName;

	public Department(String depName) {
		this.depName = depName;
	}
	
	 @Override
    public String toString() {
        return depName;
    }
}
