import java.util.Scanner;
//Create FindSmallestAndLargestNumber Class to compute the natural number sum
public class FindSmallestAndLargestNumber{
	public static void main (String args[]){
		
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Taking input as number from user
		System.out.println("Enter the first positive number: ");
		int firstNumber = sc.nextInt();

		System.out.println("Enter the second positive number: ");
		int secondNumber = sc.nextInt();

		System.out.println("Enter the third positive number: ");
		int thirdNumber = sc.nextInt();	
		
		//sotring the result of function callback
		int ans[] = new int[2];
		ans = computeSum(firstNumber, secondNumber, thirdNumber);
		
		//Displaying the ouput 
		System.out.println("Smallest Number:  " + ans[0] + "\nLargest Number : " + ans[1]);
	}
	public static int[] computeSum(int n1, int n2, int n3){
		int min = n1;
		int max = n1;
		
		//for max value
		if(n2>=n1){
			max = n2;
		}
		if(n3>=max){
			max = n3;
		}
		
		//for min value
		if(n2<=min){
			min = n2;
		}
		if(n3<=min){
			min = n3;
		}		
		return new int[]{min,max};
	}
}