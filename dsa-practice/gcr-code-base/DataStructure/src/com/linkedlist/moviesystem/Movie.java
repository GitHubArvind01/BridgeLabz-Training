package com.linkedlist.moviesystem;

public class Movie {
	public String movieTitle;
	public String Director;
	public int YOR;
	public float rating;
	
	Movie next;
	Movie prev;
	
	public Movie(String movieTitle, String Director, int YOR, float rating) {
		this.movieTitle = movieTitle;
		this.Director = Director;
		this.YOR = YOR;
		this.rating = rating;
		this.next = null;
		this.prev = null;
	}
}
