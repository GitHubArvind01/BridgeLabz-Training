import java.util.Scanner;
//Create FindYoungestFriends Class to compute the youngest friends
public class FindYoungestFriends{
	public static void main (String args[]){
		// Creating Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
		
		// Taking number as input
		System.out.println("Enter the age of Amar: ");
		int amarAge = sc.nextInt();
		
		System.out.println("Enter the height of Amar: ");
		double amarHeight = sc.nextDouble();

		System.out.println("Enter the age of Akbar: ");
		int akbarAge = sc.nextInt();
		
		System.out.println("Enter the height of Akbar: ");
		double akbarHeight = sc.nextDouble();

		System.out.println("Enter the age of Anthony: ");
		int anthonyAge = sc.nextInt();
		
		System.out.println("Enter the height of Anthony: ");
		double anthonyHeight = sc.nextDouble();		
		
		//Computing and Displaying the ouput by age
		if(amarAge>=akbarAge && amarAge>=anthonyAge){
			System.out.println("Youngest friend : Amar");
		}
		if(akbarAge>=amarAge && akbarAge>=anthonyAge){
			System.out.println("Youngest friend : Akbar");
		}		
		if(anthonyAge>=amarAge && anthonyAge>=akbarAge){
			System.out.println("Youngest friend : Anthony");
		}		
		
		
		//Computing and Displaying the ouput by height
		if(amarHeight>=akbarHeight && amarHeight>=anthonyHeight){
			System.out.println("Tallest friend : Amar");
		}
		if(akbarHeight>=amarHeight && akbarHeight>=anthonyHeight){
			System.out.println("Youngest Tallest : Akbar");
		}		
		if(anthonyHeight>=amarHeight && anthonyHeight>=akbarHeight){
			System.out.println("Youngest Tallest : Anthony");
		}		
		
	}
}