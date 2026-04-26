import java.util.*;
public class ParkingLotSystem{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int occupancy = 10;
		int bikePark = 0;
		int carPark = 0;
		int truckPark = 0;
		
		while(true){
			if(occupancy==0){
				System.out.println("-------------------------");
				System.out.println("Parking lot full!");
				System.out.println("-------------------------");
				break;
			}
			System.out.println("\n---------Choose Options----------");
			System.out.println("For Park-> 'P': ");
			System.out.println("For Exit-> 'E': ");
			System.out.println("Show Occupancy-> 'O': ");
			System.out.println("-----------------------------------");
			
			char c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			
			if(c=='P'){
				System.out.println("\n---------Choose Type of Vehicle for Park----------");
				System.out.println("CAR Park-> 'C': ");
				System.out.println("TRUCK Park-> 'T': ");
				System.out.println("BIKE Park-> 'B': ");
				System.out.println("-----------------------------------------------------");
				c = sc.next().charAt(0);
				c = Character.toUpperCase(c);
			}
			if(c=='E'){
				System.out.println("\n---------Choose Type of Vehicle for Exit----------");
				System.out.println("For CAR Exit-> '1': ");
				System.out.println("For TRUCK Exit-> '2': ");
				System.out.println("For BIKE Exit-> '3': ");
				System.out.println("-----------------------------------------------------");
				c = sc.next().charAt(0);
				c = Character.toUpperCase(c);
			}
	
			switch(c){
				case 'C':
					System.out.println("-------------------------");
					System.out.println("Your CAR parked.");
					System.out.println("-------------------------");
					occupancy-=1;
					carPark+=1;
					break;
				case 'T':
					System.out.println("-------------------------");
					System.out.println("Your TRUCK parked.");
					System.out.println("-------------------------");
					occupancy-=1;
					truckPark+=1;
					break;
				case 'B':
					System.out.println("-------------------------");
					System.out.println("Your BIKE parked.");
					System.out.println("-------------------------");
					occupancy-=1;
					bikePark+=1;
					break;
				case '1':
					if(occupancy==10){
						System.err.println("-------------------Error-----------------");
						System.out.println("Sorry! Parking lot empty, can't Exit CAR!");
						System.err.println("-----------------------------------------");
					}
					else{
						if(carPark>0){
							System.out.println("-------------------------");
							System.out.println("CAR Exit!");
							System.out.println("-------------------------");
							occupancy+=1;
							carPark-=1;
						}
						else{
							System.err.println("-------------------Error-----------------");
							System.out.println("Sorry! CAR haven't Park yet!");
							System.out.println("-----------------------------------------");
						}
					}
					break;
				case '2':
					if(occupancy==10){
						System.err.println("-------------------------");
						System.out.println("Error! Parking lot empty, can't TRUCK CAR!");
						System.err.println("-------------------------");
					}
					else{
						if(truckPark>0){
							System.out.println("-------------------------");
							System.out.println("TRUCK Exit!");
							System.out.println("-------------------------");
							occupancy+=1;
							truckPark-=1;
						}
						else{
							System.err.println("-------------------Error-----------------");
							System.out.println("Sorry! TRUCK haven't Park yet!");
							System.out.println("-----------------------------------------");
						}
					}
					break;
				case '3':
					if(occupancy==10){
						System.err.println("-------------------Error------------------");
						System.out.println("Error! Parking lot empty, can't Exit BIKE!");
						System.err.println("------------------------------------------");
					}
					else{
						if(bikePark>0){
							System.out.println("-------------------------");
							System.out.println("BIKE Exit!");
							System.out.println("-------------------------");
							occupancy+=1;
							bikePark-=1;
						}
						else{
							System.err.println("-------------------Error-----------------");
							System.out.println("Sorry! BIKE haven't Park yet!");
							System.out.println("-----------------------------------------");
						}
					}
					break;
				case 'O':
					System.out.println("-------------------------");
					System.out.println("Current Occupancy: " + occupancy);
					System.out.println("-------------------------");
					break;
				default:
					System.err.println("------------Error-----------");
					System.out.println("Wrong input!");
					System.out.println("-------------------------");
			}
		}
	}
}