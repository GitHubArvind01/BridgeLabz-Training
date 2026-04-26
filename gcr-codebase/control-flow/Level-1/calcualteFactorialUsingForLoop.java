import java.util.Scanner;
//Create calcualteFactorialUsingForLoop Class to compute the factorial
public class calcualteFactorialUsingForLoop{
	public static void main (String args[]){
		// Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		
		// Taking number as input
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		
		//calcualte n natural sum using formula
		int naturalNumberSum1 = number*(number+1)/2;
		
		//calcualte the factorial using for loop
		int factorial = 1;
		for(int i=number;i>0;i--){
			factorial*=i;
		}
		
		// Displaying the output
		System.out.println(factorial);
	}
}