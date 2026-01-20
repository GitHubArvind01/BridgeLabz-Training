package com.question.movietime;

import java.time.LocalTime;

public class Movie {
	String moiveName;
	LocalTime time;
	
	public Movie(String moiveName, LocalTime time) {
		this.moiveName = moiveName;
		this.time = time;
	}
}