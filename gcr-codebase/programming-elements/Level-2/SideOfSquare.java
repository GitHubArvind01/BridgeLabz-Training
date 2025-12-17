import java.util.Scanner;
public class SideOfSquare{
	public static void main (String args[]){
		
		//Here Scanner object created to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Taking height as input from user
		System.out.println("Enter the parameter: ");
		int parameter = sc.nextInt();
		
		//calculating the side of parameter
		int side = 4*(parameter);
		
		//Displaying the output
		System.out.println("The length of the side is "+ side +" whose perimeter is "+parameter);
	}
}