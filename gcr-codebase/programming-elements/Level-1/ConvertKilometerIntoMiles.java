import java.util.Scanner;
public class ConvertKilometerIntoMiles{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the KM :");
		double distanceKilometer = sc.nextDouble();
		
		double convertMiles = distanceKilometer*0.621371;
		System.out.println("The total miles is "+ convertMiles +" mile for the given "+ distanceKilometer +"km");
	}
}