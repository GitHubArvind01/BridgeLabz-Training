import java.util.Scanner;
//Create MultiplicationNumber Class to compute the multiplication
public class MultiplicationNumber{
	public static void main (String args[]){
		
		// Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
		
		//Taking input as number
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		//creating the array age of size 10 stored the multiplication of number 
		int multiplicationArray[] = new int[10];
		
		//Taking age as input from user
		for(int i=0;i<10;i++){
			multiplicationArray[i] = num*(i+1);
		}		

		//Displaying the ouptut
		for(int i=0;i<10;i++){
			System.out.println(num+" * "+(i+1)+ " = " + multiplicationArray[i]);
		}
	}
}