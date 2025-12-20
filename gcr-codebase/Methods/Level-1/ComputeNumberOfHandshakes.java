import java.util.Scanner;
//Create ComputeNumberOfHandshakes Class to compute the number of student can handshakess
public class ComputeNumberOfHandshakes{
	public static void main (String args[]){
		
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Creating array and size of array
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		//calling the function computeInterest
		int result = computeHandshakes(number);
		
		//Displaying the ouput 
		System.out.println("Number of possible handshakes: " + result);
	}
	public static int computeHandshakes(int n){
		return (n*(n-1))/2;
	}
}