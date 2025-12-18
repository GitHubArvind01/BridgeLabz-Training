import java.util.Scanner;
//Create CheckDivisibility Class to compute the Distance and Travel Time
public class CheckDivisibility{
	public static void main (String args[]){
		// Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		
		// Taking three number as input
		System.out.println("Enter the any number: ");
		int number = input.nextInt();
		
		
		// Displaying the output
		System.out.println("Is the number "+ number +" divisible by 5? "+((number%5==0)?"YES":"NO"));
	}
}