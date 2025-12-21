import java.util.Scanner;
import java.lang.Math;
//Create FindFactorsOfNumber Class the factors of number and store in the array
public class FindFactorsOfNumber{
	public static void main (String args[]){
		
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Taking input as trangle side from user
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		//calling function countFactors 
		int cntFactors = countFactors(number);
		
		//creating factors array to store the factors callback function
		int factorsArray[] = new int[cntFactors];
		
		//calling function computeFactors
		factorsArray = computeFactors(number,cntFactors);
		
		//calling function computeSumOfFactors
		int factorsSum = computeSumOfFactors(factorsArray);
		
		//calling function computeProductOfFactors
		long productFactors = computeProductOfFactors(factorsArray);
		
		//calling function computeSquareOfFactors
		long sumOfSquareFactors = computeSquareOfFactors(factorsArray);
		
		//Displaying the ouput 
		for(int i=0;i<cntFactors;i++){
			System.out.println("Factors of "+number+" is: "+factorsArray[i] + " ");
		}
		
		System.out.println("Sum of factors: " + factorsSum);
		System.out.println("Product of factors: "+ productFactors);
		System.out.println("Sum of Square factors: " + sumOfSquareFactors);
		
	}
	//This method compute Factors count
	public static int countFactors(int n){
		int count = 0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				count+=1;
			}
		}
		return count;
	}
	
	//This method compute Factors of the number
	public static int[] computeFactors(int n, int length){
		int factorsArray[] = new int[length];
		int idx = 0;
		for(int i=1;i<=n;i++){
			if(n%i==0){
				factorsArray[idx] = i;
				idx +=1;
			}
		}
		return factorsArray;
	}
	
	//This method find the sum of factors
	public static int computeSumOfFactors(int factorsArray[]){
		int factorsSum = 0;
		for(int i=0;i<factorsArray.length;i++){
			factorsSum+=factorsArray[i];
		}
		return factorsSum;
	}
	
	//This method find the product of factors
	public static long computeProductOfFactors(int factorsArray[]){
		long productFactors = 1;
		for(int i=0;i<factorsArray.length;i++){
			productFactors*=factorsArray[i];
		}
		return productFactors;
	}	
	
	//This method find the square of factors
	public static long computeSquareOfFactors(int factorsArray[]){
		//find the square of each factor and then sum of them all and return 
		long sumOfSquareFactors = 0;
		for(int i=0;i<factorsArray.length;i++){
			sumOfSquareFactors+=(factorsArray[i]*factorsArray[i]);
		}
		return sumOfSquareFactors;
	}
}