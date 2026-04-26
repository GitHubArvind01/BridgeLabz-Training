import java.util.Scanner;
public class ConvertHeightIntoFeetandInches{
	public static void main (String args[]){
		
		//Here Scanner object created to take input from user
		Scanner sc = new Scanner(System.in);
		
		//Taking height as input from user
		System.out.println("Enter your height in CM: ");
		int height = sc.nextInt();
		
		//Here we convert height cm into feet
		double height_Feet = height/30.48;
		
		//Here we convert height cm into inches
		double height_Inches = height/2.54;
		
		System.out.println("Your Height in cm is "+ height +" while in feet is "+ height_Feet +" and inches is "+ height_Inches);
	}
}