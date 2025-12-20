import java.util.Scanner;
//Create FindFirstAndSecondLargest Class to compute the largest and second largest elements in the array
public class FindFirstAndSecondLargest{
	public static void main (String args[]){
		// Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
		
		//taking the size of array 
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		
		//creating array name of number that store size of elements
		int number[] = new int[size];
		
		// Taking number as input
		System.out.println("Enter the " + size + " elements: ");
		for(int i=0;i<size;i++){
			number[i] = sc.nextInt();
		}
		
		//Computing the firts largets number 
		int firstMax = Integer.MIN_VALUE;
		int idx = 0;
		for(int i=0;i<size;i++){
			if(number[i]>=firstMax){
				firstMax = number[i];
				idx = i;
			}
		}
		
		//Computing the second largest number 
		int secondMax = Integer.MIN_VALUE;
		for(int i=0;i<size;i++){
			if(i!=idx && number[i]>=secondMax){
				secondMax = number[i];
			}
		}
		
		
		//Displaying the first largest and second largest number
		System.out.println("First largst : " + firstMax +"\nSecond largest : " + secondMax);
		
	}
}