import java.util.Scanner;
//Create FindQuotientAndReminder Class to compute the quotient and reminder
public class FindQuotientAndReminder{
	public static void main (String args[]){
		
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Taking input as number from user
		System.out.println("Enter the positive number: ");
		int number = sc.nextInt();

		System.out.println("Enter the divisor number: ");
		int divisor = sc.nextInt();
		
		//calling function compute 
		computeSum(number, divisor);
	}
	//This function has logic of finding quotient and reminder
	public static void computeSum(int number, int divisor){
		
		//Displaying the ouput 
		System.out.println("Quotient:  " + (number/divisor) + "\nReminder : " + (number%divisor));
	}
}