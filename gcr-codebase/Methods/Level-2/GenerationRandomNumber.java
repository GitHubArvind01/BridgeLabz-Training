import java.util.Scanner;
//Create NumberCheck  Class that generates five 4 digit random values and perform operations
public class GenerationRandomNumber{
	static int size;
	public static void main(String args[]) { 
	
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Taking input of size from user
		System.out.println("Enter the size: ");
		size = sc.nextInt();
		
		//calling function generate4DigitRandomArray
		int nums[] = generate4DigitRandomArray(size);
		
		//calling another function findAverageMinMax
		double result[] = findAverageMinMax(nums);
		
		// Displaying random numbers with operations
		System.out.println("Average is : " + result[0] + ", min value is " + result[1] + ", max value is " + result[2]);
	}
	
	// Writing a method to generates five 4 digit random values
	public static int[] generate4DigitRandomArray(int size) {
		int arr[] = new int[size];
		
		for(int i=0;i<size;i++){
			arr[i] = (int)(Math.random() * 10000);
		}
		// Printing random numbers
		for(int i=0; i<size; i++) {
			System.out.println("Random number " + arr[i]);
		}
		return arr;
	}
	
	// Calculate average, min, and max value
	public static double[] findAverageMinMax(int numbers[]) {
		double []result = new double[3];
		
		
		// Calculating sum, min, and max value
		int sum = 0, min = 10000, max = 0;
		for(int num : numbers) {
			sum += num;
			
			if(num < min) min = num;
			if(num > max) max = num;
		}
		
		// Calculating average of the random numbers
		double average = sum / numbers.length;
		
		result[0] = average;
		result[1] = min;
		result[2] = max;
		
		return result;
	}
}