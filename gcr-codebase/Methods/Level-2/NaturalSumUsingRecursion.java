import java.util.Scanner;
//Create NaturalSumUsingRecursion Class to compute the natural number sum
public class NaturalSumUsingRecursion{
	public static void main (String args[]){
		
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Taking input as trangle side from user
		System.out.println("Enter the positive number: ");
		int number = sc.nextInt();
		
		//find n natural number sum
		long sum = number*(number+1)/2;
		
		//sotring the result of function callback
		long result = computeSum(number);
		
		//Displaying the ouput 
		if(sum==result){
			System.out.println("Correct! Number " + number + " natural sum is : " + result);
		}else{
			System.out.println("Incorrect!");
		}
	}
	public static long computeSum(int number){
		if(number==1){
			return 1;
		}
		return number+computeSum(number-1);
	}
}