import java.util.Scanner;
//Create ConvertMultiDimensionalArrayIntoSingleDimensionalArray Class to compute multiplication table
public class ConvertMultiDimensionalArrayIntoSingleDimensionalArray{
	public static void main (String args[]){
	
		// Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
		
		// Taking number as input
		
		System.out.println("Enter the row: ");
		int row = sc.nextInt();

		System.out.println("Enter the col: ");
		int col = sc.nextInt();
		
		//creating 2D array
		int multiArray[][] = new int[row][col];
		
		//Taking elements
		System.out.println("Enter the " + (row*col) + " elements : ");
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				multiArray[i][j] = sc.nextInt();
			}
		}
		
		//creating array that store the store multiArray elements
		int singleArray[] = new int[row*col];
		
		//copying the 2D array elemnts into single array
		int k = 0;
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				singleArray[k++] = multiArray[i][j];
			}
		}
		
		// Displaying the output
		
	}
}