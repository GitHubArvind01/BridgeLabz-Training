import java.util.Scanner;
//Create FindFirstAndSecondLargestPart2 Class to compute the largest and second largest elements in the array
public class FindFirstAndSecondLargestPart2{
	
	public static void main (String args[]){
		// Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
		
		//taking the size of array 
		System.out.println("Enter the number: ");
		long number = sc.nextLong();
		
		long maxDigit = 10;
		
		//creating array name of digit that store the number digit
		long digits[] = new long[10];
		long temp[];
		// computing the digit into array
		int index = 0;
		while(number>0){
			long t = number%10;
			if(index==maxDigit){
				temp = digits;
				digits = new long[temp.length*2];
				for(int i =0;i<index;i++){
					digits[i] = temp[i];
				}
			}
			digits[index++] = t;
			number/=10;
		}
		
		//Computing the firts largets number in digits array
		long firstMax = Integer.MIN_VALUE;
		int idx = 0;
		for(int i=0;i<maxDigit;i++){
			if(digits[i]>=firstMax){
				firstMax = digits[i];
				idx = i;
			}
		}
		
		//Computing the second largest number 
		long secondMax = Integer.MIN_VALUE;
		for(int i=0;i<maxDigit;i++){
			if(i!=idx && digits[i]>=secondMax){
				secondMax = digits[i];
				secondMax = digits[i];
			}
		}
		
		
		//Displaying the first largest and second largest number
		System.out.println("First largst : " + firstMax +"\nSecond largest : " + secondMax);
		
	}
}