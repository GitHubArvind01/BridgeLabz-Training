import java.util.Scanner;
//Create CheckNumber Class to check number is positive, negative, and zero
public class CheckNumber{
	public static void main (String args[]){
		
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Taking input as trangle side from user
		System.out.println("Enter the first side of trangle: ");
		int number = sc.nextInt();
		
		//sotring the result of function callback
		int result = computeNumber(number);
		
		//Displaying the ouput 
		if(result>=1){
			System.out.println("Positive");
		}else if(result==0){
			System.out.println("Zero");
		}else{
			System.out.println("Negative");
		}
	}
	public static int computeNumber(int n){
		if(n>=1){
			return 1;
		}else if(n==-1){
			return -1;
		}else{
			return 0;
		}
	}
}