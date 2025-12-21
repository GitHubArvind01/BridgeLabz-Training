import java.util.Scanner;
//Create UnitConvertor3 Class to convert the unit into another
public class UnitConvertor3{
	public static void main (String args[]){
		
		//This is convert farhenheit to celsius
		double farhenheit = 20;
		System.out.println("20 farhenheit convert celsius : " + convertFarhenheitToCelsius(farhenheit));
		
		//This is convert celsius to farhenheit
		double celsius = 20;
		System.out.println("20 celsius convert farhenheit : " + convertCelsiusToFarhenheit(celsius)); 
		
		//This is convert pounds to kilograms
		double pounds = 20;
		System.out.println("20 pounds convert kilograms : " + convertPoundsToKilograms(pounds)); 
		
		//This is convert kilograms to pounds
		double kilograms = 20;
		System.out.println("20 kilograms convert pounds : " + convertKilogramsToPounds(kilograms)); 
		
		//This is convert gallons to liters
		double gallons = 20;
		System.out.println("20 liters convert meters : " + convertGallonsToLiters(gallons)); 
		
		//This is convert liters to gallons
		double liters = 20;
		System.out.println("20 liters convert gallons : " + convertLitersToGallons(liters)); 
	}
	public static double convertFarhenheitToCelsius(double farhenheit){
		double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
		return farhenheit*farhenheit2celsius;
	}
	
	public static double convertCelsiusToFarhenheit(double celsius){
		double celsius2farhenheit = (celsius * 9 / 5) + 32;
		return celsius*celsius2farhenheit;
	}
	
	public static double convertPoundsToKilograms(double pounds){
		double pounds2kilograms = 0.453592;
		return pounds*pounds2kilograms;
	}
	
	public static double convertKilogramsToPounds(double kilograms){
		double kilograms2pounds = 2.20462;
		return kilograms*kilograms2pounds;
	}
	
	public static double convertGallonsToLiters(double gallons){
		double gallons2liters = 3.78541;
		return gallons*gallons2liters;
	}
	
	public static double convertLitersToGallons(double liters){
		double liters2gallons = 0.264172;
		return liters*liters2gallons;
	}
}