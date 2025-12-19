import java.util.Scanner;
//Create MultiplicationNumber Class to compute the multiplication
public class MultiplicationNumber{
	public static void main (String args[]){
		
		// Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
		
		//creating the array age of size 10 stored the multiplication of number 
		int number[] = new int[10];
		
		//Taking input and computing the number sum if they are not zero and negative
		int numberSum = 0;
		int i=0;
		while(true){
			System.out.println("Enter the number : ");
			number[i] = sc.nextInt();
			if(number[i]==0 || number[i]<0){
				break;
			}else{
				numberSum+=number[i];
			}
		}
		

		//Displaying the ouptut
		System.out.println("The sum of total number: "+ numberSum);
	}
}