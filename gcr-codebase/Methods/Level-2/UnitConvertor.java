import java.util.Scanner;
//Create UnitConvertor Class to convert the unit into another
public class UnitConvertor{
	public static void main (String args[]){
		
		//This is convert km to miles
		double km = 20;
		System.out.println("20 Km convert miles : " + convertKmToMiles(km));
		
		//This is convert miles to km
		double miles = 20;
		System.out.println("20 miles convert km : " + convertMilesToKm(miles)); 
		
		//This is convert meters to feets
		double meters = 20;
		System.out.println("20 meters convert feets : " + convertMetersToFeets(meters)); 
		
		//This is convert feets to meters
		double feets = 20;
		System.out.println("20 feets convert meters : " + convertFeetsToMeters(feets)); 
	}
	public static double convertKmToMiles(double km){
		double km2miles = 0.621371;
		return km*km2miles;
	}
	
	public static double convertMilesToKm(double miles){
		double miles2km = 1.60934;
		return miles*miles2km;
	}
	
	public static double convertMetersToFeets(double meters){
		double meters2feet = 3.28084;
		return meters*meters2feet;
	}
	
	public static double convertFeetsToMeters(double feets){
		double feet2meters = 0.3048;
		return feets*feet2meters;
	}
}