import java.util.Scanner;
import java.util.Random;

//Create FindHeightOfPlayers Class the factors of number and store in the array
public class FindHeightOfPlayers{
	public static void main (String args[]){
		
		//creating height array to store the 11 players height
		int height[] = new int[11];
		Random random = new Random();
		
		//generating the height of random player with three digit
		System.out.println("Player height in cm : ");
		for(int i=0;i<height.length;i++){
			height[i] = random.nextInt(101)+150;
			System.out.println(height[i] + " ");
		}
		
		//calling function and displaying the output
		System.out.println("\n\nResults: ");
		System.out.println("Sum of heights: " + findSum(height));
		System.out.println("Mean of height: "+ findMeanHeight(height));
		System.out.println("Shortest heights: " + findShortestHeight(height));
		System.out.println("Tallest heights: " + findTallestHeight(height));
		
	}
	//This method compute the sum of elements
	public static int findSum(int height[]){
		int sum = 0;
		for(int i=0;i<height.length;i++){
			sum+=height[i];
		}
		return sum;
	}
	
	//This method find the mean height of player
	public static int findMeanHeight(int height[]){
		return findSum(height)/11;
	}
	
	//This method find the shorteset height of player
	public static int findShortestHeight(int height[]){
		int minHeight = Integer.MAX_VALUE;
		for(int i=0;i<height.length;i++){
			if(height[i]<=minHeight){
				minHeight = height[i];
			}
		}
		return minHeight;
	}
	
	//This method find the tallest height of the player
	public static int findTallestHeight(int height[]){
		int maxHeight = Integer.MIN_VALUE;
		for(int i=0;i<height.length;i++){
			if(height[i]>=maxHeight){
				maxHeight = height[i];
			}
		}
		return maxHeight;
	}	
}