import java.util.Scanner;
public class CalculateDistanceIntoYardAndMiles{
	public static void main (String args[]){
		
		//Here Scanner object created to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Taking height as input from user
		System.out.println("Enter the distance in feet: ");
		double distance = sc.nextDouble();
		
		//calculating the yards
		double yards = distance/3;
		
		//calculating the miles
		double miles = distance/5280;
		
		//Displaying the output
		System.out.println("The distance in yards is "+ yards +" while the distance in miles is "+miles);
	}
}