import java.util.Scanner;
//Create UnitConvertor2 Class to convert the unit into another
public class UnitConvertor2{
	public static void main (String args[]){
		
		//This is convert yard to feets
		double yard = 20;
		System.out.println("20 yard convert feet : " + convertYardToFeets(yard));
		
		//This is convert feet to yard
		double feet = 20;
		System.out.println("20 miles convert km : " + convertFeetToYard(feet)); 
		
		//This is convert meters to feets
		double meters = 20;
		System.out.println("20 meters convert feets : " + convertMetersToInches(meters)); 
		
		//This is convert inches to meters
		double inches = 20;
		System.out.println("20 feets convert meters : " + convertInchesToMeters(inches)); 
		
		//This is convert inches to centimeters
		System.out.println("20 feets convert meters : " + convertInchesTocentimeters(inches)); 
	}
	public static double convertYardToFeets(double yard){
		double yards2feet = 3;
		return yard*yards2feet;
	}
	
	public static double convertFeetToYard(double feet){
		double feet2yards = 0.333333;
		return feet*feet2yards;
	}
	
	public static double convertMetersToInches(double meters){
		double meters2inches = 39.3701;
		return meters*meters2inches;
	}
	
	public static double convertInchesToMeters(double inches){
		double inches2meters = 0.0254;
		return inches*inches2meters;
	}
	
	public static double convertInchesTocentimeters(double inches){
		double inches2cm = 2.54;
		return inches*inches2cm;
	}
}