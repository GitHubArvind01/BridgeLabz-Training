import java.util.*;
public class ConvertKilometersToMiles{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the kilometers: ");
		int kilometers = sc.nextInt();
		
		
		double miles = kilometers*0.621371;

		System.out.println(miles);

	}
}