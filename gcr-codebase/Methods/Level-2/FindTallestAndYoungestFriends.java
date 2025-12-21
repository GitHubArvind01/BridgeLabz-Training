import java.util.Scanner;
//Create FindTallestAndYoungestFriends  Class to check friends tallest and youngest
public class FindTallestAndYoungestFriends {
	public static void main (String args[]){
		
		// Creating Scanner object to take input from user
		Scanner sc = new Scanner(System.in);
		
		//creating array that to store three friends age and heights
		int age[] = new int[3];
		int heights[] = new int[3];
		
		//Taking input as age from user
		System.out.println("Enter amar age: ");
		age[0] = sc.nextInt();
		
		System.out.println("Enter akbar age: ");
		age[1] = sc.nextInt();
		
		System.out.println("Enter anthoney age: ");
		age[2] = sc.nextInt();
		
		System.out.println("Enter amar heights: ");
		heights[0] = sc.nextInt();

		System.out.println("Enter akbar heights: ");
		heights[1] = sc.nextInt();

		System.out.println("Enter anthoney heights: ");
		heights[2] = sc.nextInt();	
		
		//callinig funtion 
		findYoungestfriends(age);
		findTallestfriends(heights);
	}
	public static void findYoungestfriends(int age[]){
		if(age[0]>=age[1] && age[0]>=age[2]){
			System.out.println("Youngest friends amar!");
		}
		if(age[1]>=age[0] && age[1]>=age[2]){
			System.out.println("Youngest friends akbar!");
		}
		if(age[2]>=age[0] && age[2]>=age[1]){
			System.out.println("Youngest friends anthoney!");
		}
	}
	public static void findTallestfriends(int heights[]){
		if(heights[0]>=heights[1] && heights[0]>=heights[2]){
			System.out.println("Tallest friends amar!");
		}
		if(heights[1]>=heights[0] && heights[1]>=heights[2]){
			System.out.println("Tallest friends akbar!");
		}
		if(heights[2]>=heights[0] && heights[2]>=heights[1]){
			System.out.println("Tallest friends anthoney!");
		}
	}
}
