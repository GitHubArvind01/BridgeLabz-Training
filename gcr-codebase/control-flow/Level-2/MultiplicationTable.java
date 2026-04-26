import java.util.Scanner;
//Create MultiplicationTable Class to compute multiplication table
public class MultiplicationTable{
	public static void main (String args[]){
	
		// Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		
		// Taking number as input
		System.out.println("Enter the salary: ");
		int number = input.nextInt();
		
		//storing the bonus Amount
		
		// Displaying the output
		for(int i=6;i<=9;i++){
			System.out.println(number+"*"+i+" = " + (number*i));
		}
	}
}