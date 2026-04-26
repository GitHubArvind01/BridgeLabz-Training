import java.util.*;
public class FindMaxMinNumber{
	public static void main(String [] args){
		
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//calling input method to take input 
		input(sc);
	}
	//this method takes input 
	public static void input(Scanner sc){
		
		//Taking input from user 
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		
		findMinmax(first,second,third);
	}
	//this method find the max and min then print
	public static void findMinmax(int firstNumber,int secondNumber, int thirdNumber){
		if(firstNumber>secondNumber&&firstNumber>thirdNumber){
			System.out.println("Maximum number is "+f);
			return;
		}
		if(secondNumber>firstNumber&&secondNumber>thirdNumber){
			System.out.println("Maximum number is "+s);
			return;
		}
			System.out.println("Maximum number is "+t);
			return;
	}
}