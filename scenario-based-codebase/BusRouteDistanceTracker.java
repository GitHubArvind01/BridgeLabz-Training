import java.util.Scanner;

public class BusRouteDistanceTracker{
	static Scanner sc = new Scanner(System.in);
	static String[] routes = {"Piplani","Indrepuri","Bhopal","MP Nagar","Pathani","New market"};
	static double[] ranges = {12,15,90,120,150,190};
	static int count = 1;
	
	public static void main(String args[]){
		while(true){
			System.out.println("\n---------------Your are Travlling On BUS--------------");

			System.out.println("You reached "+routes[count-1]);
			System.out.println("Want to stop travlling -> enter 'Y' ");
			System.out.println("Want to stop travlling -> enter 'N' ");
			
			char c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			
			count+=1;
			
			if(c=='Y'){
				break;
			}
			else if(c=='N'){
				continue;
			}
			else{
				System.out.println("Invalid input!");
			}
		}
		
		System.out.println("Total Travelled price: "+(ranges[count])*5);
	}
	
}