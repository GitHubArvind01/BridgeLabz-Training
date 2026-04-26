import java.util.Scanner;
//Create TrangularParkComputeRound Class to compute the how many roundes possible by athlete for 5km run
public class TrangularParkComputeRound{
	public static void main (String args[]){
		
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Taking input as trangle side from user
		System.out.println("Enter the first side of trangle: ");
		double firstSide = sc.nextDouble();
		
		System.out.println("Enter the second side of trangle: ");
		double secondSide = sc.nextDouble();
		
		System.out.println("Enter the third side of trangle: ");
		double thirdSide = sc.nextDouble();
		
		//sotring the result of function callback
		double result = computeRound(firstSide, secondSide, thirdSide);
		
		//Displaying the ouput 
		System.out.println(result + " rounds user needs to do to complete 5km run");
	}
	public static double computeRound(double first, double second, double third){
		return (double)5000/(first+second+third);
	}
}