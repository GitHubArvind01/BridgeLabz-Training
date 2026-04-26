import java.util.Scanner;
//Create CalculateWindChillTemperature Class to compute Wind Chill Temperature
public class CalculateWindChillTemperature{
	public static void main (String args[]){
		
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Taking input as temperature and windSpeed from user
		System.out.println("Enter the temperature: ");
		double temperature = sc.nextDouble();

		System.out.println("Enter the windSpeed: ");
		double windSpeed = sc.nextDouble();
		
		//calling function compute the Wind Chill Temperature
		double result = calculateWindChill(temperature,windSpeed);
		
		//Displaying the ouput 
		System.out.println("Wind Chill Temperature: " +result);
	}
	
	//This function has logic of find the number of chocolates can each child get
	public static double calculateWindChill(double temperature, double windSpeed){
		return 5.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * windSpeed;
	}
}