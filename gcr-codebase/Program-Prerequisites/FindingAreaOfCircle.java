import java.util.*;
public class FindingAreaOfCircle{
	static final double pi = 3.14;
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		int radius = sc.nextInt();
		double area = pi * (radius*radius);
		System.out.println(area);
	}
}