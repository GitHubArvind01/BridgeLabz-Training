import java.util.Scanner;
//Create CountNumberDigit Class to compute the count of number digit
public class CountNumberDigit{
	public static void main (String args[]){
	
		// Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
		
		// Taking number as input
		System.out.println("Enter the postive number: ");
		int number = sc.nextInt();
		
		//Computing the count of digit in number
		int n = number;
		int count = 0;
		while(n>0){
			int temp = n%10;
			count+=1;
			n/=10;
		}
		
		//Displaying the output 
		System.out.println(count);	
	}
}