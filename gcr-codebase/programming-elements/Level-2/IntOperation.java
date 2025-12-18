import java.util.Scanner;
//Create IntOperation Class to compute the Distance and Travel Time
public class IntOperation{
	public static void main (String args[]){
		// Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		
		// Taking three number as input
		System.out.println("Enter the first number: ");
		int a = input.nextInt();
		
		System.out.println("Enter the second number: ");
		int b = input.nextInt();
		
		System.out.println("Enter the third number: ");
		int c = input.nextInt();
		
		// Displaying the output
		System.out.println("The results of Int Operations are "+ (a + b *c ) +", " + (a * b + c) +", "+ (c + a / b) +", and "+(a % b + c));
	}
}