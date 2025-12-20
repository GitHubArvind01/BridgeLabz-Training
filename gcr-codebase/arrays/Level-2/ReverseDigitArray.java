import java.util.Scanner;
//Create ReverseDigitArray Class to compute the number digit count then sotre in array then reverse print
public class ReverseDigitArray{
	
	public static void main (String args[]){
		// Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
		
		//taking the size of array 
		System.out.println("Enter the number: ");
		long number = sc.nextLong();
				
		//computing the count digit of number 
		int digitCount = 0;
		long temp = number;
		while(temp!=0){
			digitCount+=1;
			temp/=10;
		}
		
		//creating array name of digitsArray that store the digits of number in reverse 
		long digitsArray[] = new long[digitCount];
		
		// computing the digit into array into reverse order
		int index = 0;
		while(number>0){
			digitsArray[index++] = number%10;
			number/=10;
		}
		
		//Displaying the reverse digitsArray
		System.out.println("Reversed digit array: );
		for(int i=0;i<digitCount;i++){
			System.out.println(digitsArray[i] + " ");
		}		
	}
}