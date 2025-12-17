import java.util.Scanner;
public class AreaOfTrangle{
	public static void main (String args[]){
		
		//Here Scanner object created to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Taking height as input from user
		System.out.println("Enter the base in cm: ");
		int base = sc.nextInt();
		
		System.out.println("Enter the height in cm: ");
		int height = sc.nextInt();
		
		double area_of_trangle = 0.5*base*height;
		
		//Displaying the output
		System.out.println("The Area of the triangle in sq in is "+ (area_of_trangle/2.54) +" and sq cm is "+area_of_trangle);
	}
}