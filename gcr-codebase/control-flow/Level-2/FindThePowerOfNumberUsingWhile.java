import java.util.Scanner;
//Create FindThePowerOfNumberUsingWhile Class to compute the power of number
public class FindThePowerOfNumberUsingWhile{
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
		int i=power;
		while(i>0){
			result+=(number*i);
			i-=1;
		}
		
		//Displaying the power of number
		System.out.println(result);
	}
}