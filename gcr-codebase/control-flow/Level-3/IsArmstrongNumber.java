import java.util.Scanner;
//Create IsArmstrongNumber Class to compute the number is prime or not
public class IsArmstrongNumber{
	public static void main (String args[]){
	
		// Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
		
		// Taking number as input
		System.out.println("Enter the postive number: ");
		int number = sc.nextInt();
		
		//Computing the Armstrong Number qube
		int n = number;
		int sum = 0;
		while(n>0){
			int temp = n%10;
			sum+=(temp*temp*temp);
			n/=10;
		}
		
		//Displaying the output while validating Is Armstrong Number
		if(sum==number){
			System.out.println(number+" is Armstrong Number.");
		}else{
			System.out.println(number+" not Armstrong Number!");
		}
	}
}