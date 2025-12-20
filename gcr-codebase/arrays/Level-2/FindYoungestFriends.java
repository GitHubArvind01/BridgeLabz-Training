import java.util.Scanner;
//Create FindYoungestFriends Class to compute the youngest friends
public class FindYoungestFriends{
	public static void main (String args[]){
		// Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
		
		//creating array name of age to store three friends age
		int age[] = new int[3];

		//creating array name of height to store three friends height
		double height[] = new double[3];

		
		// Taking number as input
		System.out.println("Enter the age of Amar: ");
		age[0] = sc.nextInt();
		
		System.out.println("Enter the height of Amar: ");
		height[0] = sc.nextDouble();

		System.out.println("Enter the age of Akbar: ");
		age[1] = sc.nextInt();
		
		System.out.println("Enter the height of Akbar: ");
		height[1] = sc.nextDouble();

		System.out.println("Enter the age of Anthony: ");
		age[2] = sc.nextInt();
		
		System.out.println("Enter the height of Anthony: ");
		height[2] = sc.nextDouble();		
		
		//Computing and Displaying the ouput by age
		if(age[0]>=age[1] && age[0]>=age[2]){
			System.out.println("Youngest friend : Amar");
		}
		if(age[1]>=age[0] && age[1]>=age[2]){
			System.out.println("Youngest friend : Akbar");
		}		
		if(age[2]>=age[0] && age[2]>=age[1]){
			System.out.println("Youngest friend : Anthony");
		}		
		
		
		//Computing and Displaying the ouput by height
		if(height[0]>=height[1] && height[0]>=height[2]){
			System.out.println("Tallest friend : Amar");
		}
		if(height[1]>=height[0] && height[1]>=height[2]){
			System.out.println("Youngest Tallest : Akbar");
		}		
		if(height[2]>=height[0] && height[2]>=height[1]){
			System.out.println("Youngest Tallest : Anthony");
		}		
		
	}
}