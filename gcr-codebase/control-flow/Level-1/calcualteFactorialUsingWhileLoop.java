import java.util.Scanner;
//Create calcualteFactorialUsingWhileLoop Class to compute the factorial
public class calcualteFactorialUsingWhileLoop{
	public static void main (String args[]){
		// Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		
		// Taking number as input
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		
		//calcualte the factorial using while loop
		int factorial = 1;
		while(number>0){
			factorial*=number;
			number-=1;
		}
		
		// Displaying the output
		System.out.println(factorial);
	}
}