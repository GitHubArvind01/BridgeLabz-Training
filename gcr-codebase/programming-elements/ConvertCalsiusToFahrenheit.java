import java.util.*;
public class ConvertCalsiusToFahrenheit{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in calsius: ");
		double calsius = sc.nextDouble();
		
		double fahrenheit = (calsius*9/5) + 32;
		System.out.println(fahrenheit);
	}
}