import java.util.Scanner;
//Create FindMeanHeightPlayer Class to compute the mean height of player
public class FindMeanHeightPlayer{
	public static void main (String args[]){
	
		// Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
		
		// Taking number as input
		double playerHeights[] = new double[11];
		for(int i=0;i<11;i++){
			System.out.println("Enter the height of " + (i+1) + " player: ");
			playerHeights[i] = sc.nextDouble();
		}
		
		//computing the mean height
		double sumOfHeight = 0.0;
		for(int i=0;i<11;i++){
			sumOfHeight+=playerHeights[i];
		}
		
		// Displaying the output
		System.out.println("Mean height of player : "+sumOfHeight/11);
	}
}