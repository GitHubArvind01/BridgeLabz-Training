import java.util.Scanner;
//Create printOddOrEven Class to compute the odd and even of 1 to number 
public class printOddOrEven{
	public static void main (String args[]){
		// Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		
		// Taking number as input
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		
		
		// Displaying the output
		int factorial = 1;
		for(int i=2;i<=number;i++){
			System.out.println("odd: " + (i-1) + " even: " + (i));
		}		
	}
}