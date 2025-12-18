import java.util.Scanner;
//Create IsFirstNumberSmallest Class to Print the yes or no
public class IsFirstNumberSmallest{
	public static void main (String args[]){
		
		// Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		
		// Taking three number as input
		System.out.println("Enter the first number: ");
		int number1 = input.nextInt();
		
		System.out.println("Enter the second number: ");
		int number2 = input.nextInt();
		
		System.out.println("Enter the third number: ");
		int number3 = input.nextInt();
		
		
		// Displaying the output
		if(number1<=number2 && number1<=number3){
			System.out.println("Is the first number the smallest? Yes");
		}else{
			System.out.println("Is the first number the smallest? No");
		}
	}
}