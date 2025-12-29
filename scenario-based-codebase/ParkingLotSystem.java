import java.util.*;
public class ParkingLotSystem{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int occupancy = 10;
		while(true){
			System.out.println("\n---------Choose Options----------");
			System.out.println("CAR Park-> 'C': ");
			System.out.println("TRUCK Park-> 'T': ");
			System.out.println("BIKE Park-> 'B': ");
			System.out.println("For CAR Exit-> '1': ");
			System.out.println("For TRUCK Exit-> '2': ");
			System.out.println("For BIKE Exit-> '3': ");
			System.out.println("Show Occupancy-> 'O': ");
			System.out.println("-----------------------------------");
			
			char c = sc.next().charAt(0);
			
			if(occupancy==0){
				System.out.println("-------------------------");
				System.out.println("Parking lot full!");
				System.out.println("-------------------------");
				break;
			}
			switch(c){
				case 'C':
					System.out.println("-------------------------");
					System.out.println("Your CAR parked.");
					System.out.println("-------------------------");
					occupancy-=1;
					break;
				case 'T':
					System.out.println("-------------------------");
					System.out.println("Your TRUCK parked.");
					System.out.println("-------------------------");
					occupancy-=1;
					break;
				case 'B':
					System.out.println("-------------------------");
					System.out.println("Your BIKE parked.");
					System.out.println("-------------------------");
					occupancy-=1;
					break;
				case '1':
					if(occupancy==10){
						System.err.println("-------------------------");
						System.out.println("Error! Parking lot empty, can't Exit CAR!");
						System.err.println("-------------------------");
					}
					else{
						System.out.println("-------------------------");
						System.out.println("CAR Exit!");
						System.out.println("-------------------------");
						occupancy+=1;
					}
					break;
				case '2':
					if(occupancy==10){
						System.err.println("-------------------------");
						System.out.println("Error! Parking lot empty, can't TRUCK CAR!");
						System.err.println("-------------------------");
					}
					else{
						System.out.println("-------------------------");
						System.out.println("TRUCK Exit!");
						System.out.println("-------------------------");
						occupancy+=1;
					}
					break;
				case '3':
					if(occupancy==10){
						System.err.println("-------------------------");
						System.out.println("Error! Parking lot empty, can't Exit BIKE!");
						System.err.println("-------------------------");
					}
					else{
						System.out.println("-------------------------");
						System.out.println("BIKE Exit!");
						System.out.println("-------------------------");
						occupancy+=1;
					}
					break;
				case 'O':
					System.out.println("-------------------------");
					System.out.println("Current Occupancy: " + occupancy);
					System.out.println("-------------------------");
					break;
				default:
					System.out.println("-------------------------");
					System.out.println("Wrong input!");
					System.out.println("-------------------------");
			}
		}
	}
}