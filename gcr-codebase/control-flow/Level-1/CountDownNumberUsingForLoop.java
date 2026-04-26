import java.util.Scanner;
//Create CountDownNumber Class to decrement by 1 until it become 1 and print during
public class CountDownNumberUsingForLoop{
	public static void main (String args[]){
		// Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		
		// Taking three number as input
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		
		// Displaying the output
		System.out.println();
		for(int i=number;i>0;i--){
			System.out.println(i);
		}
	}
}