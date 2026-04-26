import java.util.Scanner;
//Create isNumberPositiveNegativeZero Class to check number is positive, negative or zero
public class isNumberPositiveNegativeZero{
	public static void main (String args[]){
		// Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		
		// Taking number as input
		System.out.println("Enter the number : ");
		int number = input.nextInt();
		
		// Displaying the output
		if(number>=1){
			System.out.println("positive.");
		}else if(number<0){
			System.out.println("negative");
		}
		else{
			System.out.println("zero");
		}
	}
}