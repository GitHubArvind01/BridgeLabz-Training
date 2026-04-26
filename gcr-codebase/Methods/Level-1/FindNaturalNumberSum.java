import java.util.Scanner;
//Create FindNaturalNumberSum Class to compute the natural number sum
public class FindNaturalNumberSum{
	public static void main (String args[]){
		
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Taking input as trangle side from user
		System.out.println("Enter the positive number: ");
		int number = sc.nextInt();
		
		//sotring the result of function callback
		long result = computeSum(number);
		
		//Displaying the ouput 
		System.out.println("Number " + number + " natural sum is : " + result);
	}
	public static long computeSum(int number){
		return (long)number*(number+1)/2;
	}
}