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
		int ans[] = new int[2];
		ans = computeSum(number, divisor);
		
		//Displaying the ouput 
		System.out.println("Quotient:  " + ans[0] + "\nReminder : " + ans[1]);
	}
	
	//This function has logic of finding quotient and reminder
	public static int[] computeSum(int number, int divisor){
		return new int[]{(number/divisor),(number%divisor)};
	}
}