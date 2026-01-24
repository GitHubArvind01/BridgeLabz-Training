package com.questions.travellog;

import java.io.Serializable;

public class Travel implements Serializable{
	private static final long serialVersionUID = 1L;

	private String cityName;
	private String country;
	private int days;
	public Travel(String country, String cityName, int days) {
		this.country = country;
		this.cityName = cityName;
		this.days = days;
	}
	
	public String getCityName() {
		return cityName;
	}
	
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public int getDays() {
		return days;
	}
	
	public void setDays(int days) {
		this.days = days;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString() {
		return "Travel [cityName=" + cityName + ", country=" + country + ", days=" + days + "]";
	}
}
