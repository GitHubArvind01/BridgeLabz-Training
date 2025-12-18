import java.util.Scanner;
//Create CheckNaturalNumberAndSum Class to check number is natural then sum of natural number print
public class CheckNaturalNumberAndSum{
	public static void main (String args[]){
		// Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		
		// Taking three number as input
		System.out.println("Enter the first number: ");
		int number = input.nextInt();
		
		// Displaying the output
		if(number>0){
			int natualNumberSum = number*(number+1)/2;
			System.out.println("The sum of "+ number +" natural numbers is " + natualNumberSum);
		}else{
			System.out.println("The number "+ number +" is not a natural number");
		}
	}
}