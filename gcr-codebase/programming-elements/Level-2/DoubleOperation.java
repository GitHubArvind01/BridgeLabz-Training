import java.util.Scanner;
//Create DoubleOperation Class to compute the Distance and Travel Time
public class DoubleOperation{
	public static void main (String args[]){
		// Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		
		// Taking three number as input
		System.out.println("Enter the first number: ");
		double a = input.nextDouble();
		
		System.out.println("Enter the second number: ");
		double b = input.nextDouble();
		
		System.out.println("Enter the third number: ");
		double c = input.nextDouble();
		
		// Displaying the output
		System.out.println("The results of Int Operations are "+ (a + b *c ) +", " + (a * b + c) +", "+ (c + a / b) +", and "+(a % b + c));
	}
}