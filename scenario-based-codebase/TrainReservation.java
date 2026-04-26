import java.util.Scanner;

public class TrainReservation{
	static String[] ticketList = {"Available","Available","Available","Available","Available","Available","Available","Available","Available","Available"};
	static int remainSeat = 10;
	public static void main(String args[]){
		//scanner object to take input
		Scanner sc = new Scanner(System.in);
		
		
		while(true){
			System.out.println("\n---------------Choose Option--------------");
			System.out.println("For show all seat-> enter 'S' : ");
			System.out.println("For Book seat-> enter 'B' : ");
			System.out.println("For exit ticket booking-> press 'E' :");
			System.out.println("------------------------------------------");
			
			char c = sc.next().charAt(0);
			c = Character.toUpperCase(c);
			if(remainSeat==0){
				System.out.println("----------Sorry! Seat Not Available-----------");
				break;
			}
			if(c=='E'){
				System.out.println("Thanks for use our service! Please come again");
				break;
			}
			switch(c){
				case 'S':
					//call showAllSeat method
					showAllSeat();
					break;
				case 'B':
					//call the bookTicket method
					System.out.println("|-------------------------------------------|");
					System.out.println("For Booking Seat please enter seat number: ");
					System.out.println("|-------------------------------------------|");
					int idx = sc.nextInt();
					bookTicket(idx);
					break;
				default:
					System.out.println("Invalid input! ");
			}
		}
	}
	
	//method to show all the seat-
	public static void showAllSeat(){
		System.out.println("-------------------------------------------");
		System.out.println("Seat No.\t\tSeat Status");
		for(int i=0;i<10;i++){
			System.out.println((i+1)+"\t\t\t"+ticketList[i]);
		}
		System.out.println("-------------------------------------------");		
	}
	
	//method to book seat number
	public static void bookTicket(int idx){
		if(idx<0 || idx>10){
			System.out.println("Invalid! Please Enter the vaild Seaet number!");
		}
		else if(ticketList[idx-1].equals("Unavailable")){
			System.out.println("Invalid! Please Enter the vaild Seaet number!");
		}
		else{
			ticketList[idx-1] = "Unavailable";
			remainSeat-=1;
			System.out.println("<----------------------------------------->");
			System.out.println("Seat No. "+idx+" Booked Successfull!");
			System.out.println("<----------------------------------------->");
		}
	}
}