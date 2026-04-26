import java.util.Scanner;
//Create ComputeFrequencyDigit Class to compute the frequency of each digit and store in array and print
public class ComputeFrequencyDigit{
	public static void main (String args[]){
		
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Creating array and size of array
		System.out.println("Enter the number: ");
		long number = sc.nextLong();
	
	
		//creating the array to store each digit frequency
		int freqArray[] = new int[10];
		
		//computing the digit frequency
		while(number!=0){
			int temp = (int)number%10;
			freqArray[temp]++;
			number/=10;
		}
		
		//Displaying the ouput 
		for(int i =0;i<10;i++){
			System.out.println("Number: " + i +" Frequency : " +freqArray[i]);
		}
	}
}