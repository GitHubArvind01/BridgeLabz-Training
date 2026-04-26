package com.OopsScenarioBased.artify;

public class Artwork {
	private String title;
	private String artist;
	private double price;
	private String licenseType;
	private String artType;
	
	public Artwork(String title, String artist, double price, String licenseType, String artType) {
		this.title = title;
		this.artist = artist;
		this.price = price;
		this.licenseType = licenseType;
		this.artType = artType;
	}
	
	public String getArtType() {
		return artType;
	}
	
	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public double getPrice() {
		return price;
	}

	public String getLicenseType() {
		return licenseType;
	}
}
