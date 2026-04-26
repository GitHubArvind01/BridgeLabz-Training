import java.util.*;
public class FindingVolumeOfCylinder{
	static final double pi = 3.14;
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius: ");
		int radius = sc.nextInt();
		
		System.out.println("Enter the height: " );
		double height = sc.nextDouble();
		
		double Volume = pi * ((radius*radius) * height);
		System.out.println(Volume);
	}
}