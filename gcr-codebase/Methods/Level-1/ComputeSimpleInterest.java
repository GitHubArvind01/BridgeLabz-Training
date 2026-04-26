import java.util.Scanner;
//Create ComputeSimpleInterest Class to compute the simple interest
public class ComputeSimpleInterest{
	public static void main (String args[]){
		
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Creating array and size of array
		System.out.println("Enter the Principal: ");
		int principal = sc.nextInt();

		System.out.println("Enter the Rate: ");
		double rate = sc.nextDouble();

		System.out.println("Enter the Time: ");
		double time = sc.nextDouble();	
		
		
		//calling the function computeInterest
		double result = computeInterest(principal,rate,time);
		
		//Displaying the ouput 
		System.out.println("The Simple Interest is "+ result +" for Principal "+ principal +", Rate of Interest "+ rate +" and Time " + time);
	}
	public static double computeInterest(int principal, double rate, double time){
		return (double)(principal*rate*time)/100;
	}
}