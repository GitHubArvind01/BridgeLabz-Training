import java.util.Scanner;
public class CalculateSimpleInterest{
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the principle: ");
		int principle = sc.nextInt();
		
		System.out.println("Enter the rate of interest : ");
		double rate = sc.nextDouble();
		
		System.out.println("Enter the time for interest: ");
		int time = sc.nextInt();
		
		double simpleInterest = (principle * rate * time) / 100;
		
		System.out.println(simpleInterest);

	}
}