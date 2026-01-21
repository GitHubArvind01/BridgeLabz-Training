package com.question.medwarehouse;
import java.time.*;

public class Store {
	String mediName;
	LocalDate date;
	
	public Store(String mediName, LocalDate date) {
		this.mediName = mediName;
		this.date = date;
	}
}
