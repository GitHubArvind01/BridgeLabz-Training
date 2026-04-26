import java.util.Scanner;
//Create FindYoungestFriends Class to compute the power of number
public class FindThePowerOfNumber{
	public static void main (String args[]){
		// Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
		
		// Taking number as input
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		System.out.println("Enter the power: ");
		int power = sc.nextInt();
		
		//Computing the power of number
		int result = number;
		for(int i=power;i>0;i--){
			result+=(number*i);
		}
		
		//Displaying the power of number
		System.out.println(result);
	}
}