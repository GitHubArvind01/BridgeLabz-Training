import java.util.Scanner;
public class FindPerimeterOfRectangle{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Length: ");
		int length = sc.nextInt();
		
		System.out.println("Enter the Width: ");
		int width = sc.nextInt();
		
		int perimeter = 2*(length+width);
		
		System.out.println(perimeter);

	}
}