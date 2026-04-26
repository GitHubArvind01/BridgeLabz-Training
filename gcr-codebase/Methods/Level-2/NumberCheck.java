import java.util.Scanner;
//Create NumberCheck  Class to check number positive, even or odd and last compare first digit and last digit
public class NumberCheck {
	public static void main (String args[]){
		
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//creating array to store five number
		int numberArray[] = new int[5];
		
		//Taking input as number from user
		System.out.println("Enter the 5 number: ");
		for(int i=0;i<5;i++){
			numberArray[i] = sc.nextInt();
		}
		
		//iterate over array 
		for(int i=0;i<5;i++){
			int number = numberArray[i];
			if(isPositive(number)){
				System.out.println(number + " is positive!");
				if(isEven(number)){
					System.out.println(number + " is even!");
				}
				else{
					System.out.println(number + " is odd!");
				}
			}
			else{
				System.out.println(number + " is negative!");
			}
		}
		if(compare(numberArray)){
			System.out.println("First number: "+ numberArray[0] +" and last number: "+ numberArray[4] +" equal!");
		}else{
			System.out.println("First number: "+ numberArray[0] +" and last number: "+ numberArray[4] +" not equal!");
		}
	}
	public static boolean isPositive(int number){
		if(number>=0){
			return true;
		}else{
			return false;
		}
	}
	public static boolean isEven(int number){
		if(number%2==0){
			return true;
		}else{
			return false;
		}
	}
	public static boolean compare(int numberArray[]){
		if(numberArray[0]==numberArray[4]){
			return true;
		}else{
			return false;
		}
	}
}