import java.util.Scanner;
public class TicketBooking{
	
	//this have the option cinema
	static String[][] bookingData = {
			{"Action", "Comedy", "Drama", "Horror", "Romance", "Fantasy", "Thriller", "Animation", "Musical", "Documentary", "Crime", "Adventure"},
			{"Gold","Silver"},
			{"sweet popcorn","salt popcorn","chocolate bars","hot dogs","pizza","fruit"}
	};
	
	//this will store show the Available seat or not
	static String[] seatList = {"Available","Available","Available","Available","Available","Available","Available","Available","Available","Available"};
	
	//this will store the booked ticket
	static String[][] bookedTicket = new String[10][3];
	
	static int remainSeat = 10;
	static int idx = 0;
	
	public static void main(String args[]){
		//Scanner class to take input from user
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("\n---------------Choose Option--------------");
			System.out.println("For show all seat-> enter 'S' : ");
			System.out.println("For Book Ticket-> enter 'B' : ");
			System.out.println("For View Booked -> press 'V' :");
			System.out.println("For exit ticket booking-> press 'E' :");
			System.out.println("--------------------------------------------");
			
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
			
			//switch will work
			switch(c){
				case 'S':
					//call showAllSeat method
					showAllSeat();
					break;
				case 'B':
					//call the method to show all moive type 
					showMoiveType();
					//call the book Ticket method
					System.out.println("|-------------------------------------------|");
					System.out.println("Choose Moive Type-> please enter number: ");
					System.out.println("|-------------------------------------------|");
					int mType = sc.nextInt();
					
					//call the showSeatType method
					showSeatType();
					System.out.println("|-------------------------------------------|");
					System.out.println("Choose Seat Type-> please enter number: ");
					System.out.println("|-------------------------------------------|");
					int sType = sc.nextInt();
					
					//call the showSnackType method
					showSnackType();
					System.out.println("|-------------------------------------------|");
					System.out.println("Choose Snack Type-> please enter number: ");
					System.out.println("|-------------------------------------------|");
					int snType = sc.nextInt();
					//call the method to book the ticket
					bookTicket(mType,sType,snType);
					break;
				case 'V':
					//call the viewBookedTicket method
					viewBookedTicket();
					break;
				default:
					System.out.println("Invalid input! ");
			}
		}
		
	}
	
	//method to show the movie type option -
	public static void showMoiveType(){
		//it will start - [0][i] row -> 0 and col -> 12
		System.out.println("\n-----------Here Movie Types-----------");
		for(int i=0;i<12;i++){
			System.out.println((i+1)+"-> "+bookingData[0][i]);
		}
	}
	//method to show the seat type option -
	public static void showSeatType(){
		//it will start - [1][i] row -> 1 and col -> 2
		System.out.println("\n-----------Here Seat Types-----------");
		for(int i=0;i<2;i++){
			System.out.println((i+1)+"-> "+bookingData[1][i]);
		}
	}
	//method to show the snack type option -
	public static void showSnackType(){
		//it will start - [2][i] row -> 2 and col -> 6
		System.out.println("\n-----------Here Snack Types-----------");
		for(int i=0;i<6;i++){
			System.out.println((i+1)+"-> "+bookingData[2][i]);
		}
	}
	
	//method to show all the seat-
	public static void showAllSeat(){
		System.out.println("-------------------------------------------");
		System.out.println("Seat No.\t\tSeat Status");
		for(int i=0;i<10;i++){
			System.out.println((i+1)+"\t\t\t"+seatList[i]);
		}
		System.out.println("-------------------------------------------");		
	}
	
	//this method solve the ticket book seat
	public static void bookTicket(int mType, int sType, int snType){
		remainSeat-=1;
		
		bookedTicket[idx][0] = bookingData[0][mType-1];
		bookedTicket[idx][1] = bookingData[1][sType-1];
		bookedTicket[idx][2] = bookingData[2][snType-1];
		idx+=1;
		
		System.out.println("--------------------------");
		System.out.println("Ticket Booked Successfull.");
		System.out.println("--------------------------");
	}
	
	//this method show viewBookedTicket
	public static void viewBookedTicket(){
		System.out.println("-------------------------------------------");
		System.out.println("Moive Type\t\tSeat Type\t\tSnack Type");
		for(int i=0;i<10;i++){
			System.out.println(bookedTicket[i][1]+"\t\t\t"+bookedTicket[i][1]+"\t\t\t"+bookedTicket[i][2]);
		}
		System.out.println("-------------------------------------------");	
	}
}