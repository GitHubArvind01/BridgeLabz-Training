import java.util.Scanner;
//Create MultiplicationTable Class to compute multiplication table
public class MultiplicationTable{
	public static void main (String args[]){
	
		// Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		
		// Taking number as input
		System.out.println("Enter the number: ");
		int number = input.nextInt();
		
		int multiplicationResult[] = new int[4];
		
		//computing the multiplication
		int j=0;
		for(int i=6;i<=9;i++){
			multiplicationResult[j] = number*i;
			j++;
		}
		
		// Displaying the output
		for(int i=0;i<4;i++){
			System.out.println(number+"*"+(i+1)+" = " +multiplicationResult[i]);
		}
	}
}